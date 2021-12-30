/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author cma
 */
enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    @Override
    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }

}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    @Override
    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }

}

interface TreeVis {

    public int getResult();

    public void visitNode(TreeNode node);

    public void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor implements TreeVis {

    private int result = 0;

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void visitNode(TreeNode node) {
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor implements TreeVis {
    private long result = 1;
    private final int mo = 1000000007;

    @Override
    public int getResult() {
        return (int)result;
    }

    @Override
    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            result = (result * node.getValue()) % mo;
        }
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            result = (result * leaf.getValue()) % mo;
        }
    }
}

class FancyVisitor implements TreeVis {
    private int nonLeafEvenDepth = 0;
    private int greenLeaf = 0;

    @Override
    public int getResult() {
        return Math.abs(nonLeafEvenDepth - greenLeaf);
    }

    @Override
    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            nonLeafEvenDepth += node.getValue();
        }
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            greenLeaf += leaf.getValue();
        }
    }
}

public class LatJavaVisitorPattern {

    private static int nodeValues[];
    private static Color nodeColor[];
    private static HashMap<Integer, HashSet<Integer>> nodeMap = new HashMap<>();

    public static void main(String[] args) {
        Tree root = solve();
	SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      	FancyVisitor vis3 = new FancyVisitor();

      	root.accept(vis1);
      	root.accept(vis2);
      	root.accept(vis3);

      	int res1 = vis1.getResult();
      	int res2 = vis2.getResult();
      	int res3 = vis3.getResult();

      	System.out.println(res1);
     	System.out.println(res2);
    	System.out.println(res3);        
    }
    
    private static Tree solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //input list of nodes
        nodeValues = new int[n];
        for (int i = 0; i < n; i++) {
            nodeValues[i] = sc.nextInt();
        }
        //input list of color
        nodeColor = new Color[n];
        for (int i = 0; i < n; i++) {
            nodeColor[i] = (sc.nextInt() == 0) ? Color.RED : Color.GREEN;
        }

        //input list n-1 of edges
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            /* Edges are undirected: Add 1st direction */
            HashSet<Integer> uEdges = nodeMap.get(u);
            if (uEdges == null) {
                uEdges = new HashSet<>();
            }
            uEdges.add(v);
            nodeMap.put(u, uEdges);

            /* Edges are undirected: Add 2nd direction */
            HashSet<Integer> vEdges = nodeMap.get(v);
            if (vEdges == null) {
                vEdges = new HashSet<>();
            }
            vEdges.add(u);
            nodeMap.put(v, vEdges);
        }
        sc.close();

        if (n == 1) {
           return new TreeLeaf(nodeValues[0], nodeColor[0], 0);
        }
        
        TreeNode rootNode;
        rootNode = new TreeNode(nodeValues[0], nodeColor[0], 0);
        createEdge(rootNode, 1);
        return rootNode;
    }

    private static void createEdge(TreeNode parentNode, Integer parentNum) {
        /* Get HashSet of children and loop through them */
        for (Integer treeNum : nodeMap.get(parentNum)) {
            //remove parent node in HashSet
            nodeMap.get(treeNum).remove(parentNum);
            
            //add child node
            HashSet<Integer> child = nodeMap.get(treeNum);
            boolean hasChild = (child != null && !child.isEmpty());
            
            Tree tree;
            if(hasChild){
                tree = new TreeNode(nodeValues[treeNum-1], nodeColor[treeNum-1], parentNode.getDepth()+1);
            } else {
                tree = new TreeLeaf(nodeValues[treeNum-1], nodeColor[treeNum-1], parentNode.getDepth()+1);
            }
            parentNode.addChild(tree);            
            
            if (tree instanceof TreeNode) {
                createEdge((TreeNode)tree, treeNum);
            }
        }
    }
}

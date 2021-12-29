/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

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

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    @Override
    public void accept(TreeVis visitor) {
        visitor.visitNode(this);
    }
    
}

class TreeLeaf extends Tree{

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    @Override
    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
    
}

interface TreeVis{
    public int getResult();
    public void visitNode(TreeNode node);
    public void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor implements TreeVis {

    @Override
    public int getResult() {
        
        return 0;
    }

    @Override
    public void visitNode(TreeNode node) {
        System.out.println("Display visitNode SumInLeaves");
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        System.out.println("Display visitLeaf SumInLeaves");
    }
}

class ProductRedNodesVisitor implements TreeVis {

    @Override
    public int getResult() {
        return 1;
    }

    @Override
    public void visitNode(TreeNode node) {
        System.out.println("Display visitNode ProductRed");
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        System.out.println("Display visitLeaf ProductRed");
    }
}

class FancyVisitor implements TreeVis{

    @Override
    public int getResult() {
        return 0;
    }

    @Override
    public void visitNode(TreeNode node) {
        System.out.println("Display visitNode Fancy");
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        System.out.println("Display visitLeaf Fancy");
    }
}

public class LatJavaVisitorPattern {
    public static void main(String[] args) {
        
    }
}

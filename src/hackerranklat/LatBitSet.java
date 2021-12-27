/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.BitSet;
import java.util.Scanner;

/**
 *
 * @author cma
 * 
 * sample input :
    5 4
    AND 1 2
    SET 1 4
    FLIP 2 2
    OR 2 1
 */
public class LatBitSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        BitSet a = new BitSet(n);
        BitSet b = new BitSet(n);
        
        while(0<m--){
            String opr = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            switch (opr){
                case "AND":
                    if(x == 1){
                        a.and(b);
                    } else { b.and(a); }
                    break;
                case "OR":
                    if(x == 1){
                        a.or(b);
                    } else { b.or(a); }
                    break;
                case "XOR":
                    if(x == 1){
                        a.xor(b);
                    } else { b.xor(a); }
                    break;
                case "FLIP":
                    if(x == 1){
                        a.flip(y);
                    } else { b.flip(y); }
                    break;
                case "SET":
                    if(x == 1){
                        a.set(y);
                    } else { b.set(y); }
                    break;
            }
            System.out.println(a.cardinality() + " " + b.cardinality());
        }
        sc.close();
        
    }
    
}

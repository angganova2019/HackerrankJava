/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author cma
 */
public class LatBigInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
    
}

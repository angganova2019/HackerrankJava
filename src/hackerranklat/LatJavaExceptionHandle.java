/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.Scanner;

/**
 *
 * @author cma
 * 
 * sample input :
 * 3 5
2 4
0 0
-1 -2
-1 3
 */

class MyCalculators {
    
    public long power(int n, int p) throws Exception{
        if(n == 0 && p == 0){
            throw new Exception("n and p should not be zero.");
        } else if(n < 0 || p < 0){
            throw new Exception("n or p should not be negative.");
        }
        return (long)Math.pow(n, p);
    }
}

public class LatJavaExceptionHandle {
    public static final MyCalculators my_calculator = new MyCalculators();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

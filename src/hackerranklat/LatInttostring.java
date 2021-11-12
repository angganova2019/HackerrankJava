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
 */
public class LatInttostring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            //String s=???; Complete this line below

            String s = Integer.toString(n);

   
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
    
}

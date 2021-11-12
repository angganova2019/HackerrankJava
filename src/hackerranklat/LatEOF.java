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
public class LatEOF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while(sc.hasNext()) {
            System.out.println(n + " " + sc.nextLine());
            n++;
        }
    }
    
}

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
 * sample input :
 *  2
    0 2 10
    5 3 5
 */
public class LatLoopII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for (int j = 0; j < n; j++) {
                int tot = 0;
                for (int h = 0; h <= j; h++) {
                    tot += (int) Math.pow(2, h) * b;
                }
                tot += a;
                System.out.printf("%d ",tot);
            }
            System.out.println();
        }
        in.close();
    }
    
}

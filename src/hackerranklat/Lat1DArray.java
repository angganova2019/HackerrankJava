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
public class Lat1DArray {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return isStatus(leap, game, 0);
    }
    
    static boolean isStatus(int leap, int[] game, int pos){
        if (pos<0) return false;
        if (game[pos] == 1) return false;
        if (pos == game.length - 1) return true;
        if (pos+leap>game.length-1) return true;
        
        game[pos] = 1;
        return isStatus(leap, game, pos+1)||isStatus(leap, game, pos-1)||isStatus(leap, game, pos+leap);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
    
}

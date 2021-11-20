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
public class LatAnagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        char an[] = a.toLowerCase().toCharArray();
        char bn[] = b.toLowerCase().toCharArray();
        if(an.length != bn.length) {
            return false;
        } else {
            java.util.Arrays.sort(an);
            java.util.Arrays.sort(bn);
            return java.util.Arrays.equals(an, bn);
        }
    }
    
}

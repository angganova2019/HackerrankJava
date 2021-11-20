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
public class LatSubstringComparisons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
        
    }
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for(int i = 0; i < s.length()-k+1; i++){
            if(smallest == "") smallest = s.substring(i, i+k);
            if(s.substring(i, i+k).compareTo(smallest)<0) smallest = s.substring(i, i+k);
            if(s.substring(i, i+k).compareTo(largest)>0) largest = s.substring(i, i+k);
        }
        
        return smallest + "\n" + largest;
    }
    
}

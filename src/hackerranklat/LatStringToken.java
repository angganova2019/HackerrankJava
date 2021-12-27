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
 *  He is a very very good boy, isn't he?
 */
public class LatStringToken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        if (s.trim().length()==0 || s.trim().length()>=400000) {
            System.out.println(0); return;
        }
        String words[] = s.trim().split("[ !,?.\\_'@]+");
        System.out.println(words.length);
        for(String str:words){
            System.out.println(str);
        }
        scan.close();
    }
    
}

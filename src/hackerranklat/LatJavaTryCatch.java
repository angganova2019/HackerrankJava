/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cma
 * 
 * sample input :
 * 10
3
 */

public class LatJavaTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x/y);
        } catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    
}

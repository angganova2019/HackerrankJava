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
 *  {}()
    ({()})
    {}(
    []
 */
public class LatJavaStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        while (sc.hasNext()) {
            String input=sc.next();
            
            while(input.length() != (input = input.replaceAll("\\{\\}|\\(\\)|\\[\\]", "")).length());
            System.out.println(input.isEmpty());
	}
    }
    
}

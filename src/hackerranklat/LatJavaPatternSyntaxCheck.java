/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.regex.Pattern;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author cma
 *
 * sample input: 
 * 3 ([A-Z])(.+) [AZ[a-z](a-z) batcatpat(nat
 */
public class LatJavaPatternSyntaxCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}

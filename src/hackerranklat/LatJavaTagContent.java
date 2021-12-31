/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author cma
 *
 * sample input : 4
 * <h1>Nayeem loves counseling</h1>
 * <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
 * <Amee>safat codes like a ninja</amee>
 * <SA premium>Imtiaz has a secret crush</SA premium>
 */
public class LatJavaTagContent {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            String reg = "<(.+)>([^<]+)<(/\\1)>";
            Pattern p = Pattern.compile(reg);
            Matcher m = p.matcher(line);
            boolean found = false;
            while (m.find()){
                System.out.println(m.group(2));
                found = true;
            }
            if(!found){
                System.out.println("None");
            }
            testCases--;
        }
    }
}

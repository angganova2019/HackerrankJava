/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author cma
 * 
 * sample input :
 * HelloWorld
 */
public class LatJavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        /* Encoding the string use MD5 */
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        byte[] byteResult = md.digest();
        
        /* Print the encoded value in hexadecimal */
        for (byte b : byteResult) {
            System.out.printf("%02x", b);
        }
        
    }
}

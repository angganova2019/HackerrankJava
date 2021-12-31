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
 * sample input: 000.12.12.034 121.234.12.12 23.45.12.56 00.12.123.123123.123
 * 122.23 Hello.IP
 */
public class LatJavaRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex{
//    static final String pattern= "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
    static final String pattern= "^((\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])(\\.(?!$)|$)){4}$";
}

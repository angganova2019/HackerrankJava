/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author cma
 * 
 * sample input :
 * 2
 * 1
 * 3
 * 4
 * 5
 */
class Prime {

    public void checkPrime(int... num) {
        for (int i : num) {
//            System.out.println(i + " % 2 = " + i%2 + " ");
            if (isPrimeWithBigInteger(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    private boolean isPrime(int n) {
        int count = 0;
        for (int j = n; j >= 1; j--) {
            if (n % j == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
    
    private boolean isPrimeWithBigInteger(int n) {
        BigInteger bg = BigInteger.valueOf(n);
        if(bg.isProbablePrime(1)){
            return true;
        }
        return false;
    }
}

public class LatJavaPrimeChecker {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int in1 = Integer.parseInt(br.readLine());
            int in2 = Integer.parseInt(br.readLine());
            int in3 = Integer.parseInt(br.readLine());
            int in4 = Integer.parseInt(br.readLine());
            int in5 = Integer.parseInt(br.readLine());
            Prime p = new Prime();
            p.checkPrime(in1);
            p.checkPrime(in1, in2);
            p.checkPrime(in1, in2, in3);
            p.checkPrime(in1, in2, in3, in4, in5);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

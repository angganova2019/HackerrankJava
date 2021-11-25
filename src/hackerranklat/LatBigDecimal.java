/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author cma
 */
public class LatBigDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
//        String[] x = Arrays.copyOf(s, n);
//        Arrays.sort(x, Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));
        Arrays.sort(s, 0, n, Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));
        
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
    
}

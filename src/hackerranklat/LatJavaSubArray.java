/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MasterAngga
 * 
 * sample input:
 * 5
1 -2 4 -5 1
 */
public class LatJavaSubArray {
    
    static int sumArr = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int j = 0; j < n; j++) {
            int t = 0;
            subArr(arr, j, t);
        }
        System.out.println(sumArr);
    }
    
//    static void subArr(int[] arrL, int pos, int[] tempSub, int posTem) {
//        if(pos < arrL.length){
//            int str = 0;
//            tempSub[posTem] = arrL[pos];
//            for(int s: tempSub){
//                str += s;
//            }
//            if(str < 0){
//                sumArr += 1; 
//            }
//            subArr(arrL, pos+1, tempSub,posTem+1);
//        }
//    }
    
    static void subArr(int[] arrL, int pos, int temp) {
        if(pos < arrL.length){
            temp += arrL[pos];
            if(temp < 0){
                sumArr += 1; 
            }
            subArr(arrL, pos+1, temp);
        }
    }
}

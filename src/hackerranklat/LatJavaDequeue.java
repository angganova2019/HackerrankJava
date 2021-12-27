/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cma
 * 
 * sample input :
 *  6 3
    5 3 5 2 3 2
 */
public class LatJavaDequeue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        
        HashSet<Integer> set = new HashSet<Integer>();
        int k = 0;
        
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if(deque.size() == m){
//                for(int j:deque){
//                    set.add(j);
//                }
                if(k<set.size())k = set.size();
                int f = deque.removeFirst();
                if(!deque.contains(f))set.remove(f);
            }
            
        }
        System.out.print(k);
    }
    
}

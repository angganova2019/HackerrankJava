/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cma
 * 
 * sample input :
 *  5
    12 0 1 78 12
    2
    Insert
    5 23
    Delete
    0
 */
public class LatJavaList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++){
            l.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++){
            String cmd = sc.next();
            if(cmd.contentEquals("Insert")){
                int idx = sc.nextInt();
                int val = sc.nextInt();
                l.add(idx, val);
            }else if (cmd.contentEquals("Delete")){
                int idx = sc.nextInt();
                l.remove(idx);
            }
        }
        sc.close();
        for(int lst: l){
            System.out.print(lst+" ");
        }
        
    }
    
}

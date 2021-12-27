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
 * sample input :
 * 5
    5 41 77 74 22 44
    1 12
    4 37 34 36 52
    0
    3 20 22 33
    5
    1 3
    3 4
    3 1
    4 3
    5 5
 */
public class LatJavaArrayList {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> item = new ArrayList<Integer>();
            for (int j = 0; j < d; j++) {
                item.add(sc.nextInt());
            }
            list.add(item);
        }
        ArrayList<ArrayList<Integer>> listQuery = new ArrayList<ArrayList<Integer>>();
        int q = sc.nextInt();
        for (int k = 0; k < q; k++) {
            ArrayList<Integer> query = new ArrayList<Integer>();
            int x = sc.nextInt();
            int y = sc.nextInt();
            query.add(x);
            query.add(y);
            listQuery.add(query);
        }
        sc.close();
        
        for (int qr = 0; qr < listQuery.size(); qr++) {
            int x = listQuery.get(qr).get(0)-1;
            int y = listQuery.get(qr).get(1)-1;
            
            if (y < list.get(x).size()) {
                System.out.println(list.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}

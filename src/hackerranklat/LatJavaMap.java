/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author cma
 */
public class LatJavaMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
	for(int i=0;i<n;i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
        while(in.hasNext()) {
            String s=in.nextLine();
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player>{

    @Override
    public int compare(Player arg0, Player arg1) {
        if(arg0.score == arg1.score) {
            return arg0.name.compareToIgnoreCase(arg1.name);
        } else if (arg0.score < arg1.score) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class LatJavaComparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
    
}

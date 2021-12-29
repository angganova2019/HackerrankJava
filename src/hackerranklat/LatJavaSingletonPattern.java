/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

/**
 *
 * @author cma
 */
public class LatJavaSingletonPattern {
    public static void main(String[] args) {
        
    }
}

final class Singleton {
    private static volatile Singleton instance = null;
    public static String str = "";
    
    private Singleton(){}
    
    public static Singleton getSingleInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;      
    }
} 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.Scanner;

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

class MyBook extends Book{

    String title;

    public String getTitle() {
        return title;
    }
    
    @Override
    void setTitle(String s) {
        this.title = s;
    }
    
}

/*
    sample input :
    A tale of two cities
*/

public class LatAbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
    }
    
}

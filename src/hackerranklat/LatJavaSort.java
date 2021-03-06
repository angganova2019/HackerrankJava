/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Students{
	private int id;
	private String fname;
	private double cgpa;
	public Students(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

/*
    sample input :
    5
    33 Rumpa 3.68
    85 Ashis 3.85
    56 Samiha 3.75
    19 Samara 3.75
    22 Fahim 3.76
*/

public class LatJavaSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        List<Students> studentList = new ArrayList<Students>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            
            Students st = new Students(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }
        
        // jika ArrayList gunakan collections.sort, jika Array bisa gunakan Arrays.sort
        Collections.sort(studentList, Comparator.comparing(Students::getCgpa).reversed().thenComparing(Students::getFname).thenComparing(Students::getId));
        
        for(Students st: studentList){
            System.out.println(st.getFname());
        }
    }    
}

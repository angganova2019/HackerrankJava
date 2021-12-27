/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


class Priorities {

    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<Student>(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getId));
        
        for(String e: events){
            String[] str = e.trim().split(" ");
            switch (str[0]){
                case "ENTER":
                    Student student = new Student(Integer.valueOf(str[3]), str[1], Double.valueOf(str[2]));
                    pq.add(student);
                    break;
                case "SERVED":
                    pq.poll();
                    break;
            }
        }
        List<Student> lStudent = new ArrayList<Student>();
        while(!pq.isEmpty()){
            lStudent.add(pq.poll());
        }
        return lStudent;
    }
}

class Student {
    int id;
    String name;
    double cgpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }    
}

/*
    sample input :
    12
    ENTER John 3.75 50
    ENTER Mark 3.8 24
    ENTER Shafaet 3.7 35
    SERVED
    SERVED
    ENTER Samiha 3.85 36
    SERVED
    ENTER Ashley 3.9 42
    ENTER Maria 3.6 46
    ENTER Anik 3.95 49
    ENTER Dan 3.95 50
    SERVED
*/

public class LatJavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
    
}

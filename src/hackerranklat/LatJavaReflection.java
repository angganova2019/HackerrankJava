/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MasterAngga
 */

class Students1{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    
}

public class LatJavaReflection {
    
    public static void main(String[] args){
        try {
            Class student = Students1.class;
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m:methods){
                methodList.add(m.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}

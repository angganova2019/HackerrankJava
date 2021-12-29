/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.util.Scanner;

/**
 *
 * @author cma
 * 
 * sample input:
 * cake
 */

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("cake")) {
            Food fcake = new Cake();
            return fcake;
        } else if (order.equalsIgnoreCase("pizza")){
            Food fpizza = new Pizza();
            return fpizza;
        } else {
            return new Pizza();
        }
    }//End of getFood method
}//End of factory class

public class LatJavaFactoryPattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating the factory
        FoodFactory foodFactory = new FoodFactory();

        //factory instantiates an object
        Food food = foodFactory.getFood(sc.nextLine());

        System.out.println("The factory returned " + food.getClass());
        System.out.println(food.getType());
    }
}

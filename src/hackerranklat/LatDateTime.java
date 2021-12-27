/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranklat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

/**
 *
 * @author cma
 * sample input :
 *  08 05 2015
 */
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().name();
    }

}

public class LatDateTime {

   
    public static void main(String[] args) throws IOException  {
        
//        Scanner sc = new Scanner(System.in);
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        System.out.print(day + " " + month + " " + year);
        String res = Result.findDay(month, day, year);
        System.out.println(res);
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
    
}

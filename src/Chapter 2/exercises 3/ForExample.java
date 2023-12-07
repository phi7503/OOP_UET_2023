
package exercises;

import java.util.Scanner;

public class ForExample {
    
    public static void main(String[] args) {
        float sum = 0;
        int subjects = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks for "+ subjects +"subjects:");
        
        for (int count =0; count < subjects;count ++){
            float mark;
            mark = input.nextFloat();
            sum += mark;
        }
        System.out.println("Average mark =" + sum/subjects);
    }
}

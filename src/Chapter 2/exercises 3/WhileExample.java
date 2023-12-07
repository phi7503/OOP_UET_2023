
package exercises;

import java.util.Scanner;

public class WhileExample {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int count,number;
        System.out.println("Enter number:");
        number = input.nextInt();
        
        count = 1;
        while (count <= number){
        System.out.println(count+ ",");
                count++;
        }
        System.out.println("BOOOOOM!");
    }
}

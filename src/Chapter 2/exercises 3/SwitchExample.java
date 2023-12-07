
package exercises;

import java.util.Scanner;


public class SwitchExample {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        String userInput = input.next();
        char grade = userInput.charAt(0);
        
        switch(grade){
            case 'A':
                System.out.println("Exellent");break;
            case 'B':
                System.out.println("Great");break;
            case 'C':
            case 'D':
                System.out.println("Well done");break;
            case 'F':
                System.out.println("Sorry, you failed");break;
            default:
                System.out.println("Error! Invalid grade");
        }
    }
}

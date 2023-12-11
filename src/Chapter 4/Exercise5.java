package javaapplication9;

class Books {

    String title;
    String author;
}

public class BookTestDrive {

    public static void main(String[] args) {
        Books[] myBooks = new Books[3]; // Fix the error here, initialize the myBooks array with a length of 3
        int x = 0;

        // Create a new object for each element in the myBooks array
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}

class Hobbits {

    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = -1; // Fix the initial value of z to start at 0

        while (z < 2) { /* Fix the loop condition to prevent the program from 
                           running too many elements in the array*/
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}

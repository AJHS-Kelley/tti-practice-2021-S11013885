// Amari Lombel 11/16/21 TTI v0.0
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

    System.out.println("This program will take a numerical grade and print out the letter grade.\n");
        double grade; 
 
        Scanner myScanner = new Scanner(System.in);
        grade = myScanner.nextDouble();
    
        System.out.println(grade);
    


        if(grade >= 89.5){

            System.out.println("YOU HAAVE AN A !! \n");
        }else if (grade >= 79.5){
            System.out.println("You have a B\n");
        }else if (grade >= 69.5){
            System.out.println("You have a C\n");
        }else if (grade >= 59.5){
            System.out.println("You have a D\n");
        }else{ 
            System.out.println("You have a F\n");






    }



    }

}
    

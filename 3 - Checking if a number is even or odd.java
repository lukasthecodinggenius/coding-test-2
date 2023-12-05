
package my_application;
import java.util.Scanner; //import scanner

class My_Application {
        
 
    public static void main(String[] args) {
       
    Scanner scan = new Scanner(System.in); //declare scanner
    
    System.out.println("Please Enter Number: ");
    
    int num = scan.nextInt(); //take input from user
    
    if (num % 2 == 0) { 
        System.out.println("Number is even"); //prints this statement if the remainder of num / 2 is 0.
    } else if (num % 2 == 1) {
        System.out.println("Number is odd"); //prints this statement if the remained of num / 2 is 1
        } else {
        System.out.println("Invalid Number"); //prints this statement if an invalid number is printed (ex. negative number)
 
       
   }
    
            
    }
        
  
     
     
              } 
    








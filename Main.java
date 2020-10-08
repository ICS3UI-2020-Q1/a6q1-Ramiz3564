 import java.util.Scanner;
/**
 *
 * @author Zach Ramirez
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input 
    Scanner input = new Scanner(System.in); 

    //ask the user how many heights they want 
    System.out.println("How many heights would you like enter"); 
    int height = input.nextInt(); 

    //create an array with 5 spots
    int[] heights = new int[height]; 
 
    System.out.println("Please enter heights on seperate lines");
    //put heights into array using loop
    for(int i = 0; i < height; i++){
     
      heights[i] = input.nextInt();   
    }  


    //create a variable to store the sum
    int sum = 0; 

    //use for loop to go through array and add the sum 
    for(int i = 0; i < heights.length; i++){
      //add height to the sum 
      sum = sum + heights[i];
    }  

    //determine the average 
    int average = sum / height; 

    System.out.println("your average height is " + average + "cm");  
     
    System.out.println("The heights above average are " ); 
    //determine which heights are above average 
    for(int i = 0; i < height; i++){ 
    if(heights[i] > average){ 
     System.out.println(heights[i]);
    } 
    }
    
  }
}

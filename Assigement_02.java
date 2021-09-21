/*// Command Line Arguments means that you have to provide input 
during execution of program.
import java.util.Scanner;
class Sum
{
    static int Number_1; 
    static int Number_2;
    
    

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        Number_1 = sc.nextInt();
        
        System.out.print("Enter the number 2: ");
        Number_2 = sc.nextInt();
        
 
    }
    public void display() {
        System.out.println("The sum of numbers is: "+Sum);  

    }
    public static void main(String[] args){
        Sum obj = new Sum();
        Sum = Number_1 + Number_2;
        obj.accept();
        obj.display();
    }
}
*/

class sum
{
      public static void main(String ar[])
      {
            int x,y,s;
            
            x=Integer.parseInt(ar[0]);
            y=Integer.parseInt(ar[1]);
 
            s=x+y;
            System.out.println("sum of " + x + " and " + y +" is " +s);
      }
}
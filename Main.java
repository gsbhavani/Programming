import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
    
       
        System.out.println("Enter student marks");
        int mar=sc.nextInt();
        if(mar>=80)
        {
            System.out.println("congras student was with passed with first grade");
        }
        else if(mar>50||mar>=67){
            System.err.println("student was with second grade");
        }
               else
        {
            System.out.println("Student was failed");
        }
    }
}
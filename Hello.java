

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello
 */
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
      Random Ra=new Random();
       int  random =Ra.nextInt(3);
       System.out.println(random);
       for(int i=0;i<3;i++)
       {
      
       System.out.println("Enter the your vale");

       int a=sc.nextInt();
      


       if (random==a)
       {
         System.out.println("your number is correct");
         break;
         
       }

       else 
       {
         System.out.println("sorry try agin" );
       }
       
      }
        //  int n1=0;
        // int n2=1;
        //  int sum=0;
        //  int i=0;
        // while (i<=10) {
    //     System.out.println(""+sum);
    //     sum=n1+n2;
    //     n1=n2;
    //     n2=sum
    //     i++;
    //     }
    // int count=0;

    //     for(int i=1;i<=99;i++)
    //     {
    //         int last=i%10;
    //         int first=i/10;
    //         if(last==first)
    //         {
    //             System.out.println(i);
    //             count++;
                
    //         }
    //         }
            
    //         System.out.println(count);
        }
    }

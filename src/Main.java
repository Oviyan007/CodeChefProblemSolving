//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        Student ovn= new Student("sam",19);
//
////        input and output functions
////        System.out.println("Enter the number ::");
////        int n = in.nextInt();
////        System.out.println("this given number is :::"+ n);
////        String name="balaji"; // string declaration
////        boolean resul= true ; // boolean declararation
////        int [] an = new int[5]; //array declaration
////        int [] qn = {1,2,3,4}; //seconf method to declare array
////        for(int i=0;i<qn.length;i++){
////            System.out.println(qn[i]);
////        }
////        System.out.println("enter your age!!!! ");
////       int age = in.nextInt();
////       if (age>18){
////           System.out.println("you can vote ");
////       }
////       else {
////           System.out.println("sorry you can't");
////       }
//
//
//
//    }
//}
//// class Student {
////    Student(String name, int age ){
////
////        System.out.println("hello" + " " +name +" "+ age +" "+ "years old" );
////    }
////}
////
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef1df
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();

        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a < b){
            System.out.println("profit");
            }
		    else if (a > b) {
            System.out.println("Loss");
            }
		    else{
            System.out.println("Neutral");
            }

        }
        }


}






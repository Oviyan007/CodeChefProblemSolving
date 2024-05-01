import java.util.*;
import java.lang.*;
import java.io.*;
public class janmashAssignment {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        for(int i=0;i<t;i++){
            int a=in.nextInt();

            if(a<10 && a<=7){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}

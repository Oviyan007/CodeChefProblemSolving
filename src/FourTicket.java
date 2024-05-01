import java.util.Scanner;

public class FourTicket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int X =in.nextInt()*4;

            if (X<=1000) {
                System.out.println("Yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}

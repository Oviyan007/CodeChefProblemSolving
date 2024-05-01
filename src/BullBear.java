
import java.util.*;
import java.lang.*;

public class BullBear {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a < b) {
                System.out.println("profit");
            } else if (a > b) {
                System.out.println("Loss");
            } else {
                System.out.println("Neutral");
            }

        }
    }
}

import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int x = in.nextInt();
        int []height = new int[5];

        for (int i = 0; i < height.length; i++) {
            height[i] = in.nextInt();
        }
        int count = 1;

        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] >= x) {
                count++;
            }
            else {
                break;
            }
        }
        out.print(count);
    }
}
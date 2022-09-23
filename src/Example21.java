import java.util.Scanner;

public class Example21 {
    public static void main(String[] args) {
        int num, i, positives;
        Scanner input = new Scanner(System.in);

        i = 0;
        positives = 0;
        while (i < 10) {
            num = input.nextInt();
            if (num >= 0) {
                positives++;
            }
            i = i + 1;
        }
        System.out.println(positives + " positives");
    }
}






import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] str = new String[10];
        Scanner scanner = new Scanner(System.in);
        String word;
        for (int i = 0; i < str.length; i++) {
            System.out.println("Please enter word: ");
            word = scanner.nextLine();
            if (word.equals("exit")) {
                System.out.println(Arrays.toString(str));
                return;
            }
            int dublicate = 0;
            for (String temp : str) {
                if (word.equals(temp)) {
                    dublicate = 1;
                    break;
                }
            }
            if (dublicate == 1) {
                i--;
                continue;
            } else str[i] = word;
        }
        System.out.println(Arrays.toString(str));
        return;
    }
}

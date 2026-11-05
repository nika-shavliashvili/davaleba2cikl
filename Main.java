//6
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int x = random.nextInt(100) + 1;
        int num;

        do {
            System.out.print("Enter number: ");
            num = sc.nextInt();

            if (num < x) {
                System.out.println("Too small!");
            } else if (num > x) {
                System.out.println("Too big!");
            } else {
                System.out.println("You guessed!");
            }

        } while (num != x);
    }
}
//1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        double average = (double) sum / n;

        System.out.println("Average: " + average);
    }
}
//2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {

            int po = 1;

            while (po * 2 <= n) {
                po = po * 2;
            }

            System.out.print(po + " ");

            n = n - po;
        }
    }
}
//3
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {

            if (i % 2 == 0 || i == 5 || i == 7 || i == 11) {
                continue;
            }

            System.out.println(i);
        }
    }
}
//5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int binary = 0;
        int power = 1;

        while (n > 0) {

            int remainder = n % 2;

            binary = binary + remainder * power;

            power = power * 10;

            n = n / 2;
        }

        System.out.println("Binary: " + binary);
    }
}

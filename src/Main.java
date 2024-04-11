import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Как тебя зовут?");

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int length = name.length() - 1;
        char last = name.charAt(length);
        System.out.println(last);

        char a = 'а';
        char b = 'я';
        char c = 'и';

        if (last == a || last == b || last == c)
            System.out.println("Приветик!");

        else {
            System.out.println("Здарова!");


        }
    }
}





import java.util.Scanner;
public class Task5 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int first = in.nextInt();
        System.out.print("Введите число: ");
        int second = in.nextInt();
        System.out.print("Введите +, -, * или /: ");
        String operator = in.next();
        int answer = 0;
        switch (operator){
            case "+": answer = first + second;
                break;
            case "-": answer = first - second;
                break;
            case "*": answer = first * second;
                break;
            case "+/": answer = first / second;
                break;
        }
        System.out.print("Ответ: " + answer);
    }
}

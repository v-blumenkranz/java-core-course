import java.util.Scanner;

public class Task9 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = in.nextInt();
        double[]newArray = new double[length];
        System.out.println("Введите числа в массив: ");
        for (int i = 0; i < length; i++){
            double number = in.nextDouble();
            newArray[i] = number;
        }
        double sum = 0;
        for (double content : newArray){
            sum = sum + content;
        }
        double average = sum/length;
        System.out.println("Среднее арифметическое чисел массива: " + average);
        double a;
        System.out.println("Числа массива, умноженные на среднее арифметическое:");
        for (double content : newArray){
            a = content*average;
            System.out.println(a);
        }
    }
}

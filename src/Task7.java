import java.util.Scanner;

public class Task7 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int length = in.nextInt();
        int[]userArray = new int[length];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < length; i++){
            int number = in.nextInt();
            userArray[i] = number;
        }
        int x = 12;
        int y = 2;
        int z = 7;
        for (int container : userArray) {
            if (container == x | container == y | container == z){
                    System.out.println("Одно из заданных значений имеется в константах");
            }
        }
    }
}

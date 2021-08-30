import java.util.Scanner;

public class Task6 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int gauge = in.nextInt();
        if (gauge == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int lengthChoice = in.nextInt();
            System.out.print("Введите число: ");
            float length = in.nextFloat();
            switch (lengthChoice){
                case 1:
                    System.out.println("Метры: " + length);
                    System.out.println("Мили: " + length*0.0006);
                    System.out.println("Ярды: " + length*1.09361);
                    System.out.println("Футы: " + length*3.2808);
                    break;
                case 2:
                    System.out.println("Метры: " + length*0.0006);
                    System.out.println("Мили: " + length);
                    System.out.println("Ярды: " + length*0.00056);
                    System.out.println("Футы: " + length*0.0002);
                    break;
                case 3:
                    System.out.println("Метры: " + length*1.09361);
                    System.out.println("Мили: " + length*0.00056);
                    System.out.println("Ярды: " + length);
                    System.out.println("Футы: " + length*0.333333);
                    break;
                case 4:
                    System.out.println("Метры: " + length*3.28084);
                    System.out.println("Мили: " + length*5280);
                    System.out.println("Ярды: " + length*3);
                    System.out.println("Футы: " + length);
                    break;
            }
        }
        if (gauge == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт");
            int weightChoice = in.nextInt();
            System.out.print("Введите число: ");
            float weight = in.nextFloat();
            switch (weightChoice){
                case 1:
                    System.out.println("Килограммы: " + weight);
                    System.out.println("Фунты: " + weight*2.20462);
                    break;
                case 2:
                    System.out.println("Килограммы: " + weight*0.453592);
                    System.out.println("Фунты: " + weight);
                    break;
            }
        }
    }
}

public class Arrays {
    public static void main (String[]args) {
        int[] myArray = {1, 3, 5, 7, 9};
        int a = myArray[0];
        int b = myArray[myArray.length - 1];
        myArray[0] = b;
        myArray[myArray.length - 1] = a;
        int c = myArray.length;
        int d = c / 2;
        System.out.println(myArray[d]);
    }
}
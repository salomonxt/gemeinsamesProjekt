import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //26.8.17h09
        System.out.println();
        System.out.println("Wer hat ein (kleines) Beispiel für Arrays?");
        System.out.println("Einfach hier anhängen :D");      
        System.out.println("====");
        System.out.println("Salo_BSP1:");
        System.out.println("=====");


        Integer[] numbers = new Integer[4884];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.println(Arrays.toString(numbers));

 
        int[] sterne = new int[10];
        for (int i=0; i<=10; i++) { 
            System.out.println(java.util.Arrays.toString(sterne));
            }


    }
}
//

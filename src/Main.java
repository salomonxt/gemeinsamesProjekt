import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //26.8.17h09
        //17:49
        System.out.println();
        System.out.println("Wer hat ein (kleines) Beispiel für Arrays?");
        System.out.println("-einfach unten anhängen-");

        System.out.println("====");
        System.out.println("S_BSP1:");
        System.out.println("====");

        int[] nullreihe = new int[3];

        for (int i=0; i<=10; i++) {
            System.out.println(java.util.Arrays.toString(nullreihe));
            //hmm...
        }

        System.out.println("====");
        System.out.println("Y_BSP1:");
        System.out.println("====");

        Integer[] numbers = new Integer[4884];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.println(Arrays.toString(numbers));





        /*System.out.println("====");
        System.out.println("Dein_BSP1:");
        System.out.println("====");

        CODE

        System.out.println("====");
        System.out.println("Dein_BSP2:");
        System.out.println("====");
*/


    }
}
//

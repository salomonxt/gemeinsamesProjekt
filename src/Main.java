import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi,wer hat ein (kleines) Beispiel für Arrays?");

        Integer[] numbers = new Integer[4884];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.println(Arrays.toString(numbers));

    }
}
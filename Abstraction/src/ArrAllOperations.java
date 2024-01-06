import java.util.Arrays;

public class ArrAllOperations {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        String[] fruits = new String[]{"Apple", "Banana", "Orange"};

        int firstNumber = numbers[0];
        String secondFruit = fruits[1];



        numbers[3] = 10;
        fruits[0] = "Mango";

        System.out.println("Numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nFruits:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

        int numbersLength = numbers.length;
        int fruitsLength = fruits.length;

        int[] copyNum = Arrays.copyOf(numbers, numbers.length);
        String[] copyFru = Arrays.copyOf(fruits, fruits.length);

        System.out.println("\nLength of numbers array: " + numbersLength);
        System.out.println("Length of fruits array: " + fruitsLength);

        System.out.println("Copied 'numbers' array:");
        for (int number : copyNum) {
            System.out.print(number + " ");
        }
        System.out.println("\nCopied 'fruits' array:");
        for (String fruit : copyFru) {
            System.out.print(fruit + " ");
        }
    }
}

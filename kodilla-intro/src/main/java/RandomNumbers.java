import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {

    //Utwórz klasę RandomNumbers, w której będzie istnieć metoda losująca liczby z zakresu 0-30,
    // tak długo, aż ich suma przekroczy 5000.
    // Napisz dwie metody zwracające największą i najmniejszą wylosowaną wartość.

    public static void main(String[] args) {

        //Solution #1 using list and having 2 methods for min max
        List<Integer> numbers = new ArrayList<>();

        int sum = 0;
        int min = 0;
        int max = 30;

        while (sum < 5000) {
            int randomNumber = getRandomNumberUsingNextInt(min, max); //generate random number and assign it to randomNumber var
            numbers.add(randomNumber); //add generated value to list
            sum = sum + randomNumber; //sum with new generated value
            System.out.println("Sum: " + sum + ", current random number: " + randomNumber);
        }

        System.out.println(numbers); //print whole list of values

        System.out.println(getMinValueFromList(numbers)); //print min
        System.out.println(getMaxValueFromList(numbers)); //print max


 /*     Solution #2 don't use list, can't use methods :D
        int sum = 0;
        int min = 0;
        int max = 30;

        int currentMin = 999;
        int currentMax = -999;

        while (sum < 5000) {
            int randomNumber = getRandomNumberUsingNextInt(min, max); //generate random number and assign it to randomNumber var

            if (randomNumber < currentMin) {
                currentMin = randomNumber;
            }

            if (randomNumber > currentMax) {
                currentMax = randomNumber;
            }

            sum = sum + randomNumber; //sum with new generated value
            System.out.println("Current min: " + currentMin);
            System.out.println("Current max: " + currentMax);
            System.out.println("Sum: " + sum + ", current random number: " + randomNumber);
        }*/
    }

    //============= methods for Solution #1 =======================
    private static int getMaxValueFromList(List<Integer> numbers) {
        int currentMax = -999;
        for (int number : numbers) {
            if (number < currentMax) {
                currentMax = number;
            }
        }
        return currentMax;
    }

    private static int getMinValueFromList(List<Integer> numbers) {
        int currentMin = 999;
        for (int number : numbers) {
            if (number < currentMin) {
                currentMin = number;
            }
        }
        return currentMin;
    }
    //============= end of methods for Solution #1 =======================


    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
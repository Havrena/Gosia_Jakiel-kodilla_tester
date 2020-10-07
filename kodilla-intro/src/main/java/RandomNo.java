import java.util.Random;

public class RandomNo {

    static int min = 30;
    static int max = 0;

    public static void main(String[] args) {

        int sum = 0;

        Random random = new Random();

        while (sum < 5000) {
            int temp = random.nextInt(31);
            System.out.println("Wylosowana liczba " + temp);
            sum += temp;
            checkMaxValue(temp);
            checkMinValue(temp);
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }

    public static void checkMaxValue(int number) {
        if (number > max) {
            max = number;
        }
    }

    public static void checkMinValue(int number){
        if (number < min) {
            min = number;
        }
    }
}

//Utwórz klasę RandomNumbers, w której będzie istnieć metoda losująca liczby z zakresu 0-30,
// tak długo, aż ich suma przekroczy 5000.
// Napisz dwie metody zwracające największą i najmniejszą wylosowaną wartość.
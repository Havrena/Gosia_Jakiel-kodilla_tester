import java.util.Scanner;

public class Colour {
    public static String getColour(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type first letter of your fav colour:");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    return "A";
                case "B":
                    return "B";
                case "C":
                    return "C";
                case "D":
                    return "D";
                case "E":
                    return "E";
                case "F":
                    return "F";
                case "G":
                    return "G";
                case "H":
                    return "H";
                case "I":
                    return "I";
                case "J":
                    return "J";
                case "K":
                    return "K";
                case "L":
                    return "L";
                case "M":
                    return "M";
                case "N":
                    return "N";
                case "O":
                    return "O";
                case "P":
                    return "P";
                case "Q":
                    return "Q";
                case "R":
                    return "R";
                case "S":
                    return "S";
                case "T":
                    return "T";
                case "U":
                    return "U";
                case "V":
                    return "V";
                case "W":
                    return "W";
                case "X":
                    return "X";
                case "Y":
                    return "Y";
                case "Z":
                    return "Z";
                default:
                    System.out.println("Wrong input. Try again.");
            }
        }
    }
}

//Napisz klasę, która zapyta użytkownika o pierwszą literę koloru
// i na jej podstawie, przy użyciu switch wybierze i zwróci pełną nazwę koloru.
//Do zadania pytania użytkownikowi należy skorzystać z metody statycznej
// (analogicznie, jak pytamy o wartość zmiennych a oraz b w przykładzie powyżej).
public class ColourApp {
    public String colourName() {
        String userInput = Colour.getColour();
        switch (userInput) {
            case "A":
                return "aquamarine";
            case "B":
                return "burgundy";
            case "C":
                return "crimson";
            case "D":
                return "daffodil";
            case "E":
                return "ebony";
            case "F":
                return "fuchsia";
            case "G":
                return "green";
            case "H":
                return "hazel";
            case "I":
                return "indigo";
            case "J":
                return "jade";
            case "K":
                return "khaki";
            case "L":
                return "lime";
            case "M":
                return "magenta";
            case "N":
                return "navy blue";
            case "O":
                return "oxblood";
            case "P":
                return "pink";
            case "Q":
                return "quartz";
            case "R":
                return "red";
            case "S":
                return "silver";
            case "T":
                return "teal";
            case "U":
                return "ultramarine";
            case "V":
                return "violet";
            case "W":
                return "white";
            case "X":
                return "xanthic";
            case "Y":
                return "yellow";
            case "Z":
                return "zucchini";
            default:
                return "Please choose another letter";
        }
    }
    public static void main(String[] args) {
        ColourApp colourApp = new ColourApp();
        String result = colourApp.colourName();
        System.out.println("Result: " + result);
    }
}
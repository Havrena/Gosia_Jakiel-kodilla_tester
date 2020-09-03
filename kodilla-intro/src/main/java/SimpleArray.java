public class SimpleArray {
    public static void main(String[] args) {

        String[] supports = new String[5];
        supports[0] = "Thresh";
        supports[1] = "Leona";
        supports[2] = "Lux";
        supports[3] = "Janna";
        supports[4] = "Senna";

        String support = supports[2];
        System.out.println(support);

        int numberOfElements;
        numberOfElements = supports.length;
        System.out.println(numberOfElements);

    }
}
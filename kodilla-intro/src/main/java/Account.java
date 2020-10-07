public class Account {

    String name;
    double age;
    double height;

    public Account(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkData() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is exactly 30 or younger than 30 or he is exactly 160cm or shorter than 160cm");
            }
        }
    }
}
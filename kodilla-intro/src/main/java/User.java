public class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User mal = new User("Mal", 2);
        User john = new User("John", 25);
        User dave = new User("Dave", 43);
        User kurt = new User("Kurt", 30);
        User hannah = new User("Hannah", 17);
        User[] users = {mal, john, dave, kurt, hannah};

        //double average = getAverage(users);

        double sum = 0;

        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }
        double average = sum / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name);
            }
        }

    }

/*    public static double getAverage(User[] users) {
        double sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }

        return sum / users.length;
    }*/
}

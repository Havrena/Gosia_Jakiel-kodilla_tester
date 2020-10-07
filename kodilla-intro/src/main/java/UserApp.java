public class UserApp {

    public static void main(String[] args) {
        double sum = 0;
        double average = 0;

        User mal = new User("Mal", 2);
        User john = new User("John", 25);
        User dave = new User("Dave", 43);
        User kurt = new User("Kurt", 30);
        User hannah = new User("Hannah", 17);
        User[] users = {mal, john, dave, kurt, hannah};

        //double average = getAverage(users);

        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }
        average = sum / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name);
            }
        }
    }
}
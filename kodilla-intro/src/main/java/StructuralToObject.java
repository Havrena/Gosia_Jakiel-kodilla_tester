public class StructuralToObject {

    public static void main(String[] args) {

        User user = new User ("Adam", 40.5, 178);
        user.checkData();
    }
}


// Kod wyjściowy:
// public class Application {
//   public static void main(String[] args) {
//      String name = "Adam";
//      double age = 40.5;
//      double height = 178;
//
//      if (name != null) {
//         if (age > 30 && height > 160) {
//            System.out.println("User is older than 30 and higher then 160cm");
//         } else {
//            System.out.println("User is exactly 30 or younger than 30 or he is exactly 160cm or shorter than 160cm");
//         }
//      }
//  }
//}
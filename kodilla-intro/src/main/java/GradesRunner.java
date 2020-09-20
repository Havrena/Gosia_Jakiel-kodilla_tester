public class GradesRunner {

    public static void main(String[] args) {
        Grades grades = new Grades();

        grades.addGrade(4);
        grades.addGrade(5);

        int lastGrade = grades.getLastGrade();
        System.out.println(lastGrade);

        double averageGrade = grades.getAverage();
        System.out.println(averageGrade);
    }
}

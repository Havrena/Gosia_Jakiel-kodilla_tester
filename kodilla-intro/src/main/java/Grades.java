public class Grades {

    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];     //liczba 'slotów' dostępnych maksymalnie w tablicy
        this.size = 0;                 //obecny stan zapełnienia tablicy = obecna liczba wpisanych ocen
    }

    public void addGrade(int grade) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = grade;  // w tablicy grades na indeksie size przypisuje wartość grade
        this.size++;                    // zwiększa wartość zmiennej size (indeksu) o jeden
    }

    public int getLastGrade() {
        return this.grades[this.size-1];

    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum = sum + grades[i];
        }

        return sum/ this.size;
    }
}

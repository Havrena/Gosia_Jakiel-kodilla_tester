public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2019);
        getData(notebook);

        Notebook heavyNotebook = new Notebook(2000, 1500, 2017);
        getData(heavyNotebook);

        Notebook oldNotebook = new Notebook(1600, 500, 2015);
        getData(oldNotebook);
    }

    public static void getData(Notebook notebook) {
        System.out.println(notebook.weight + "g " + notebook.price + "$ " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
    }
}
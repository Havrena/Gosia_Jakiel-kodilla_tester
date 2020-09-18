public class Notebook {
        int weight;
        int price;
        int year;

        public Notebook(int weight, int price, int year) {
                this.weight = weight;
                this.price = price;
                this.year = year;
        }
        public void checkPrice() {
                if (this.price < 600) {
                        System.out.println("This notebook is very cheap.");
                }
                else if (this.price >= 600 && this.price <= 1000) {
                        System.out.println("The price is good.");
                }
                else if (this.price > 1000) {
                        System.out.println("This notebook is expensive.");
                }
        }

        public void checkWeight() {
                if (this.weight < 800) {
                        System.out.println("This notebook is very light.");
                }
                else if (this.weight >= 800 && this.price <= 1700) {
                        System.out.println("This notebook is not very heavy.");
                }
                else if (this.weight > 1700) {
                        System.out.println("This notebook is extremely heavy.");
                }
        }

        public void checkYearAndPrice() {
                if (this.year <= 2015 && this.price < 600) {
                        System.out.println("This notebook is quite old but very cheap.");
                }
                else if (this.year == 2017 && this.price <= 1500) {
                        System.out.println("This notebook is not very old but quite pricey.");
                }
                else if (this.year >= 2019 && this.price <= 1000) {
                        System.out.println("This notebook is almost new and not that expensive.");
                }
        }

}


class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double calculateCost() {
        return rentalDays * 1000;
    }

    public static void main(String[] args) {
        CarRental r = new CarRental("Ravi", "Honda", 5);
        System.out.println(r.customerName + " " + r.carModel + " " + r.rentalDays);
        System.out.println("Total Cost: " + r.calculateCost());
    }
}


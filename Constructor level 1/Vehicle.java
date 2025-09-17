class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000;

    Vehicle(String o, String v) {
        ownerName = o;
        vehicleType = v;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType + " Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(1500);
        Vehicle v2 = new Vehicle("Amit", "Bike");
        v2.displayVehicleDetails();
    }
}

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String d, double s) {
        employeeID = id;
        department = d;
        salary = s;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String level;

    Manager(int id, String d, double s, String l) {
        super(id, d, s);
        level = l;
    }

    void display() {
        System.out.println(employeeID + " " + department + " " + getSalary() + " " + level);
    }

    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 60000, "Senior");
        m.display();
    }
}


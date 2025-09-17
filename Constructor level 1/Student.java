class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int r, String n, double c) {
        rollNumber = r;
        name = n;
        CGPA = c;
    }

    public void setCGPA(double c) {
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int r, String n, double c, String s) {
        super(r, n, c);
        specialization = s;
    }

    void display() {
        System.out.println(rollNumber + " " + name + " " + getCGPA() + " " + specialization);
    }

    public static void main(String[] args) {
        PostgraduateStudent p = new PostgraduateStudent(101, "Navroop", 8.5, "AI");
        p.display();
    }
}


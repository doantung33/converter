package test;

public class Student {
    private String name;
    private int tuoi;
    private static String diachia = "HD";

    Student(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }

    static void abc() {
        diachia = "Gl";
    }

    void hienthi() {
        System.out.println(name + " " + tuoi + " " + diachia);
    }

    public static void main(String[] args) {
        Student.abc();
        Student student = new Student("tung" ,18);
        student.hienthi();

    }
}
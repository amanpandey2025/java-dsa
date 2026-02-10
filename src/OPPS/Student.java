package OPPS;

public class Student {
    String name;
    float marks;
    String Department;
    Student(){
        this.Department = "c";
        this.marks = 99;
        this.name = "aman";
    }

    public static void main(String[] args) {
        Student aman = new Student();
        System.out.println(aman.name);
        System.out.println(aman.Department);
    }

}

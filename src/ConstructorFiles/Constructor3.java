//Title: Copying the values of one object into another using Java constructor.

package ConstructorFiles;

class Student {
    private final int id;
    private final String name;
    
    Student(int i, String n) {
        id = i;
        name = n;
    }
    
    Student(Student s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}  

public class Constructor3 {
    public static void main(String[] args) {
        Student s1 = new Student(69, "Shubham");
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}
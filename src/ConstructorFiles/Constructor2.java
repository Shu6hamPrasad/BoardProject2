//Title: User Defined Datatype

package ConstructorFiles;

class StudentMarks {
    private static int sub1;
    private static int sub2;
    private static int sub3;
    private static int sub4;
    private static double average;
    private static String name;

    public StudentMarks(String name, int sub1, int sub2, int sub3, int sub4) {
        StudentMarks.sub1 = sub1;
        StudentMarks.sub2 = sub2;
        StudentMarks.sub3 = sub3;
        StudentMarks.sub4 = sub4;
        StudentMarks.name = name;
    }

    public void average() {
        average = ((sub1 + sub2 + sub3 + sub4) / 2.0D);
    }

    public void print() {
        System.out.println("Marks of " + name + ": ");
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
        System.out.println("Subject 4: " + sub4);
        System.out.println("Average: " + average);
    }
}

public class Constructor2 {
    public static void main(String[] args) {
        StudentMarks s = new StudentMarks("Shubham", 45, 50, 47, 46);
        s.average();
        s.print();
    }
}

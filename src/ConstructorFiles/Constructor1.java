//Title: Demonstration of Constructor Overloading

package ConstructorFiles;

class ShapeArea {
    private static int area;

    public ShapeArea(int x) {
        area = x * x;
    }

    public ShapeArea(int x, int y) {
        area = x * y;
    }

    public void print() {
        System.out.println(area);
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        ShapeArea s1 = new ShapeArea(12);
        s1.print();

        ShapeArea s2 = new ShapeArea(11, 13);
        s2.print();
    }
}

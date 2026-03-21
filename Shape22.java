class Shape {

    double d1, d2;

    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}

class Triangle extends Shape {

    void area() {
        double area = 0.5 * d1 * d2;

        System.out.println("Vrunda Vaghela (250393107016)\n");
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape {

    void area() {
        double area = d1 * d2;'/;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Shape22 {

    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.getData(10, 5);
        t.area();

        Rectangle r = new Rectangle();
        r.getData(8, 4);
        r.area();
    }
}
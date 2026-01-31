class Rectangle13
{
    double width;
    double height;

    Rectangle13(double w, double h){
        width = w;
        height = h;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return 2 * (width + height);
    }

    void display(){
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public static void main(String[] args){
        Rectangle13 r1 = new Rectangle13(4, 40);
        Rectangle13 r2 = new Rectangle13(3.5, 35.9);

        System.out.println("Rectangle 1:");
        r1.display();

        System.out.println("\nRectangle 2:");
        r2.display();

        if(r1.getArea() > r2.getArea()){
            System.out.println("\nRectangle 1 has larger area");
        }
        else if(r1.getArea() < r2.getArea()){
            System.out.println("\nRectangle 2 has larger area");
        }
        else{
            System.out.println("\nBoth rectangles have equal area");
        }
    }
}

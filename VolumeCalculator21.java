class VolumeCalculator21 {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(double radius, boolean sphere) {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        VolumeCalculator21 obj = new VolumeCalculator21();

        System.out.println("Vrunda Vaghela (250393107016)\n");

        System.out.println("Volume of Cube: " + obj.calculateVolume(4));

        System.out.println("Volume of Rectangular Cube: " + obj.calculateVolume(5, 6, 7));

        System.out.println("Volume of Sphere: " + obj.calculateVolume(3, true));
    }
}
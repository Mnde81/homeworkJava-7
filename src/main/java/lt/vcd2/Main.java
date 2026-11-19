package lt.vcd1;


public class Main {
    public static void main(String[] args) {

        // Sukurti Point objekta
        Point p1 = new Point(5, 3);

        // Testuoti geterius
        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());

        // Testuoti distanceFromOrigin()
        System.out.println("Distance from origin: "
                + p1.distanceFromOrigin());

        // Testuoti seterius
        p1.setX(6);
        p1.setY(4);
        System.out.println("After setters: " + p1);

        // Testuoti translate()
        p1.translate(2, 1);
        System.out.println("After translation: " + p1);

        // Sukurti kita taska
        Point p2 = new Point(10, 8);

        // Testuoti distance()
        System.out.println("Distance between points: "
                + p1.distance(p2));

        // Testuoti setLocation()
        p1.setLocation(1, 2);
        System.out.println("After setLocation(): " + p1);

        // Testuoti toString()
        System.out.println("Point p1: " + p1);
        System.out.println("Point p2: " + p2);
    }
}


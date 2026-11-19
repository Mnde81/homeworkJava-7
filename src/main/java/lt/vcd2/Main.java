package lt.vcd2;


public class Main {
    public static void main(String[] args) {


        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 6);


        Line line1 = new Line(p1, p2);

        System.out.println(line1);


        System.out.println("Line length: " + line1.length());


        System.out.println("Starting point: " + line1.getP1());
        System.out.println("Ending point: " + line1.getP2());


        line1.setP1(new Point(1, 1));
        line1.setP2(new Point(4, 5));

        System.out.println("Updated line: " + line1);
        System.out.println("Updated length: " + line1.length());


        Line line2 = new Line();

        System.out.println("Default line: " + line2);
        System.out.println("Default length: " + line2.length());
    }
}


package lt.vcd2;


public class Line {
    private Point p1;
    private Point p2;


    public Line() {
        p1 = new Point(0, 0);
        p2 = new Point(0, 0);
    }


    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }


    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }


    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }


    @Override
    public String toString() {
        return "Line from " + p1 + " to " + p2;
    }


    public double length() {
        return p1.distance(p2);
    }
}

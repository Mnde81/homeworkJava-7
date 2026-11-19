package lt.vcd1;



// Reprezentuoja taska dvimateje erdveje.

public class Point {

    // X tasko koordinate.
    private int x;

    // Y tasko koordinate.
    private int y;


    // Sukuria taska su numatytomis koordinatemis.
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Gauna X koordinate.
    public int getX() {
        return x;
    }

    // Setina X koordinate.
    public void setX(int x) {
        this.x = x;
    }

    // Gauna Y koordinate.
    public int getY() {
        return y;
    }

    // Setina Y koordinate.
    public void setY(int y) {
        this.y = y;
    }


    // Suskaiciuoja atstuma iki 0, 0 tasko.
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Pastumia taska su nurodytomis reiksmemis.
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // Isveda taska kaip stringa formate [x;y].
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }


    // Apskaiciuoja atstuma tarp dvieju tasku.
    public double distance(Point p) {
        int dx = x - p.x;
        int dy = y - p.y;

        return Math.sqrt(dx * dx + dy * dy);
    }


    // Atnaujina abi tasko koordinates.
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

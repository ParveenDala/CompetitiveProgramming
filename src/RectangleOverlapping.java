/******
 * Parveen Dala
 * Finding the points of the overlap between two rectangles.
 */
public class RectangleOverlapping {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(new Point(1, 1), new Point(5, 5));
        Rectangle r2 = new Rectangle(new Point(2, 2), new Point(3, 9));
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        findOverlap(r1, r2);
    }

    private static void findOverlap(Rectangle r1, Rectangle r2) {
        Rectangle rectangle = new Rectangle();

        rectangle.bottomLeft.x = Math.max(r1.bottomLeft.x, r2.bottomLeft.x);
        rectangle.bottomLeft.y = Math.max(r1.bottomLeft.y, r2.bottomLeft.y);

        rectangle.bottomRight.x = Math.min(r1.bottomRight.x, r2.bottomRight.x);
        rectangle.bottomRight.y = Math.max(r1.bottomRight.y, r2.bottomRight.y);

        rectangle.topLeft.x = Math.max(r1.topLeft.x, r2.topLeft.x);
        rectangle.topLeft.y = Math.min(r1.topLeft.y, r2.topLeft.y);

        rectangle.topRight.x = Math.min(r1.topRight.x, r2.topRight.x);
        rectangle.topRight.y = Math.min(r1.topRight.y, r2.topRight.y);

        if (rectangle.bottomRight.x - rectangle.bottomLeft.x < 0 && rectangle.topRight.y - rectangle.bottomRight.y < 0) {
            System.out.println("Doesn't overlap");
        } else {
            System.out.println("Overlapped rectangle\n" + rectangle.toString());
        }
    }
}

class Rectangle {
    protected Point bottomLeft, bottomRight, topLeft, topRight;

    public Rectangle() {
        bottomLeft = new Point();
        bottomRight = new Point();
        topLeft = new Point();
        topRight = new Point();
    }

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
        this.bottomRight = new Point(topRight.x, bottomLeft.y);
        this.topLeft = new Point(bottomLeft.x, topRight.y);
    }

    @Override
    public String toString() {
        return topLeft.toString() + "    " + topRight.toString()
                + "\n" +
                bottomLeft.toString() + "    " + bottomRight.toString() + "\n";
    }
}

class Point {
    protected int x;
    protected int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}

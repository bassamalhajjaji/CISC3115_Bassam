public class hw4 {

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class Rectangle {
        int x;
        int y;
        int width;
        int height;

        public Rectangle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    }

    public static void rectmovleft(Rectangle box, Point p) {
        if (p.x < 0) {
            throw new IllegalArgumentException("Usage: input x is not legal");
        }

        box.x = box.x + p.x;
        box.y = box.y + p.y;
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4);
        Rectangle box = new Rectangle(0, 0, 100, 200);

        try {
            rectmovleft(box, p);
            System.out.println("New box attributes:");
            System.out.println("x: " + box.x);
            System.out.println("y: " + box.y);
            System.out.println("width: " + box.width);
            System.out.println("height: " + box.height);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

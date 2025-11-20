public class Rectangle {
    private double width;
    private double height;

    // Constructeur par défaut
    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) throw new IllegalArgumentException("Width cannot be negative");
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) throw new IllegalArgumentException("Height cannot be negative");
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle();
        r2.setWidth(4);
        r2.setHeight(6);

        System.out.println("R1 area = " + r1.area());
        System.out.println("R2 area = " + r2.area());
    }
}
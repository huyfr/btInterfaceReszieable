public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "A rectangle with width = " + getWidth() + " and length = " + getHeight() +", which is a subclass of "+ super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width = this.width*(percent/100);
        this.height = this.height*(percent/100);
    }
}


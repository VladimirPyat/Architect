package HW3.ISP;

public class Triangle implements iFigureArea{
    private double height;
    private double length1;

    public Triangle(double height, double length1) {
        this.height = height;
        this.length1 = length1;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength1(double length1) {
        this.length1 = length1;
    }

    public double getHeight() {
        return height;
    }

    public double getLength1() {
        return length1;
    }


    @Override
    public double getArea() {
        return length1*height/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", length1=" + length1 +
                '}';
    }
}

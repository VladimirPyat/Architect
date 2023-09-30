package HW3.ISP;

public class Pyramid3 implements iFigureVolume{
    private double triangleHeight;
    private double triangleLength1;
    private double pyramidHeight;

    public Pyramid3(double triangleHeight, double triangleLength1, double pyramidHeight) {
        this.triangleHeight = triangleHeight;
        this.triangleLength1 = triangleLength1;
        this.pyramidHeight = pyramidHeight;
    }

    public double getTriangleHeight() {
        return triangleHeight;
    }

    public double getTriangleLength1() {
        return triangleLength1;
    }

    public double getPyramidHeight() {
        return pyramidHeight;
    }

    public void setTriangleHeight(double triangleHeight) {
        this.triangleHeight = triangleHeight;
    }

    public void setTriangleLength1(double triangleLength1) {
        this.triangleLength1 = triangleLength1;
    }

    public void setPyramidHeight(double pyramidHeight) {
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public String toString() {
        return "Pyramid3{" +
                "triangleHeight=" + triangleHeight +
                ", triangleLength1=" + triangleLength1 +
                ", pyramidHeight=" + pyramidHeight +
                '}';
    }


    @Override
    public double getVolume() {
        return triangleLength1*triangleHeight/2*pyramidHeight/3;
    }
}

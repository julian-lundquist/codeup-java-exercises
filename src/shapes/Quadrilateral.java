package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected Double length;
    protected Double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    public Double getLength() {
//        return length;
//    }
//
//    public Double getWidth() {
//        return width;
//    }
//
//    abstract void setLength(Double length);
//    abstract void setWidth(Double width);
}

package base;

public class ShapeBase implements ShapeInterface {

    public ShapeBase(String name) {
        this.name = name;
    }

    public ShapeBase(String name, double width, double radius, double edge) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String name;

    public ShapeBase(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    protected double width;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected double radius;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    protected double edge;




    @Override
    public double calculateVolume() {
        return 0;
    }
}

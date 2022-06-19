package shape;

import base.ShapeBase;

public class Cube extends ShapeBase {


    public Cube(String name, double width, double edge, double radius) {
        super(name, width, edge, radius);
    }

    public double calculateVolume(){
        return width*width*width;
    }
}

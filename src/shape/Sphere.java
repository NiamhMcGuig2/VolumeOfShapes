package shape;

import base.ShapeBase;

public class Sphere extends ShapeBase {

    public Sphere(String name, double radius, double edge, double width){
        super(name, radius, edge, width);
    }

    public double calculateVolume(){
        return (4.0/3.0)*Math.PI*(radius*radius*radius);
    }
}

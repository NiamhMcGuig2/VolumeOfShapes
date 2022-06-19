package shape;

import base.ShapeBase;

public class Tetrahedron extends ShapeBase {

    public Tetrahedron(String name, double edge, double width, double radius) {
        super(name, edge, width, radius);
    }
    public double calculateVolume(){
        return (edge*edge*edge)/(6*Math.sqrt(2));
    }
}

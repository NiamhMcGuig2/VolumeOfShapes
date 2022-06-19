package Main;

import base.ShapeBase;
import shape.Cube;
import shape.Sphere;
import shape.Tetrahedron;

public class Test {

    private static void displayVolume(ShapeBase base){

        System.out.println("Display volume for shape: "+ base.getName());
        System.out.println("The volume is " +base.calculateVolume());
    }

    public static void main(String[] args){

        ShapeBase[] shapes = new ShapeBase[6];
        shapes [0] = new Sphere("sphere",1, 0, 0);
        shapes [1] = new Sphere("sphere", 5, 0, 0);
        shapes [2] = new Cube("cube", 1, 0, 0);
        shapes [3] = new Cube("cube", 5, 0, 0);
        shapes [4] = new Tetrahedron("tetrahedron", 1, 0, 0);
        shapes [5] = new Tetrahedron("tetrahedron", 5, 0, 0);

        for(int i=0; i< shapes.length; i++){
            displayVolume(shapes[i]);

        }
    }
}

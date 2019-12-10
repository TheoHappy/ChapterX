package ShapeHierarchy;

import ShapeHierarchy.ThreeDimensionalShapes.Cube;
import ShapeHierarchy.ThreeDimensionalShapes.Sphere;
import ShapeHierarchy.ThreeDimensionalShapes.Tetrahedron;
import ShapeHierarchy.TwoDimensionalShapes.Circle;
import ShapeHierarchy.TwoDimensionalShapes.Square;
import ShapeHierarchy.TwoDimensionalShapes.Triangle;

public class ShapeHierarclyTest {
    public static void main(String[] args) {
        TwoDimensionalShape circle = new Circle(3);
        TwoDimensionalShape square = new Square(4);
        TwoDimensionalShape triangle = new Triangle(10, 4);

        ThreeDimensionalShape sphere = new Sphere(5);
        ThreeDimensionalShape cube = new Cube(4);
        ThreeDimensionalShape tetrahedron = new Tetrahedron(6);

        Shape[] shapes = new Shape[6];

        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;
        shapes[3] = sphere;
        shapes[4] = cube;
        shapes[5] = tetrahedron;

        for (Shape currentShape : shapes) {
            System.out.println();
            System.out.println(currentShape);
            if (currentShape instanceof TwoDimensionalShape) {
                TwoDimensionalShape shape =
                        (TwoDimensionalShape) currentShape;
                System.out.printf("Is a %s%nand its area is %.2f ",
                        shape.getClass().getName(), shape.getArea());
            }
            if (currentShape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape shape =
                        (ThreeDimensionalShape) currentShape;
                System.out.printf("Is a %s%nits area is %.2f and its volume is %.2f",
                        shape.getClass().getName(), shape.getArea(), shape.getVolume());
            }
        }

    }
}

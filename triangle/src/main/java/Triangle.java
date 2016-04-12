import java.util.Arrays;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double inputSide1, double inputSide2, double inputSide3) throws TriangleException {
        side1 = inputSide1;
        side2 = inputSide2;
        side3 = inputSide3;

        if (illegalTriangle()) throw new TriangleException();
    }

    public TriangleKind getKind() {
        if (side1 == side2 && side2 == side3) {
            return TriangleKind.EQUILATERAL;
        } else if (isIsosceles()) {
            return TriangleKind.ISOSCELES;
        } else {
            return TriangleKind.SCALENE;
        }
    }

    private boolean illegalTriangle() {
        double[] sides = new double[]{side1, side2, side3};
        Arrays.sort(sides);

        return (side1 <= 0 || side2 <= 0 || side3 <= 0) || ((sides[0] + sides[1]) <= sides[2]);
    }

    private boolean isIsosceles() {
        return (side1 == side2 && side3 != side1) || (side1 == side3 && side2 != side1) || (side2 == side3 && side1 != side2);
    }

}

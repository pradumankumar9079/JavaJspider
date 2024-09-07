// 1. Calculate are of
//  1.1 Circle
//  1.2 Traingle --> 1/2*base*height 
//  1.3 Rhombus  --> 1/2*d1*d2
//  1.4 Cylinder --> 

// 2. Calculate Square and Cube of a number
// 3. p=75; c=78; m=65; optional=82;
// calculate total percentage

public class Assignement1 {
    public static void main(String[] args) {
        // 1. Calculate are of
        // 1.1 Circle
        // 1.2 Traingle --> 1/2*base*height
        // 1.3 Rhombus --> 1/2*d1*d2
        // 1.4 Cylinder -->
        float pi = (22 / 7.0f);
        float r = 2.3f;
        double AreaOfCircle = pi * r * r;
        System.out.println("Area of Circle " + AreaOfCircle);

        float base = 4.5f, height = (float) 4.9;
        float AreaOfTriangle = 1 / 2.0f * base * height;
        System.out.println("Area of Triangle " + AreaOfTriangle);

        float d1 = 4.5f, d2 = (float) 4.9;
        float AreaOfRhombus = 1 / 2.0f * base * height;
        System.out.println("Area of Triangle " + AreaOfRhombus);

        double radiusOfCylinder = 3.44;
        int heightOfCylinder = 5;
        double piValue = 22 / 7.0;
        double AreaOfCylinder = (2 * piValue * radiusOfCylinder * heightOfCylinder)
                + (piValue * radiusOfCylinder * radiusOfCylinder);
        System.out.println("Area Of Cylinder " + AreaOfCylinder);

        // 2. Calculate Square and Cube of a number
        float num1 = 4.6f;
        float squareOfANumber = num1 * num1;
        float cubeOfANumber = num1 * num1 * num1;
        System.out.println("Square of a Number " + squareOfANumber);
        System.out.println("Cube of a Number " + cubeOfANumber);

        // 3. p=75; c=78; m=65; optional=82;
        // calculate total percentage
        int physics = 75, chemistry = 78, math = 65, optional = 82;
        int totalMarksGot = physics + chemistry + math + optional;
        float totalMarks = (float) 400;
        float percentage = (totalMarksGot / totalMarks) * 100;
        System.out.println(percentage + "% Marks got");

    }
}

package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Prepare to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        shapeCollector.addFigure(square);

        Assert.assertEquals(1, shapeCollector.getSquareCircleTriangleList().size());

    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.addFigure(circle);
        Triangle triangle = new Triangle();
        shapeCollector.addFigure(triangle);

        shapeCollector.removeFigure(triangle);

        Assert.assertEquals(1,shapeCollector.getSquareCircleTriangleList().size());

    }

    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        shapeCollector.addFigure(square);

        Shape shape = shapeCollector.getFigure(0);

        Assert.assertEquals(square,shape);

    }

}

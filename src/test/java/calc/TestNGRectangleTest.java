package calc;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGRectangleTest {

    @Test
    public void getPositiveLength() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(rectangle.getLength(), 1d, 0.00001, "Positive length is not correct");
    }

    @Test
    public void getNegativeLength() {
        Rectangle rectangle = new Rectangle(-5, 4);
        assertEquals(rectangle.getLength(), -5, 0.00001, "Negative length is not correct");
    }

    @Test
    public void getPositiveWidth() {
        Rectangle rectangle = new Rectangle(5, 6);
        assertEquals(rectangle.getWidth(), 6, 0.00001, "Positive width is not correct");
    }

    @Test
    public void getNegativeWidth() {
        Rectangle rectangle = new Rectangle(0, -9);
        assertEquals(rectangle.getWidth(), -9, 0.00001, "Negative width is not correct");
    }

    @Test
    public void getDoubleLength() {
        Rectangle rectangle = new Rectangle(1.4, 0);
        assertEquals(rectangle.getLength(), 1.4, 0.00001, "Length is not correct");
    }

    @Test
    public void getDoubleWidth() {
        Rectangle rectangle = new Rectangle(0, -25.2);
        assertEquals(rectangle.getWidth(), -25.2, 0.00001, "Width is not correct");
    }

    @Test
    public void getAreaWithPositiveNums() {
        Rectangle rectangle = new Rectangle(4, 500);
        assertEquals(rectangle.getArea(), 2000, 0.00001, "Area is not correct");
    }

    @Test
    public void getAreaWithNegativeNums() {
        Rectangle rectangle = new Rectangle(-2, -3);
        assertEquals(rectangle.getArea(), 6, 0.00001, "Area is not correct");
    }

    @Test
    public void getAreaWithFirsNegativeNum() {
        Rectangle rectangle = new Rectangle(-2, 10);
        assertEquals(rectangle.getArea(), -20, 0.00001, "Area is not correct");
    }

    @Test
    public void getAreaWithSecondNegativeNum() {
        Rectangle rectangle = new Rectangle(1, -101);
        assertEquals(rectangle.getArea(), -101, 0.00001, "Area is not correct");
    }

    @Test
    public void getAreaWithZeroNums() {
        Rectangle rectangle = new Rectangle(0, 0);
        assertEquals(rectangle.getArea(), 0, 0.00001, "Area is not correct");
    }

    @Test
    public void getAreaWithDoubleNums() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        assertEquals(rectangle.getArea(), -1.52, 0.00001, "Area is not correct");
    }

    @Test
    public void setPositiveLength() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setLength(2);
        assertEquals(rectangle.getLength(), 2, 0.00001, "Length is not correct");
    }

    @Test
    public void setNegativeLength() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setLength(-9);
        assertEquals(rectangle.getLength(), -9, 0.00001, "Length is not correct");
    }

    @Test
    public void setDoubleLength() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setLength(5.2);
        assertEquals(rectangle.getLength(), 5.2, 0.00001, "Length is not correct");
    }

    @Test
    public void setZeroLength() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setLength(0);
        assertEquals(rectangle.getLength(), 0, 0.00001, "Length is not correct");
    }

    @Test
    public void setPositiveWidth() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setWidth(7);
        assertEquals(rectangle.getWidth(), 7, 0.00001, "Width is not correct");
    }

    @Test
    public void setNegativeWidth() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setWidth(-1000);
        assertEquals(rectangle.getWidth(), -1000, 0.00001, "Width is not correct");
    }

    @Test
    public void setDoubleWidth() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setWidth(-10000.1);
        assertEquals(rectangle.getWidth(), -10000.1, 0.00001, "Width is not correct");
    }

    @Test
    public void setZeroWidth() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setWidth(0);
        assertEquals(rectangle.getWidth(), 0, 0.00001, "Width is not correct");
    }
}

package jUnit.calc;

import calc.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void getPositiveLength() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals("Positive length is not correct", 1d, rectangle.getLength(), 0.00001);
    }

    @Test
    public void getNegativeLength() {
        Rectangle rectangle = new Rectangle(-5, 4);
        assertEquals("Negative length is not correct", -5, rectangle.getLength(), 0.00001);
    }

    @Test
    public void getPositiveWidth() {
        Rectangle rectangle = new Rectangle(5, 6);
        assertEquals("Positive width is not correct", 6, rectangle.getWidth(), 0.00001);
    }

    @Test
    public void getNegativeWidth() {
        Rectangle rectangle = new Rectangle(0, -9);
        assertEquals("Negative width is not correct", -9, rectangle.getWidth(), 0.00001);
    }

    @Test
    public void getDoubleLength() {
        Rectangle rectangle = new Rectangle(1.4, 0);
        assertEquals("Length is not correct", 1.4, rectangle.getLength(), 0.00001);
    }

    @Test
    public void getDoubleWidth() {
        Rectangle rectangle = new Rectangle(0, -25.2);
        assertEquals("Width is not correct", -25.2, rectangle.getWidth(), 0.00001);
    }

    @Test
    public void getAreaWithPositiveNums() {
        Rectangle rectangle = new Rectangle(4, 500);
        assertEquals("Area is not correct", 2000, rectangle.getArea(), 0.00001);
    }

    @Test
    public void getAreaWithNegativeNums() {
        Rectangle rectangle = new Rectangle(-2, -3);
        assertEquals("Area is not correct", 6, rectangle.getArea(), 0.00001);
    }

    @Test
    public void getAreaWithFirsNegativeNum() {
        Rectangle rectangle = new Rectangle(-2, 10);
        assertEquals("Area is not correct", -20, rectangle.getArea(), 0.00001);
    }

    @Test
    public void getAreaWithSecondNegativeNum() {
        Rectangle rectangle = new Rectangle(1, -101);
        assertEquals("Area is not correct", -101, rectangle.getArea(), 0.00001);
    }

    @Test
    public void getAreaWithZeroNums() {
        Rectangle rectangle = new Rectangle(0, 0);
        assertEquals("Area is not correct", 0, rectangle.getArea(), 0.00001);
    }

    @Test
    public void getAreaWithDoubleNums() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        assertEquals("Area is not correct", -1.52, rectangle.getArea(), 0.00001);
    }

    @Test
    public void setPositiveLength() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setLength(2);
        assertEquals("Length is not correct", 2, rectangle.getLength(), 0.00001);
    }

    @Test
    public void setNegativeLength() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setLength(-9);
        assertEquals("Length is not correct", -9, rectangle.getLength(), 0.00001);
    }

    @Test
    public void setDoubleLength() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setLength(5.2);
        assertEquals("Length is not correct", 5.2, rectangle.getLength(), 0.00001);
    }

    @Test
    public void setZeroLength() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setLength(0);
        assertEquals("Length is not correct", 0, rectangle.getLength(), 0.00001);
    }

    @Test
    public void setPositiveWidth() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setWidth(7);
        assertEquals("Width is not correct", 7, rectangle.getWidth(), 0.00001);
    }

    @Test
    public void setNegativeWidth() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setWidth(-1000);
        assertEquals("Width is not correct", -1000, rectangle.getWidth(), 0.00001);
    }

    @Test
    public void setDoubleWidth() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setWidth(-10000.1);
        assertEquals("Width is not correct", -10000.1, rectangle.getWidth(), 0.00001);
    }

    @Test
    public void setZeroWidth() {
        Rectangle rectangle = new Rectangle(0.2, -7.6);
        rectangle.setWidth(0);
        assertEquals("Width is not correct", 0, rectangle.getWidth(), 0.00001);
    }
}

package edu.uob;

public class Circle extends TwoDimensionalShape {
  int radius;

  public Circle(int r) {
    radius = r;
  }

  public double calculateArea() {
    return (int) Math.round(Math.PI * radius * radius);
  }

  public int calculatePerimeterLength() {
    return (int) Math.round(Math.PI * radius * 2.0);
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " with radius " + radius + ", " + super.toString();
  }
}

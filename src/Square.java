package lab4.beans;

public class Square implements SquareMBean {

    private double radius;

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getAreaSquare() {
        double circleSquare = Math.PI * Math.pow(radius, 2) / 4;
        double rectangleSquare = radius * radius / 2;
        double triangleSquare = Math.pow(radius, 2) / 4;
        return circleSquare + rectangleSquare + triangleSquare;
    }
}
public class Square implements SquareMBean {

    private double radius = 10;

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
        double circleSquare = Math.PI * Math.pow(radius, 2) / 16;
        double rectangleSquare = radius * radius / 2;
        double triangleSquare = Math.pow(radius, 2) / 8;
        return circleSquare + rectangleSquare + triangleSquare;
    }
}
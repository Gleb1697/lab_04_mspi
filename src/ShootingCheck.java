public class ShootingCheck {
    public static boolean checkDot(double x, double y, double r) {
        boolean squareCheck, triangleCheck, circleCheck;
        squareCheck = (x <= 0 && x >= -r) && (y >= 0 && y <= r/2);
        triangleCheck = (x >= 0 && x <= r) && (y <= 0 && y >= -r/2) && (y <= x/2 - r/2);
        circleCheck = (x <= 0 && x >= -r) && (y <= 0 && y >= -r) && (x*x + y*y < r*r);
        return squareCheck || triangleCheck || circleCheck;
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.io.*;

public class History {
    private static ArrayList<Dot> dots = new ArrayList<>();

    public static void addDot(Dot dot) {
        dots.add(dot);
    }

    public static void showDots() {
        if (!dots.isEmpty()) {
            //System.out.println("X\t\tY\t\tR\t\tРезультат");
            for (Dot dot : dots) {
                //System.out.printf("%5.2f\t", dot.getXCoordinate());
                //System.out.printf("%5.2f\t", dot.getYCoordinate());
                //System.out.printf("%5.2f\t", dot.getRRadius());
                System.out.printf("X: %.3f, Y: %.3f, R: %.3f Итог: ", dot.getXCoordinate(), dot.getYCoordinate(), dot.getRRadius());
                System.out.println(dot.getGotHit());
            }
        } else if (dots.isEmpty()) {
            System.out.println("Выстрелов еще не было");
        } else {
            System.out.println("Ошибка");
        }
    }
}

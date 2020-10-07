import java.util.Scanner;

public class Shot {
    /*
    public static void newShot() {
        Scanner keyboard = new Scanner(System.in);
        Dot dot = new Dot();
        System.out.println("Введите координату X");
        dot.setXCoordinate(keyboard.nextDouble());
        System.out.println("Введите координату Y");
        dot.setYCoordinate(keyboard.nextDouble());
        System.out.println("Введите радиус R");
        dot.setRRadius(keyboard.nextDouble());
        System.out.println("Стреляем!");
        dot.setGotHit(ShootingCheck.checkDot(dot.getXCoordinate(), dot.getYCoordinate(), dot.getRRadius()));
        System.out.println(dot.getGotHit());
        History.addDot(dot);
    }
    */

    public static void newNewShot(String clientInput) throws Exception {
        Dot dot = new Dot();
        String stringOnlyNumbers = clientInput.replaceAll("shot\\s","");
        int i = 0;
        for (String numberString : stringOnlyNumbers.split(",\\s")) {
            i++;
            switch (i) {
                case 1:
                    dot.setXCoordinate(Double.parseDouble(numberString));
                    break;
                case 2:
                    dot.setYCoordinate(Double.parseDouble(numberString));
                    break;
                case 3:
                    dot.setRRadius(Double.parseDouble(numberString));
                    break;
                default:
                    break;
            }
        }
        System.out.println("Стреляем!");
        dot.setGotHit(ShootingCheck.checkDot(dot.getXCoordinate(), dot.getYCoordinate(), dot.getRRadius()));
        System.out.println(dot.getGotHit());
        History.addDot(dot);
    }
}

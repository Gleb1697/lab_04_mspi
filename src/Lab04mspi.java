import java.util.*;
import javax.management.*;
import java.lang.management.*;

public class Lab04mspi {
    public static void main(String[] args) {
        SimpleAgent agent = new SimpleAgent();
        new WorkWithClient(new Scanner(System.in)).startApp();
    }
}

package lab4;

import java.util.*;
import javax.management.*;
import java.lang.management.*;

import lab4.beans.*;

public class Lab04mspi {
    public static void main(String[] args) {
        SimpleAgent agent = new SimpleAgent();
        new WorkWithClient(new Scanner(System.in)).startApp();
    }
}

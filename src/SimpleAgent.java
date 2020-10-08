import javax.management.*;
import java.lang.management.*;
 
public class SimpleAgent 
{
    private MBeanServer mbs = null;
 
    public SimpleAgent() {
        mbs = ManagementFactory.getPlatformMBeanServer();
 
        Hello helloBean = new Hello();
        ObjectName helloName = null;

        PointsInfo pointsInfoBean = new PointsInfo();
        ObjectName pointsInfoName = null;

        Square squareBean = new Square();
        ObjectName squareName = null;
 
        try {
            helloName = new ObjectName("SimpleAgent:name=hellothere");
            mbs.registerMBean(helloBean, helloName);

            pointsInfoName = new ObjectName("SimpleAgent:name=pointsInfo");
            mbs.registerMBean(pointsInfoBean, pointsInfoName);

            squareName = new ObjectName("SimpleAgent:name=square");
            mbs.registerMBean(squareBean, squareName);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
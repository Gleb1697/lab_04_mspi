package lab4.beans;

import javax.management.*;
import java.lang.management.*;

import lab4.comands.*;
 
public class SimpleAgent 
{
    private MBeanServer mbs = null;
 
    public SimpleAgent() {
        mbs = ManagementFactory.getPlatformMBeanServer();

        PointsInfo pointsInfoBean = new PointsInfo();
        Shot.pointsInfo = pointsInfoBean;
        ObjectName pointsInfoName = null;

        Square squareBean = new Square();
        Shot.square = squareBean;
        ObjectName squareName = null;
 
        try {
            pointsInfoName = new ObjectName("SimpleAgent:name=pointsInfo");
            mbs.registerMBean(pointsInfoBean, pointsInfoName);

            squareName = new ObjectName("SimpleAgent:name=square");
            mbs.registerMBean(squareBean, squareName);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
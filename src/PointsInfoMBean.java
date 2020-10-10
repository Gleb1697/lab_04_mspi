package lab4.beans;

import javax.management.NotificationBroadcaster;

public interface PointsInfoMBean extends NotificationBroadcaster {
    int getPointsCount();
    int getHitPointsCount();
    void addPoint(boolean result);
}
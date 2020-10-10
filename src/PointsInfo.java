package lab4.beans;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class PointsInfo extends NotificationBroadcasterSupport implements PointsInfoMBean {
    private int pointsCount = 0;
    private int hitPointsCount = 0;
    private int sequenceNumber = 1;

    @Override
    public int getPointsCount() {
        return pointsCount;
    }

    @Override
    public int getHitPointsCount() {
        return hitPointsCount;
    }

    @Override
    public void addPoint(boolean gotHit) {
        pointsCount += 1;
        if (gotHit) {
            hitPointsCount += 1;
        }
        if (pointsCount % 10 == 0) {
            Notification n = new Notification(
                    "All points is divisible by 2",
                    this,
                    sequenceNumber++,
                    System.currentTimeMillis(),
                    "Suitable count of points"
            );
            sendNotification(n);
        }
    }
}
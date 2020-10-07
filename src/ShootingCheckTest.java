import org.junit.Assert;
import org.junit.Test;

public class ShootingCheckTest {
  boolean shotResult;

  @Test
  public void checkDotZeroRadiusTest() {
    shotResult = ShootingCheck.checkDot(1, 1, 0);
    org.junit.Assert.assertFalse(shotResult);
    shotResult = ShootingCheck.checkDot(-1, 1, 0);
    org.junit.Assert.assertFalse(shotResult);
    shotResult = ShootingCheck.checkDot(1, -1, 0);
    org.junit.Assert.assertFalse(shotResult);
    shotResult = ShootingCheck.checkDot(-1, -1, 0);
    org.junit.Assert.assertFalse(shotResult);
  }
}
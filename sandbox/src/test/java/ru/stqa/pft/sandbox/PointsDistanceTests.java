package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointsDistanceTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(0.0, 0.0);
    Point p2 = new Point(1.0, 0.0);
    Point p3 = new Point(0.0, 1.0);
    Point p4 = new Point(-1.0, 0.0);
    Point p5 = new Point(0.0, -1.0);

    Assert.assertEquals(p1.distance(p2), 1.0);
    Assert.assertEquals(p1.distance(p3), 1.0);
    Assert.assertEquals(p1.distance(p4), 1.0);
    Assert.assertEquals(p1.distance(p5), 1.0);

    Assert.assertEquals(p2.distance(p4), 2.0);
    Assert.assertEquals(p3.distance(p5), 2.0);

    Assert.assertEquals(p2.distance(p3), Math.sqrt(2.0));
    Assert.assertEquals(p3.distance(p4), Math.sqrt(2.0));
    Assert.assertEquals(p4.distance(p5), Math.sqrt(2.0));
    Assert.assertEquals(p5.distance(p2), Math.sqrt(2.0));
  }
}

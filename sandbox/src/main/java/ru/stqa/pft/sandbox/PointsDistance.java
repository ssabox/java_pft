package ru.stqa.pft.sandbox;

public class PointsDistance {

  public static void main(String[] args) {

    //Example 1: Distance between (1.0, 1.0) and (2.0, 2.0)
    Point p1 = new Point(1.0, 1.0);
    Point p2 = new Point(2.0, 2.0);
    System.out.println("Расстояние между точками с координатами " + "(" + p1.x + ", " + p1.y + ") " + "и " + "(" + p2.x + ", " + p2.y + ") " + "равно " + p1.distance(p2));

    //Example 2: Distance between (0.0, 0.0) and (-2.0, -2.0)
    Point p3 = new Point(0.0, 0.0);
    Point p4 = new Point(-2.0, -2.0);
    System.out.println("Расстояние между точками с координатами " + "(" + p3.x + ", " + p3.y + ") " + "и " + "(" + p4.x + ", " + p4.y + ") " + "равно " + p3.distance(p4));

    //Example 3: Distance between (-5.0, -1.0) and (-2.0, 1.0)
    Point p5 = new Point(-5.0, -1.0);
    Point p6 = new Point(-2.0, 1.0);
    System.out.println("Расстояние между точками с координатами " + "(" + p5.x + ", " + p5.y + ") " + "и " + "(" + p6.x + ", " + p6.y + ") " + "равно " + p5.distance(p6));

    //Example 4: Distance between (5.0, 1.0) and (-2.0, -1.0)
    Point p7 = new Point(5.0, 1.0);
    Point p8 = new Point(-2.0, -1.0);
    System.out.println("Расстояние между точками с координатами " + "(" + p7.x + ", " + p7.y + ") " + "и " + "(" + p8.x + ", " + p8.y + ") " + "равно " + p7.distance(p8));

  }

}
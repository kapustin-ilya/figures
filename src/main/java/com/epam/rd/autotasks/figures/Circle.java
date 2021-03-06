package com.epam.rd.autotasks.figures;

class Circle extends Figure{
    Point a;
    double radius;
    public Circle(Point a, double radius) {
        this.a = a;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public String pointsToString() {
        return ("("+a.getX()+","+a.getY()+")");
    }
    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + radius + "]";
    }

    @Override
    public Point leftmostPoint() {
        return new Point(a.getX()-radius,a.getY());
    }
}

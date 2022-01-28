package com.epam.rd.autotasks.figures;

class Triangle extends Figure{
    Point a;
    Point b;
    Point c;
    double ab;
    double ac;
    double bc;

    public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
       ab = Math.sqrt((a.getX()- b.getX())*(a.getX()- b.getX())+(a.getY()- b.getY())*(a.getY()- b.getY()));
       ac = Math.sqrt((a.getX()- c.getX())*(a.getX()- c.getX())+(a.getY()- c.getY())*(a.getY()- c.getY()));
       bc = Math.sqrt((c.getX()- b.getX())*(c.getX()- b.getX())+(c.getY()- b.getY())*(c.getY()- b.getY()));
    }
    @Override
    public double area() {
        double s = (ab+ac+bc)/2;
        return Math.sqrt(s*(s-ab)*(s-bc)*(s-ac));
    }

    @Override
    public String pointsToString() {
        return ("("+a.getX()+","+a.getY()+")"+"("+b.getX()+","+b.getY()+")"+"("+c.getX()+","+c.getY()+")");
    }

    @Override
    public Point leftmostPoint() {
        if (a.getX() <= b.getX() && a.getX() <= c.getX()) return a;
        if (b.getX() <= a.getX() && b.getX() <= c.getX()) return b;
        return c;
    }
}

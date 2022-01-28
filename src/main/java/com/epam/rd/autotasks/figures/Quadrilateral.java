package com.epam.rd.autotasks.figures;

class Quadrilateral extends  Figure{
    Point a;
    Point b;
    Point c;
    Point d;
    double ab;
    double bc;
    double cd;
    double da;
    double ac;
    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        ab = Math.sqrt((a.getX()- b.getX())*(a.getX()- b.getX())+(a.getY()- b.getY())*(a.getY()- b.getY()));
        bc = Math.sqrt((c.getX()- b.getX())*(c.getX()- b.getX())+(c.getY()- b.getY())*(c.getY()- b.getY()));
        cd = Math.sqrt((d.getX()- c.getX())*(d.getX()- c.getX())+(d.getY()- c.getY())*(d.getY()- c.getY()));
        da = Math.sqrt((a.getX()- d.getX())*(a.getX()- d.getX())+(a.getY()- d.getY())*(a.getY()- d.getY()));

        ac = Math.sqrt((a.getX()- c.getX())*(a.getX()- c.getX())+(a.getY()- c.getY())*(a.getY()- c.getY()));
    }

    @Override
    public double area() {
        double s1 = (ab+ac+bc)/2;
        double s2 = (ac+cd+da)/2;
        return (Math.sqrt(s1*(s1-ab)*(s1-bc)*(s1-ac))+Math.sqrt(s2*(s2-ac)*(s2-cd)*(s2-da)));
    }

    @Override
    public String pointsToString() {
        return ("("+a.getX()+","+a.getY()+")"+"("+b.getX()+","+b.getY()+")"+"("+c.getX()+","+c.getY()+")"+"("+d.getX()+","+d.getY()+")");
    }

    @Override
    public Point leftmostPoint() {
        if (a.getX() <= b.getX() && a.getX() <= c.getX() && a.getX() <= d.getX()) return a;
        if (b.getX() <= a.getX() && b.getX() <= c.getX()&& b.getX() <= d.getX()) return b;
        if (c.getX() <= a.getX() && c.getX() <= b.getX()&& c.getX() <= d.getX()) return c;
        return d;
    }
}

package org.example;

public class Vector3D {
        final double x;
        final double y;
        final double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    public static void main(String[] args) {
        Vector3D vector = new Vector3D(2, 5, 9);
        System.out.println(vector.getX());
        System.out.println(vector.getY());
        System.out.println(vector.getZ());
    }
}
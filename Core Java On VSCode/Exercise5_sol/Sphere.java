// package com.gbg.shape;
package Exercise5_sol;

public class Sphere extends Shape {
    Sphere(int dim1){
        super(dim1, -1);
    }

    public double Area(){
        return 4 * Math.PI * this.dim1 * this.dim1;
    }
}
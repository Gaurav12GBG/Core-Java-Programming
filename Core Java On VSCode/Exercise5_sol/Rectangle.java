// package com.gbg.shape;
package Exercise5_sol;

public class Rectangle extends Shape {
    Rectangle(int dim1, int dim2){
        super(dim1, dim2);
    }

    public int Area(){
        return this.dim1 * this.dim2;
    }
}

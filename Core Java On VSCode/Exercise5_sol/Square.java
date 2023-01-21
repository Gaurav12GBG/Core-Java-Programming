// package com.gbg.shape;
package Exercise5_sol;

public class Square extends Shape {
    Square(int dim1){
        super(dim1,-1);
    }

    public int Area(){
        return this.dim1 * this.dim1;
    }
}
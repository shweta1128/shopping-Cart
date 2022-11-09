package com.techelevator;

public  class SquareWall extends RectangleWall {
    private int sideLength;
//    private String name;
//    private String color;


    public int getSideLength() {
        return sideLength;
    }

    public SquareWall(String name, String color, int sideLength) {
      //  super();
        super(name , color , sideLength , sideLength);
        this.sideLength = sideLength;

    }
    @Override
    public String toString() {
        return getName() + " " + "(" +
                  sideLength +
                "x" + sideLength +
                ")" + " " + "square";
    }

}

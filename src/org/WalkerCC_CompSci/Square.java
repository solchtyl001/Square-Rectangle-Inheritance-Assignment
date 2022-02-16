public final class Square extends Rectangle{

    public Square(double sideLength) {
        super(sideLength, sideLength);  

    }

    public double getSideLength(){
        return this.length;
    }

    public void setSideLength(double width){
        this.length = width;
        this.width = width;
        
    }


}

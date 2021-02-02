package thuchanh;

public class Geometric {
    private String color;
    private String filled;

    Geometric (){

    }
    Geometric(String color, String filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getFilled(){
        return filled;
    }
    public void setFilled(String filled){
        this.filled=filled;
    }
    public String toString(){
        return color +" "+ (filled==null ? "no fill ": "filled with ")+filled;
    }
}

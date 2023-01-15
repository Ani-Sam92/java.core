package chapter6;

public class BoxOne {
    double width;
    double height;
    double depth;
    BoxOne(double w, double d, double h){
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width * height * depth;

    }
}

package OPPS.inheritance;

public class first {
    double length;
    double breath;
    double height;

    first(){
        this.breath = -1;
        this.length = -1;
        this.height = -1;
    }
    first( double side){
        this.length = side;
        this.breath = side;
        this.height =  side;
    }

    first(double length, double breath, double height) {
        this.length = length;
        this.breath = breath;
        this.height = height;
    }
}

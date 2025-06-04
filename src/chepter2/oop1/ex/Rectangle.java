package chepter2.oop1.ex;

public class Rectangle {

    int width;

    int height;

    int area;

    int perimeter;

    boolean square;





    int calculateArea() {
        area = width * height;
        return area;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare (){
        return width == height;
    }


}

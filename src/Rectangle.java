public class Rectangle {
    int width;
    int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public void setWidth(int w){
        this.width = w;
    }
    public int getWidth(){
        return this.width;
    }
    public int area(){
        int area = width * length;
        return area;
    }
    public int perimeter(){
        int perimeter = (width * 2) + (length * 2);
        return perimeter;
    }
}
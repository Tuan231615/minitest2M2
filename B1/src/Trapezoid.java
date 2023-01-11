public class Trapezoid {
    private int smallEdge, bigEdge, height, side1, side2;

    Trapezoid(int smallEdge, int bigEdge, int height, int side1, int side2) {
        this.smallEdge = smallEdge;
        this.bigEdge = bigEdge;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSmallEdge() {
        return smallEdge;
    }

    public int getBigEdge() {
        return bigEdge;
    }

    public int getHeight() {
        return height;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSmallEdge(int smallEdge) {
        this.smallEdge = smallEdge;
    }

    public void setBigEdge(int bigEdge) {
        this.bigEdge = bigEdge;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int Area() {
        return ((this.height * (this.smallEdge + this.bigEdge)) / 2);
    }

    public int Perimeter() {
        return (this.bigEdge + this.smallEdge + this.side1 + this.side2);
    }

    @Override
    public String toString() {
        String status = "";
        if (height <= smallEdge || height < bigEdge) {
            status += "Đây là hình thang\n";
            status += "Diện tích là: " + Area();
            status += "\nChu vi là: " + Perimeter();
        } else {
            status += "Đây là hình thang\n";
        }
        return status;
    }
}

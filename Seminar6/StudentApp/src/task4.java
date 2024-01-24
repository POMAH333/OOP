/**
 * 4) Переписать код в соответствии с Liskov Substitution Principle:
 * public class Rectangle {
 * private int width;
 * private int height;
 * public void setWidth(int width) {
 * this.width = width;
 * }
 * public void setHeight(int height) {
 * this.height = height;
 * }
 * public int area() {
 * return this.width * this.height;
 * }
 * }
 * public class Square extends Rectangle {
 * 
 * @Override
 *           public void setWidth(int width) {
 *           super.width = width;
 *           super.height = width;
 *           }
 * @Override
 *           public void setHeight(int height) {
 *           super.width = height;
 *           super.height = height;
 *           }
 *           }
 */

public class Square {

    private int width;

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return this.width * this.width;
    }

    public int getWidth() {
        return width;
    }
}

public class Rectangle extends Square {

    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return super.getWidth() * this.height;
    }
}
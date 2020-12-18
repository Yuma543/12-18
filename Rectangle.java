package poly.kansai.ex;

public class Rectangle implements IFigure {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        // TODO 自動生成されたメソッド・スタブ
        return width;
    }

    @Override
    public int getHeight() {
        // TODO 自動生成されたメソッド・スタブ
        return height;
    }

    @Override
    public double getArea() {
        // TODO 自動生成されたメソッド・スタブ
        return (double) (width * height);
    }

}

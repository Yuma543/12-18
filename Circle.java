package poly.kansai.ex;

public class Circle implements IFigure {

    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        // TODO 自動生成されたメソッド・スタブ
        return radius * 2;
    }

    @Override
    public int getHeight() {
        // TODO 自動生成されたメソッド・スタブ
        return radius * 2;
    }

    @Override
    public double getArea() {
        // TODO 自動生成されたメソッド・スタブ
        return radius * radius * Math.PI;
    }
}

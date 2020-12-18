package poly.kansai.ex;

public class FigureMain {

    public static void main(String[] args) {
        Rectangle fig = new Rectangle(2, 5);
        showFigureInfo(fig);
    }

    static void showFigureInfo(Rectangle fig) {
        System.out.printf("幅：%d, 高さ：%d, 面積：%.2f\n",
                fig.getWidth(), fig.getHeight(), fig.getArea());
    }

}

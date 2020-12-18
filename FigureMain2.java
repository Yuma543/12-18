package poly.kansai.ex;

public class FigureMain2 {

    public static void main(String[] args) {
//        Rectangle figRec = new Rectangle(2, 5);
//        showFigureInfo(figRec);
//
//        Circle figCir = new Circle(3);
//        showFigureInfo(figCir);
//    }
//
//    static void showFigureInfo(Rectangle fig) {
//        System.out.println("["+ fig.getClass().getSimpleName() + "のインスタンス]");
//        System.out.printf("幅：%d, 高さ：%d, 面積：%.2f\n",
//                fig.getWidth(), fig.getHeight(), fig.getArea());
//    }
//
//    static void showFigureInfo(Circle fig) {
//        System.out.println("["+ fig.getClass().getSimpleName() + "のインスタンス]");
//        System.out.printf("[円]幅：%d, 高さ：%d, 面積：%.2f\n",
//                fig.getWidth(), fig.getHeight(), fig.getArea());
//    }

        //--------------------------------------------別解
        IFigure figRec = new Rectangle(2, 5);
        showFigureInfo(figRec);

        IFigure figCir = new Circle(3);
        showFigureInfo(figCir);
    }

    static void showFigureInfo(IFigure fig) {
        System.out.println("["+ fig.getClass().getSimpleName() + "のインスタンス]");
        System.out.printf("幅：%d, 高さ：%d, 面積：%.2f\n",
                fig.getWidth(), fig.getHeight(), fig.getArea());
    }
}

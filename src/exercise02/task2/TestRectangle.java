package exercise02.task2;

/**
 * Created by stefan on 27.10.16.
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(3, 5);
        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle(2, 4);
        System.out.println("Rect1 area: "+rect1.area());
        System.out.println("Rect2 area: "+rect2.area());
        System.out.println("Rect3 area: "+rect3.area());
        System.out.println("Is Rect1 area bigger than Rect2 area? "+Rectangle.areaIsBigger(rect1, rect2));
        System.out.println("Rect1 diagonal: "+rect1.diagonal());
        System.out.println("Rect2 diagonal: "+rect2.diagonal());
        System.out.println("Rect3 diagonal: "+rect3.diagonal());
    }
}

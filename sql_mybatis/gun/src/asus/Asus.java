package asus;

public class Asus implements SaleAsusComputer {
    public String salePc(double money) {
        System.out.println("买电脑花了"+money+"元");
        return "华硕电脑";
    }

    public void show() {
        System.out.println("显示电脑");
    }
}

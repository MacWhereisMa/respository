package asus;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        //创建一个华硕对象
         Asus asus = new Asus();
        //创建动态代理对象
        SaleAsusComputer proxy_asus = (SaleAsusComputer) Proxy.newProxyInstance(asus.getClass().getClassLoader(), asus.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
           /*     if (method.getName().equals("salePc")){
                    double money = (double)args[0];
                    money = money * 0.9;
                    String obj = (String) method.invoke(asus, money);
                    return obj + "哈哈";

                }else {
                    String obj = (String) method.invoke(asus, args);
                    return null;
                }*/
                return null;
            }
        });


        //现在用动态代理对象去调用真是对象里面的方法
        //华硕对象调用了salePc方法
        //String s1 = proxy_asus.salePc(6500);
        proxy_asus.show();
       // System.out.println(s1);
        /*String s = asus.salePc(6500);
        //salePc方法的返回值是String类型
        System.out.println(s);*/

    }
}

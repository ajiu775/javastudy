package study.generic;

import java.util.List;

/**
 * @Description:
 * @Author: Mr.Allen
 * @Date: 2021/5/16/16:16
 */
public class Test {

    public void testExtends(List< ? extends Fruit> list) {
        Fruit fruit = list.get(1);
    }

    public void testSuper(List< ? super Fruit> list) {
        list.add(new Apple());
    }
}
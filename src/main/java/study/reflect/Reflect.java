package study.reflect;

/**
 * @program: java study
 * @description: study reflect of java
 * @author: Allen
 * @create: 2020-09-05 13:53
 **/

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 类反射过程
 * 加载 --> 链接 --> 初始化
 **/
public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取class对象的三种方式
        //通过类名.class的方式
        Class getObjectByClassName = Person.class;
        System.out.println(getObjectByClassName.hashCode());

        //通过完整的路径名Class.forName()
        Class getGetObjectByForNameMethod = Class.forName("study.reflect.Teacher");
        System.out.println(getGetObjectByForNameMethod.hashCode());

        //通过对象getClass方法
        Person person = new Student();
        Class getObjectByGetClassMethod = person.getClass();
        System.out.println(getObjectByGetClassMethod.hashCode());

        //Java 内置对象获取Class对象还有一种方式通过.Type的方式
        Class integerClass = Integer.TYPE;
        System.out.println(integerClass);

        System.out.println("============================");
        //获得父类对象方法
        Class supStudent = getObjectByGetClassMethod.getSuperclass();
        System.out.println(supStudent);

        System.out.println("============================");
        //通过反射获得类的名字
        String wholeName = getObjectByClassName.getName();// 获得完整类名（包含包名）
        String simpleName = getObjectByClassName.getSimpleName();//获得类名
        System.out.println(wholeName);
        System.out.println(simpleName);

        System.out.println("============================");
        //通过反射获得类的字段
        for (Field field : getObjectByClassName.getFields()) {//只能获得public字段
            System.out.println(field);
        }
        System.out.println("============================");
        for (Field declaredField : getObjectByClassName.getDeclaredFields()) {//获得全部private字段
            System.out.println(declaredField);
        }

        System.out.println("============================");
        //通过反射获得类的方法
        for (Method method : getObjectByClassName.getMethods()) {//获得该类所有的public方法和父类方法
            System.out.println(method);
        }

        System.out.println("============================");
        for (Method declaredMethod : getObjectByClassName.getDeclaredMethods()) {//获得该类所有的方法包括private和public
            System.out.println(declaredMethod);
        }


    }
}
package study.constructor;

/**
 * @program: javastudy
 * @description:
 * @author: Allen
 * @create: 2020-09-23 16:54
 **/

public class SubClass extends SupClass {
    public String name = "subClass";
    public  SubClass(String name){
        super("福清");
        System.out.println(name);
    }

    public static void main(String[] args) {
        SupClass supClass = new SubClass("Hello");
        System.out.println(supClass.name);
    }
}

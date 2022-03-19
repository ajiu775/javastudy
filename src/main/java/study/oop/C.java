package study.oop;

/**
 * @program: java study
 * @description:
 * @author: Allen
 * @create: 2020-09-24 09:29
 **/

public class C extends B implements A {
    public void pX(){
        System.out.println(A.x);
    }

    public static void main(String[] args) {

        new C().pX();
    }
}

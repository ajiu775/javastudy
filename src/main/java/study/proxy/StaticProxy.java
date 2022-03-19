package study.proxy;

import study.oop.C;

public class StaticProxy {
    private Animals animals;

    public StaticProxy(Animals animals) {
        this.animals = animals;
    }

    public void deal(){
        System.out.println("static proxy start");
        this.animals.bark();
        System.out.println("static proxy end");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        StaticProxy staticProxy = new StaticProxy(dog);
        StaticProxy staticProxy1 = new StaticProxy(cat);
        staticProxy.deal();
        staticProxy1.deal();
    }
}

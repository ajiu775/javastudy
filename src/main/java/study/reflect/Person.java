package study.reflect;

/**
 * @program: java study
 * @description: entity
 * @author: Allen
 * @create: 2020-09-05 16:09
 **/

public class Person {
    String name;
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void printAge() {
        System.out.println("我的年龄是：秘密");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person {
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person {
    public Teacher() {
        this.name = "老师";
    }
}

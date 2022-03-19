package study.object;

/**
 * @program: javastudy
 * @description:
 * @author: Allen
 * @create: 2020-12-17 10:14
 **/

public class Example implements Cloneable{
    private String name;
    private int age;
    private int id;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static Example example = new Example();
    public static Example getInstance(){
        try {
            return (Example)example.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return new Example();
    }
}

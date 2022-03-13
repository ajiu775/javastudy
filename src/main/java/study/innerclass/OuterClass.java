package study.innerclass;

/**
 * @program: java study
 * @description: study inner class
 * @author: Allen
 * @create: 2020-09-23 08:56
 **/

public class OuterClass implements OuterInterface  {
    private String name = "Hello";
    private Integer age = 18;
    public  String sayHello(){return "Hello OuterClass";}
    //匿名内部类
    public OuterInterface genNoNameClass(){
        return  new OuterInterface(){
           public String sayHello(){
               return "Hello Noname";
           }
       };
     }
    //局部内部类
    public OuterClass genPartClass(){
        class PartClass extends OuterClass{
            public String sayHello(){
                return "Hello PartClass";
            }
        }
        return new PartClass();
    }

    // 成员内部类
    class InnerClass{
        public String getSupName(){
            return name;
        }
        public Integer getSupAge(){
            return age;
        }
    }

    //静态内部类
    static class staticClass{
        public String sayHello(){
            return "Hello StaticClass";
        }
    }

    public void lambda(Lam lam){
        lam.calculate();
    }

    public static void main(String[] args) {
        OuterClass outerClass =new OuterClass();
        System.out.println(outerClass.genPartClass().sayHello());
        InnerClass innerClass =outerClass.new InnerClass();
        System.out.println(innerClass.getSupName());
        System.out.println(innerClass.getSupAge());
        System.out.println(outerClass.genNoNameClass().sayHello());
        staticClass staticClass = new staticClass();
        System.out.println(staticClass.sayHello());
        Lam lam =()->2+3;
        System.out.println(lam.calculate());

    }
}

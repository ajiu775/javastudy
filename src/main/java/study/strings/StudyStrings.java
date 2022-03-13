package study.strings;

/**
 * @program: java study
 * @description: study strings
 * @author: Allen
 * @create: 2020-09-09 19:32
 **/

public class StudyStrings {
    public static void main(String[] args) {
        //string 类是一个final类 java开发人员认为字符串的比较操作比较多赋值操作比较少所以将字符串定义为final类
        String message = null;
        String greeting = "Hello";
        String name = "Allen";

        //string substring() 方法截取字符串（startIndex，endIndex); 不包含endIndex位置的值
        greeting = greeting.substring(0, 3);

        System.out.println(greeting);
        //print "Hel"

        //string 连接 +
        message = greeting + name;
        System.out.println(message);
        //print "HelloAllen"

        //string join() 组合多个字符串
        message = String.join(" ", greeting, name);
        System.out.println(message);
        //print "Hello Allen"

        //字符串比较 一定要用equals方法不能用== 用==存在随机性 ==是地址进行比较
        System.out.println(greeting.equals(name));
        //print false
        System.out.println(name == "Allen");
        //probably print true

    }
}

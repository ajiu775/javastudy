package study.basicdatatype;

/**
 * @program: java study
 * @description: 基本数据类型
 * @author: Allen
 * @create: 2020-11-14 16:20
 **/

public class BasicDataType {
    public static void main(String[] args) {
        byte a = 1;//占一个字节8位
        short b =1;//占两个字节16位
        int c = 1;//占四个字节32位
        long d =1l;//占八个字节64位
        float e = 1.0f;//占四个字节32位
        double f= 1.0d;//占八个字节64位
        char g = '1';//占两个字节16位
        boolean h = true;//占一位
        char m = 't';
        String string = "String";//start with Java 10

        System.out.println(Character.isJavaIdentifierPart('+'));
    }
}

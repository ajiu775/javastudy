package study.offer;

import java.util.Scanner;

/**
 * @program: javastudy
 * @description: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author: Kelly.Xing
 * @create: 2019-09-25 12:43
 **/
public class ReplaceStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String before = scanner.nextLine();
        String after = before.replace(" ", "%20");
        System.out.println(after);
    }
}

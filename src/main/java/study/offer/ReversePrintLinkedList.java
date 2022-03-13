package study.offer;

import study.offer.data_structure.DefineLink;

import java.util.Scanner;
import java.util.Stack;

/**
 * @program: java study
 * @description: 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * @author: Kelly.Xing
 * @create: 2019-09-25 12:52
 **/
public class ReversePrintLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String perLinkedList = scanner.nextLine();
        String[] links = perLinkedList.split("->");
        DefineLink defineLink = new DefineLink();
        defineLink.head.data = Integer.valueOf(links[0]);
        for (int i = 1; i < links.length; i++) {
            defineLink.insertTail(Integer.valueOf(links[i]));
        }
        Stack stack = new Stack();
        DefineLink.Entry tmp = defineLink.head;
        while (tmp.next != null) {
            stack.push(tmp.data);
            tmp = tmp.next;
        }
        stack.push(tmp.data);
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

}


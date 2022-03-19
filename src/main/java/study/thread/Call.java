package study.thread;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: javastudy
 * @description: study callable
 * @author: Allen
 * @create: 2020-04-21 21:55
 **/

public class Call implements Callable {
    public Object call() throws Exception {
        System.out.println("I'm running");
        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Set<Character> characters = new LinkedHashSet<Character>();
        String s = "HellO World";
        char[] chars = s.toCharArray();
        for (char a : chars) {
            characters.add(a);
        }
        for (char b:characters) {
            System.out.print(b);
        }
    }

}

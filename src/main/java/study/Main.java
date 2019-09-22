package study;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: javastudy
 * @description: exam
 * @author: Kelly.Xing
 * @create: 2019-08-14 19:11
 **/
public class Main {
    public static void main(String[] args) {
        Scanner hangShu = new Scanner(System.in);
        int n = hangShu.nextInt();
        String[] strs = new String[n - 1];
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n - 1; i++) {
            Scanner temp = new Scanner(System.in);
            String str = temp.nextLine();
            strs[i] = str;
        }
        for (int j = 0; j < n - 1; j++) {
            char[] temp = strs[j].toCharArray();
            String a = String.valueOf(temp[0]);
            a = a + String.valueOf(temp[1]);
            int key = Integer.valueOf(a);
            int value = Integer.valueOf(String.valueOf(temp[2]));
            hashMap.put(key, value);
        }
    }
}

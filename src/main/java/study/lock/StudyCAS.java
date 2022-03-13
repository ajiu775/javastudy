package study.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;


/**
 * @program: java study
 * @description: study CAS principle
 * @author: Allen
 * @create: 2020-04-20 12:19
 **/

public class StudyCAS {
    //private static final AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        StringBuilder stringBuilder = new StringBuilder("start");
        for (int i = 0; i < 10; i++) {
            String value = stringBuilder.append(i).toString();
            hashMap.put(i, value);
        }
        for (Integer a : hashMap.keySet()) {
            System.out.println(hashMap.get(a));
        }

        for (Map.Entry a:hashMap.entrySet()) {
            a.getValue();
            System.out.println(a);
        }
    }
}

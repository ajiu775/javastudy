package study.assemble;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: java study
 * @description: run code
 * @author: Allen
 * @create: 2020-03-29 19:17
 **/
public class Main {

    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<String, String>();
        Map<String,String> hashMap1 = new Hashtable<String, String>();
        Map<String,String> hashMap2 = new ConcurrentHashMap<String, String>();
    }
}

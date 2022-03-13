package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Description:
 * @Author: Mr.Allen
 * @Date: 2021/10/10/13:33
 */
public class Linux {

    public static void main(String[] args) throws IOException {
//        Process process = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", "ls"});
//        InputStream inputStream = process.getInputStream();
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        String contentLine = null;
//        while((contentLine=bufferedReader.readLine())!=null){
//            System.out.println(contentLine);
//        }


        String s1 = "ab";
        String s2 = "eidboaoo";

        //临界条件
        if ((s1 == null || s1.length() == 0) && (s2 == null || s2.length() == 0)) {
            System.out.println(true);
        }

        //转换成字符数组
        char[] subChars = s1.toCharArray();
        char[] supChars = s2.toCharArray();
        boolean result = false;
        long subBinary = 1l;
        for (int i = 0; i < subChars.length; i++) {
            subBinary += subBinary << (subChars[i] - 'a');
        }

        long supBinary = 1l;
        for (int i = 0; i < supChars.length; i++) {
            supBinary += supBinary << (supChars[i] - 'a');
        }

        if ((supBinary | subBinary) == supBinary) {
            result = true;
        }
        System.out.println(result);
        Arrays.equals(new int[]{1,2},new int[]{1,2,3});

    }


}

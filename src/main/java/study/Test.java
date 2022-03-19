//package study;
//
//import com.mysql.jdbc.StringUtils;
//import org.apache.commons.io.IOUtils;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.nio.file.FileSystem;
//import java.nio.file.FileSystems;
//import java.nio.file.Paths;
//import java.nio.file.WatchService;
//
///**
// * @program: java study
// * @description:
// * @author: Allen
// * @create: 2020-09-29 15:11
// **/
//
//public class Test {
//
//    public static final String  INPUT = "abcabcbb";
//
//    public int lengthOfLongestSubstring(String s) {
//        int maxLength = 1;
//        if("".equals(s)||s == null){
//            return maxLength;
//        }
//        char [] raw = s.toCharArray();
//        for(int i =0 ; i < raw.length ; i++ ){
//            flag:
//            for(int j = i+1 ; j < raw.length ; j++){
//                if(raw[i] != raw[j]){
//                    int tempLength = j - i ;
//                    maxLength = maxLength < tempLength ? tempLength : maxLength;
//                }else{
//                    break flag;
//                }
//            }
//        }
//        return maxLength;
//    }
//    public static void main(String[] args) throws IOException, InterruptedException {
//        WatchService ws = FileSystems.getDefault().newWatchService();
//        Paths.get().register();
//        ws.take();
//
//
//    }
//}

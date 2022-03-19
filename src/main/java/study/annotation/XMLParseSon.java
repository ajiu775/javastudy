package study.annotation;

import java.io.File;
import java.io.IOException;

public class XMLParseSon extends XMLParseFather{


    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Class  c = Class.forName("study.annotation.ParseClass");
        System.out.println(c.getPackage().getName());
        File file = new File("");
        System.out.println(file.getCanonicalFile());
        boolean a = c.isAnnotationPresent(ParseClass.class);
        System.out.println(a);
    }
}

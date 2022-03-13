package study;



import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: java study
 * @description: exam
 * @author: Allen
 * @create: 2019-08-14 19:11
 **/
public class Helper {
    public static void main(String[] something_to_do) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/shiqunxing/Downloads/update.txt");
        String [] client = new String[]{
                "1480255877:300","1617342667:999","1045039272:400",
                "1089888431:100","1387858641:200","1686493386:400",
                "1275317805:400","1539189959:100","1539189959:100",
                "3244641352:300","1235235442:999","3266954161:400",
                "1974284959:300","1099775850:999","1099775850:999",
                "1150618251:400","1371164733:100","1038733071:999",
                "1644561826:999","1157951991:300","3272734860:300",
                "1140797024:999","1335064365:400","1474197174:400",
                "1242690876:999","1212871173:999","1261253979:999",
                "1044920613:400","3271275903:400","3271275903:400",
                "1510193151:999","1320685066:400","1411423186:300",
                "1074950051:999","1150618807:100","3273210151:100",
                "1043360887:100","1049029047:300","1211470213:200",
                "1432055440:100","1608511073:999","3242206587:300",
                "1187462299:999","1182746621:100","1213031221:300",
                "1215712762:999","1369370811:999","1524450608:100",
                "1777870245:400","1097344443:999","1196928475:400",
                "1441859054:300","3255802358:100","1387312709:999",
                "1091858038:400","1534290672:300","1097099754:400",
                "3264804018:100","3272136755:100","1384730612:999",
                "1081446651:100","1396028567:999","1465713700:999",
                "1577676810:300","1436080275:999","1375559042:400",
                "3273836929:300","1077448281:999","1254695766:999",
                "1111075819:300","1433780032:999","1036386984:400",
                "1180679970:999","3205441924:200"};
        int count =0;
        for(String raw : client){
            count++;
            String [] temp = raw.split(":");
            StringBuffer stringBuffer = new StringBuffer("update tblcustinfo set postion='");
            stringBuffer.append(temp[1]).append("'").append("where custno = '").append(temp[0]).append("';\n").append("commit;\n");
            fileOutputStream.write(stringBuffer.toString().getBytes());
            //System.out.println(stringBuffer.toString());
        }
        fileOutputStream.close();
        System.out.println(count);
    }


public static boolean test(){
        boolean flag;
        try{
        int a=1/0;
        flag=false;
        return flag;
        }catch(Exception e){
        flag=true;
        return flag;
        }finally{
        flag=false;
        return flag;
        }

        }

        }
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //DateFormat df = new SimpleDateFormat("yyyy-MM-dd 23:59:59:999");

        SimpleDateFormat sdfNew  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);


        Date date = null;
        System.out.println(calendar.getTimeInMillis() - System.currentTimeMillis());
        System.out.println((calendar.getTimeInMillis() - System.currentTimeMillis())/1000);

        Long curTime = System.currentTimeMillis();
        System.out.println("long2int" +  curTime);
        System.out.println("long2int" + curTime/1000);

        // 99991231
        String endDate = "99991231";
        DateFormat df = new SimpleDateFormat("yyyyMMdd");

        try {
            Date dEndDate = df.parse(endDate);
            Calendar c = Calendar.getInstance();
            c.setTime(dEndDate);
            System.out.println(String.format("calendar end date is:%s", c.getTime().toString()));

            c.add(Calendar.DATE, 30);
            System.out.println(String.format("after add 30 days calendar end date is:%s", c.getTime().toString()));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        // System.exit(0);
    }
}

package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by user on 2017/4/9.
 */
public class GetId {
    static int i=0;
    public static String getId()
    {
        Calendar cal1 = Calendar.getInstance();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8:00"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddkkmmss");
        int randomNumber = (int) (Math.random() * 10);
        String id = (sdf.format(cal1.getTime()) + randomNumber+i);
        i++;
        return  id;
    }
}

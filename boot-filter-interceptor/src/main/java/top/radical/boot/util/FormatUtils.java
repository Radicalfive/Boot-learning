package top.radical.boot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : radical
 * @description :
 * @data : 2022/4/4
 **/
public class FormatUtils {
    public static String forTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}

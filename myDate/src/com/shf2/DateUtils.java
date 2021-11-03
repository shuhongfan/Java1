package com.shf2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils(){}

    public static String dateToString(Date date,String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        String s=sdf.format(date);
        return s;
    }

    public static Date stringToDate(String s,String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        Date d= null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }
}

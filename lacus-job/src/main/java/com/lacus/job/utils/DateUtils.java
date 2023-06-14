package com.lacus.job.utils;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * Created by:
 *
 * @Author: lit
 * @Date: 2023/05/26/9:49
 * @Description:
 */
public class DateUtils {


    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";


    public static String getCurrentTime() {
        return DateFormatUtils.format(new Date(), YYYY_MM_DD_HH_MM_SS);
    }


}

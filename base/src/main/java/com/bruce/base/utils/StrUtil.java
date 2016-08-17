package com.bruce.base.utils;

import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StrUtil extends StringUtils {

    public static String dateFormat = "yyyy-MM-dd";

    public static String timeFormat = "yyyy-MM-dd HH:mm:ss";

    public static boolean isNull(String param) {
        if (param == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNullOrEmpty(String param) {
        if (isNull(param) || StringUtils.isEmpty(param)) {
            return true;
        } else {
            return false;
        }
    }

    public static String date2String(Date param) {
        if (param == null) {
            return null;
        }
        return new SimpleDateFormat(dateFormat).format(param);
    }

    public static String timestamp2String(Date param) {
        if (param == null) {
            return null;
        }
        return new SimpleDateFormat(timeFormat).format(param);
    }

    public static String int2String(int param) {
        return String.valueOf(param);
    }

    public static String Integer2String(Integer param) {
        if (param == null) {
            return null;
        }
        return String.valueOf(param);
    }

    public static String long2String(Long param) {
        if (param == null) {
            return null;
        }
        return String.valueOf(param);
    }
}

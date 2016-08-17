package com.bruce.base.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.bruce.base.framework.FrameLogger;
import com.mysql.jdbc.StringUtils;

public class DateUtil {

	private static FrameLogger logger = FrameLogger.getLogger(DateUtil.class);
	
	public static SimpleDateFormat shortDateFormat = new SimpleDateFormat("yyyyMMdd");
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	public static SimpleDateFormat timestampFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static String getShortDate (Date date) {
		if (date == null) {
			date = new Date();
		}
		return shortDateFormat.format(date);
	}
	
	public static String dateFormat (Date date) {
		if (date == null) {
			date = new Date();
		}
		return dateFormat.format(date);
	}
	
	public static String getTimeStamp (Date date) {
		if (date == null) {
			date = new Date();
		}
		return timestampFormat.format(date);
	}
	
	public static Date string2Date(String dateStr) throws Exception {
			return dateFormat.parse(dateStr);
	}
	
	public static Date string2Date(String dateStr, String format) throws Exception {
		if(StringUtils.isNullOrEmpty(format)) {
			return dateFormat.parse(dateStr);
		}
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		Date date = dateFormat.parse(dateStr);
		return date;
	}
	
	public static Date string2Timestamp(String dateStr) throws Exception {
		Date date = null;
		try {
			date = timestampFormat.parse(dateStr);
		} catch (Exception e) {
			logger.fatal(e.getLocalizedMessage());
			e.printStackTrace();
			throw e;
		}
		return date;
	}
	
	public static void main(String[] args) {
		Date date = null;
		try {
			date = string2Date("2012-12-12", "yyyy-MM-dd");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(dateFormat(date));
		
	}
}

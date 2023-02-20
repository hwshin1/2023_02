package com.KoreaIT.java.AM;

import java.text.SimpleDateFormat;
import java.util.Date;

class Util {
	public static String getNowDateTimeStr() {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		return sdf1.format(now);
	}
}
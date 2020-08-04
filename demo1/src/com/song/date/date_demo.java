package com.song.date;

import java.io.File;
import java.util.Date;

public class date_demo {
	public static void main(String[] args) {
		/**
		 * 空的参数默认返回 System.currentTimeMillis()
		 */
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime()/24/365/1000/3600);

		Date date1 = new Date((long)1000 * 3600 * 24 * 365 * 30);
		// 结果为1999年 12月 25日 早上8点
		System.out.println(date1.toString());
		/**
		 * 时间从 1970年 1月 1日 开始计算，以微秒计时
		 */
		Date date2 = new Date(0);
		System.out.println(date2.toString());

		/**
		 * 三种比较方法
		 * 1、通过getTime() 取得值的大小进行比较
		 * 2、通过compareTo() 进行比较
		 * 3、通过before() 、 after() 进行比较
		 */
		System.out.println(date1.compareTo(date2));
		System.out.println(date2.compareTo(date1));
		System.out.println(date1.compareTo(date1));
		if (date1.getTime() > date2.getTime()) {
			System.out.println("date1 > date2");
		} else if (date1.getTime() == date2.getTime()) {
			System.out.println("date1 == date2");
		} else {
			System.out.println("date1 < date2");
		}
		System.out.println(date1.before(date2));
		System.out.println(date1.after(date2));
	}
}

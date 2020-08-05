package com.song.date;

import java.io.File;
import java.text.SimpleDateFormat;
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
		 * 使用String.format 可以格式化输出日期
		 * 使用方法 %t(+字母),t是固定的，字母根据下方表格来决定输出格式
		 * 字符	描述	      例子
		 * c	完整的日期和时间	Mon May 04 09:51:52 CDT 2009
		 * F	ISO 8601 格式日期	2004-02-09
		 * D	U.S. 格式日期 (月/日/年)	02/09/2004
		 * T	24小时时间	18:05:19
		 * r	12小时时间	06:05:19 pm
		 * R	24小时时间，不包含秒	18:05
		 * Y	4位年份(包含前导0)	2004
		 * y	年份后2位(包含前导0)	04
		 * C	年份前2位(包含前导0)	20
		 * B	月份全称	February
		 * b	月份简称	Feb
		 * n	2位月份(包含前导0)	02
		 * d	2位日子(包含前导0)	03
		 * e	2位日子(不包含前导0)	9
		 * A	星期全称	Monday
		 * a	星期简称	Mon
		 * j	3位年份(包含前导0)	069
		 * H	2位小时(包含前导0), 00 到 23	18
		 * k	2位小时(不包含前导0),  0 到 23	18
		 * I	2位小时(包含前导0), 01 到 12	06
		 * l	2位小时(不包含前导0),  1 到 12	6
		 * M	2位分钟(包含前导0)	05
		 * S	2位秒数(包含前导0)	19
		 * L	3位毫秒(包含前导0)	047
		 * N	9位纳秒(包含前导0)	047000000
		 * P	大写上下午标志	PM
		 * p	小写上下午标志	pm
		 * z	从GMT的RFC 822数字偏移	-0800
		 * Z	时区	PST
		 * s	自 1970-01-01 00:00:00 GMT的秒数	1078884319
		 * Q	自 1970-01-01 00:00:00 GMT的毫妙	1078884319047
		 */
		System.out.println(String.format("date2: %tc", date2));

		/**
		 * SimpleDateFormat 可以自定义格式化输出日期，y代表年份，M月，d日，E星期几，h时，m分，s秒。
		 * ' ' 是文字界定符
		 * 字母	描述	    示例
		 * G	纪元标记	AD
		 * y	四位年份	2001
		 * M	月份	July or 07
		 * d	一个月的日期	10
		 * h	 A.M./P.M. (1~12)格式小时	12
		 * H	一天中的小时 (0~23)	22
		 * m	分钟数	30
		 * s	秒数	55
		 * S	微妙数	234
		 * E	星期几	Tuesday
		 * D	一年中的日子	360
		 * F	一个月中第几周的周几	2 (second Wed. in July)
		 * w	一年中第几周	40
		 * W	一个月中第几周	1
		 * a	A.M./P.M. 标记	PM
		 * k	一天中的小时(1~24)	24
		 * K	 A.M./P.M. (0~11)格式小时	10
		 * z	时区	Eastern Standard Time
		 * '	文字定界符	Delimiter
		 * "	单引号	`
		 */
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y.M.d 'at' h.m");
		System.out.println(simpleDateFormat.format(date));
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yy.MM.dd 'at' hh.mm.ss");
		System.out.println(simpleDateFormat1.format(date));

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


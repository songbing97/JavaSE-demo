package com.song.number;

public class number_demo {
	public static void main(String[] args) {
		/**
		 * 包装类的作用：
		 * 1、包装类是final，不可以继承
		 * 2、包装类属于引用，基本类型是值类型，collection only can add reference
		 * 3、适配器，例如int和string不能直接转化，需要用包装类的一些静态方法
		 */

		/**
		 * byte need 8 bits space
		 * byte 是有符号的、二进制补码（取反加1）表示的整数。
		 * 用十六进制来表示，范围从-128 ～ 127
		 * default 0
		 */
		byte bt = 0x7f;
		Byte BT = 0x7f;

		/**
		 * short need 2 bytes, -32768（-2^15）～ 32767（2^15 - 1）;
		 * short and byte can save space compare to int.
		 * default 0
		 */
		short st = 10;
		Short ST = 10;

		/**
		 * int need 4 bytes, -2,147,483,648（-2^31）~ 2,147,483,647（2^31 - 1）;
		 * default 0
		 */
		int i = 1000;
		Integer I = 1000;

		/**
		 * long need 8 bytes;
		 * -9,223,372,036,854,775,808（-2^63）~ 9,223,372,036,854,775,807（2^63 -1）;
		 * default 0L
		 */
		long l = 100000000000L;
		Long L = 100000000000L;

		/**
		 *  float need 4 bytes
		 * float 符号位1位，指数8位，尾数23位。
		 * -3.40E+38 ~ +3.40E+38
		 * Behind the value of float need a 'f';
		 * Because float need 1 byte space,and double need 2bytes spaces.
		 * JVM need to recognize the difference between float and double.
		 * default 0.0f
		 */
		float fl = 10.001f;
		Float FL = 10.001f;

		/**
		 * double need 8 bytes
		 * double 符号位1位，指数位11位，尾数位52位
		 * default 0.0d
		 */
		double db = 10.01;
		Double DB = 10.01;

		/**
		 * boolean need 1 byte
		 * boolean only can be true or false
		 * default false
		 */
		 boolean bl = true;
		 Boolean BL = false;

		/**
		 * char need 16 bits
		 * \u0000 (0) ~ \uffff (65535)
		 * char 用于存储任何类型的字符
		 */
		char c = 'c';
		Character C = 'C';

		/**
		 * 基本静态方法的使用
		 */
		System.out.println("Byte的占位，最小到最大，" + Byte.SIZE + " " + Byte.MIN_VALUE  + " " +Byte.MAX_VALUE);
		System.out.println("Short的占位，最小到最大，" + Short.SIZE +  " " +Short.MIN_VALUE + " " + Short.MAX_VALUE);
		System.out.println("Integer的占位，最小到最大，" + Integer.SIZE + " " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
		System.out.println("Long的占位，最小到最大，" + Long.SIZE + " " + Long.MIN_VALUE + " " + Long.MAX_VALUE);
		System.out.println("Float的占位，最小到最大，" + Float.SIZE + " " + Float.MIN_VALUE + " " + Float.MAX_VALUE);
		System.out.println("Double的占位，最小到最大，" + Double.SIZE + " " + Double.MIN_VALUE + " " + Double.MAX_VALUE);
		System.out.println("Boolean没有相关属性");
		System.out.println("Character的占位，最小到最大，" + Character.SIZE + " " + Character.MIN_VALUE + " " + Character.MAX_VALUE);

		/**
		 *  Number类是所有基本类型包装类的抽象父类。
		 *  Math类是常用静态方法类
		 */
		/**
		 * Math静态方法示例
		 */
		System.out.println("PI：" + Math.PI);
		System.out.println("Sin PI/2: " + Math.sin(Math.PI/2));
		System.out.println("Cos PI/2: " + Math.cos(Math.PI/2));
		System.out.println("绝对值：" + Math.abs(i));

		/**
		 * Number类自带方法展示
		 */
		System.out.println(BT.byteValue());
		System.out.println(C.charValue());

		System.out.println(ST.toString());
		System.out.println(DB.toString());

		System.out.println(FL.shortValue());
		System.out.println(L.shortValue());

		System.out.println(ST.floatValue());
		System.out.println(ST.doubleValue());

		System.out.println(ST.compareTo(FL.shortValue()));
		System.out.println(Integer.parseInt("33"));
	}
}

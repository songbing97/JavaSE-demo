package com.song.string;

public class String_demo {
	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = new String("abcde");
		String str3 = "abcde";
		String str4 = new String("abcde");
		/**
		 * == 对于基本类型，进行值比较；对于引用类型，比较引用是否相同
		 */
		if (str1 == str2) {  //false
			System.out.println("str1 == str2");
		}

		if (str1 == str3) {  //true
			System.out.println("str1 == str3");
		}

		if (str2 == str4) {  //false
			System.out.println("str2 == str4");
		}

		/**
		 * equals()方法一般进行的是引用比较，但是String对equals()进行了重写，变成了值比较
		 * 同理，Math、Integer、Double都对equals进行了重写
		 * 所以如果要进行地址的判断，选择==
		 * 如果进行值的判断，选择equals()
		 */
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		System.out.println(str2.equals(str4));
	}
}

package com.song.character;

public class character_demo {
	public static void main(String[] args) {
		char ch = 'a';
		char unicode = '\u050a';
		char[] charArray = {'a', 'b', 'c', 'd'};
		/**
		 * Character 是 char 的包装类，同时提供一些静态方法
		 */
		Character CH = 'a';
		Character CH1 = new Character('a');

		System.out.println(ch + " " + unicode);
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + " ");
		}
		System.out.println(" ");

		System.out.println(CH.equals(ch));
		System.out.println(CH1.equals(CH));
		System.out.println(CH1.equals(ch));

		System.out.println(Character.isDigit(ch));
		System.out.println(Character.isDefined(CH));
		System.out.println(Character.isLetter(CH1));
		System.out.println(Character.isWhitespace(ch));
		System.out.println(Character.isUpperCase(ch));
		System.out.println(Character.isLowerCase(ch));
		System.out.println(Character.toUpperCase(ch));
		System.out.println(Character.toLowerCase(ch));
		System.out.println(Character.toString(ch));

	}

}

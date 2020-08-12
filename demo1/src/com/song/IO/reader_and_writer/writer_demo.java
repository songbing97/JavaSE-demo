package com.song.IO.reader_and_writer;

import java.io.*;

public class writer_demo {
	public static void main(String[] args) throws IOException {
		// file 用于写入文件，读取文件
		File file = new File("/Users/apple/Documents/JavaSE-demo/demo1/src/com/song/IO/reader_writer/testfile2.txt");
		FileWriter fileWriter = new FileWriter(file);
		char[] chars= new char[100];
		// 用于全局读取文件
		FileReader fileReader = new FileReader(file);

		/**
		 * BufferedWriter 是 writer 类的装饰器
		 */
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write((int)1);
		fileReader.read(chars);
		System.out.println(String.valueOf(chars));
		bufferedWriter.flush();
		bufferedWriter.close();
		fileReader.read(chars);
		System.out.println(String.valueOf(chars));

		/**
		 * OutputStreamWriter 是属于OutputStream（字节流）的装饰器
		 */
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		outputStreamWriter.write("1/r");
		outputStreamWriter.flush();
		outputStreamWriter.close();
		fileReader.read(chars);
		System.out.println(String.valueOf(chars));

		/**
		 * PrintWriter 常用于写入 换行输入
		 * PrintWriter的print、println方法可以接受任意类型的参数
		 */
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(3);
		printWriter.flush();
		printWriter.close();
		fileReader.read(chars);
		System.out.println(String.valueOf(chars));

		/**
		 * 值得注意的是,StringWriter中，写入的数据只是存在于缓存中，并不会写入实质的存储介质之中。
		 * 如果你遇到一个情景是你必须使用一个Reader或者Writer来作为参数传递参数，
		 * 但你的数据源又仅仅是一个 String / charArray 类型数据，无需从文件中写出，那么此时就可以用到它们。
		 */
		StringWriter stringWriter = new StringWriter(100);
		BufferedWriter bufferedWriter1 = new BufferedWriter(stringWriter);
		bufferedWriter1.write("yes");
		System.out.println(stringWriter.toString());

		CharArrayWriter charArrayReader = new CharArrayWriter(100);

	}
}

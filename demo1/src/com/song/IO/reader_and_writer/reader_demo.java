package com.song.IO.reader_and_writer;

import java.io.*;

public class reader_demo {
	public static void main(String[] args) throws IOException {
		/**
		 * 字符流是以一个字符char（两个字节）为一个读取单位的;字节流是以一个字节byte为一个读取单位的。
		 * 所以字符流在读取字符的时候速度比字节流更快
		 * Reader 是各种Reader的父类，主要提供了 方法
		 */
		// 构建文件读取流，用于各种流的构造函数
		File file = new File("demo1/src/com/song/IO/reader_writer/testfile.txt");
		System.out.println(file.getPath());
		/**
		 * 	BufferedReader 属于装饰器模式的Reader，因为其构造参数为其他的Reader类。
		 * 	BufferedReader 使用了缓存机制，所以其运行速度更快
 		 */
		FileReader fileReader = new FileReader(file);

		char[] rd1 = new char[100];

		BufferedReader bufferedReader = new BufferedReader(fileReader);
		bufferedReader.read(rd1);
		bufferedReader.close();

		System.out.println(String.valueOf(rd1));

		/**
		 * 同样的，InputStreamReader属于装饰器模式的Reader，其构造参数为其他的InputStream类。
		 * 属于对 InputStream 进行装饰
		 */
		FileInputStream fileInputStream = new FileInputStream(file);
		char[] rd2 = new char[100];
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		inputStreamReader.read(rd2);
		inputStreamReader.close();
		System.out.println(String.valueOf(rd2));

		/**
		 *  StringReader 的构造参数为 String
		 */

		String str = "I'm so good!";
		StringReader stringReader = new StringReader(str);
		char[] rd3= new char[100];
		stringReader.read(rd3);
		stringReader.close();
		System.out.println(String.valueOf(rd3));

		/**
		 * PipedReader 和 PipedWriter 用于同进程、不同线程之间的管道通信；
		 * 用法将在 Thread 包内进行展示
		 */
		PipedReader pipedReader = new PipedReader();
		PipedWriter pipedWriter = new PipedWriter(pipedReader);

		/**
		 * CharArrayReader 构造参数为 字符数组
		 */
		CharArrayReader charArrayReader = new CharArrayReader(rd3);
		char[] rd4 =new char[100];
		charArrayReader.read(rd4);
		charArrayReader.close();
		System.out.println(String.valueOf(rd4));

		/**
		 * FilterReader 构造参数是Reader类，属于 装饰器设计。
		 * FilterReader 是抽象类，不可示例化。
		 * PushbackReader.unread()可以把字符串退回到缓冲区,用于再次读取
		 */
		Reader reader = new FileReader(file);
		FilterReader filterReader = new PushbackReader(fileReader);

		/**
		 * 通过新建相对路径的File文件，再输出绝对路径，得知JVM当前所在的相对路径。
		 */
		File fl = new File(".");
		System.out.println(fl.getAbsolutePath());


	}
}

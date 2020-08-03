package com.song.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_demo {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/apple/Documents/JavaSE-demo/demo1/src/com/song/file/smalldemo/text.txt");
		File dir = new File("/Users/apple/Documents/JavaSE-demo/demo1/src/com/song/file/smalldemo");
		File child = new File(dir,"index.txt");

		System.out.println(file.getAbsolutePath());
		System.out.println(dir.getPath());
		System.out.println(child.getPath());

		if (file.exists()) {
			System.out.println(file.length());
		}

		if (child.canRead()) {
			// 还有canWrite、canExcute
			System.out.println(child.length());
		}

		/**
		 * delete()删除文件 rename()重命名 mkdir()创建文件夹 mkdirs()创建文件夹（包含所有父目录）创建等不一一展示
		 */
		if (dir.exists()) {
			File temp = File.createTempFile("helloworld","txt");
			System.out.println(temp.getAbsolutePath());
			//临时文件，用完即删除
			temp.deleteOnExit();
			File file2 = File.createTempFile("helloworld","tet",dir);
			System.out.println(file2.getPath());
			file2.deleteOnExit();
		}
		//创建文件的方式，必须先有包含url的File对象，再通过creatNewFile来创建
		File child2 = new File(dir,"hex.txt");
		if (child2.createNewFile()) {
			System.out.println(child2.getPath());
		}
		/**
		 * File 通常搭配 FileReader 和 FileWriter 使用
		 */
		FileReader fileReader = new FileReader(file);
		char[] rd = new char[50];
		// 需要把流读取 --> 字符数组中
		fileReader.read(rd);
		for (char a : rd) {
			System.out.print(a);
		}
		System.out.println(" ");
		/**
		 * Stream 不熟悉，需要修改
		 */
		FileWriter fileWriter = new FileWriter(file);
		char[] sd = {'a','b'};
		fileWriter.write(sd,0,2);
		fileWriter.write("I'd like study!",0,15);
		// write操作之后，文件只是存储在了流中，要写入文件，还需要刷新flush()，然后关闭流对象
		fileWriter.flush();
		fileWriter.close();
		fileReader.read(rd);
		// 流对象都需要关闭
		fileReader.close();
		// 输出字符数组的方式可以转变成String
		System.out.println(String.valueOf(rd));
	}
}

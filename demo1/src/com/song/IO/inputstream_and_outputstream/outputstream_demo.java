package com.song.IO.inputstream_and_outputstream;

import java.io.*;

public class outputstream_demo {
	public static void main(String[] args) throws IOException {
		// 测试用文件
		File file = new File("/Users/apple/Documents/JavaSE-demo/demo1/src/com/song/IO/inputstream_and_outputstream/test.txt");

		FileOutputStream fileOutputStream = new FileOutputStream(file);

		FilterOutputStream filterOutputStream = new FilterOutputStream(fileOutputStream);

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

//		PipedOutputStream pipedOutputStream = new PipedOutputStream();

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	}
}

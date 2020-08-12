package com.song.IO.inputstream_and_outputstream;

import java.io.*;
import java.nio.Buffer;

public class inputstream_demo {
	public static void main(String[] args) throws IOException {
		// 测试用文件
		File file = new File("/Users/apple/Documents/JavaSE-demo/demo1/src/com/song/IO/inputstream_and_outputstream/test.txt");

		FileInputStream fileInputStream = new FileInputStream(file);

		/**
		 * FilterInputStream
		 * 装饰类InputStream 暂时不学习
		 */
		/*FilterInputStream bufferedInputStream = new BufferedInputStream();

		DataInputStream dataInputStream = new DataInputStream();*/

		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

//		StringBufferInputStream已经不推荐使用

		/**
		 * 如果你的使用场景是必须使用 InputStream OutputStream 对象作用参数传递
		 * 而你的数据源又仅仅是一个 String / charArray 类型数据，无需从文件中写出，那么此时就可以用到它们。
		 * 因此不做演示
		 */
//		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();


//		PipedInputStream pipedInputStream = new PipedInputStream();


	}
}

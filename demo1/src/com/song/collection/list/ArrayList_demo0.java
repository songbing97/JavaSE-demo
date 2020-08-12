package com.song.collection.list;

import java.util.ArrayList;

public class ArrayList_demo0 {
	public static void main(String[] args) {
		/**
		 * ArrayList
		 */
		ArrayList<Integer> arrayList = new ArrayList<>();

		/**
		 * 属性
		 */
		arrayList.size();

		/**
		 * 增删改查
		 */
		arrayList.add(1);
		arrayList.add(2);

		System.out.println(arrayList.indexOf(1)); // 0
		System.out.println(arrayList.indexOf(2)); // 1

		System.out.println(arrayList.get(0)); // 1
		System.out.println(arrayList.contains(1)); // true

		arrayList.remove(1);
		arrayList.remove(0);




		/**
		 * 判断
		 */
		System.out.println(arrayList.isEmpty());
//		System.out.println(arrayList.get(1));
	}
}

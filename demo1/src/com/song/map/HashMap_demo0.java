package com.song.map;

import java.util.HashMap;

public class HashMap_demo0 {
	/**
	 * K V
	 */
	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(1,2);

		hashMap.put(1,3); // 同样的K，put会更新V
		hashMap.put(2,2);
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(2));
	}
}

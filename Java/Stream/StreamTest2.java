package com.ssafy.algo.daily.D0814.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTest2 {
	public static void main(String[] args) {
		List<String> strs = Arrays.asList("There", "Hello", "Stream", "API", "Java", "Hello");

		strs.stream().distinct(). // 중간 처리
				filter(str -> str.length() > 4). // 중간처리
				sorted((o1, o2) -> Integer.compare(o1.length(), o2.length())).// 중간처리
				forEach(str -> System.out.println(str));

		System.out.println("=====================================");
		strs.stream(). // 중간 처리
				filter(str -> str.length() > 4). // 중간처리
				sorted(Comparator.<String, Integer>comparing(str -> str.length())
						.thenComparing(Comparator.naturalOrder()))// 중간처리
				.forEach(str -> System.out.println(str));

		System.out.println("=====================================");
		strs.stream(). // 문자열 Stream
				map(str -> str.toCharArray()) // char[] Stream convert
				.forEach(data -> System.out.println(Arrays.toString(data)));

		System.out.println("=====================================");
		strs.stream().
				flatMap(str -> Arrays.stream(str.split(""))) // String[] Stream convert
				.forEach(data -> System.out.println(data));

	}
}

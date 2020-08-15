package com.ssafy.algo.daily.D0814.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "Java", "World", "IS");
		Collections.sort(list, (i, j) -> {
			return Integer.compare(i.length(), j.length());
		});
		System.out.println(list);
	}
}

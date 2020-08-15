package com.ssafy.algo.daily.D0814.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest3 {
	public static void main(String[] args) {
		List<String> strs = Arrays.asList("There", "Hello", "Stream", "API", "Java", "Hello");
		// match

		boolean allMatch = strs.stream().distinct().allMatch(str -> str.length() > 4); // 최종처리
		System.out.println("스트림 내 요스들의 문자 길이는 모두 4글자보다 크다 " + allMatch);

		List<String> list = strs.stream().distinct().collect(Collectors.toList());
		System.out.println("중복 제거된 리스트" + list);
		
		
		Map<String,Long> map =strs.stream().distinct().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(map);
		
		
		System.out.println(strs.stream().distinct().count());
	}
}

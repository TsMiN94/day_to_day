package com.ssafy.algo.daily.D0814.Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.imageio.IIOException;

public class StreamTest4 {
	public static void main(String[] args) {
		// 아주 큰 문서에서 .. 5글자이상의 단어들의 골라서 빈도를 출력해보자.
		File file = new File("./temp.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file));

		) {
			Stream<String> stream = br.lines();

			Map<String, Long> map = stream.flatMap(str -> Arrays.stream(str.split(" "))).filter(str -> str.length() > 4)
					.sorted((o1, o2) -> Integer.compare(o1.length(), o2.length()))
					.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

			TreeMap<String, Long> treeMap = new TreeMap<String,Long>(map);
			TreeMap<String, Long> tm = new TreeMap<String, Long>(
					Comparator.comparing(key -> treeMap.get(key)).reversed());
			tm.putAll(treeMap);
			System.out.println(tm);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

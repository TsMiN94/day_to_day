package com.ssafy.algo.daily.D0814.lambda;

import java.util.ArrayList;
import java.util.List;

/*
 *  		parameter유무 	return타입 	특징
 * Consumer   	 	0			x		소비자
 * 
 * supplier			x			o		공급자
 * 
 * Funchion			o			o		파라미터를 받아서 가공후 리턴해서 매핑
 * 										-동일타입은 물론,새로운 타입으로도 리턴(String-->Integer)
 * 
 * Operation		o			o		파라미터를 받아서 가공후 리턴해서 매핑
 * 										-동일한 타입으로 리턴(String-->String)
 * 
 * Predicate		o			o		파라미터를 받아서 가공후 리턴
 * 										boolean타입 리턴
 * 람다를 쓰는이유 ? 스트림 API에서 사용하기 위하여
 *
 * Stream API -JDK 1.8~
 * Collection등의 데이터 처리
 * 빅데이터 관리
 * 
*/
public class StandardFunctional {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		// Consumer;
		list.add("Asadadd");
		list.add("Bwerwerr");
		list.add("Cgz");
		list.add("Dds");

		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("====consumer 사용====");
		// 그저 조회하는거로는 이렇게 {} 와 return 삭제

		list.forEach(param -> System.out.println(param));
		// 이렇게 축약도 가능하다
		list.forEach(System.out::println);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() < 5) {
				list.remove(i);
				i--;
			}
		}

		System.out.println(list);

		// 매개변수가 하나고 실행문이 하나기 때문에 return 삭제 , {}삭제
		list.removeIf(param -> param.length() < 5);
		System.out.println(list);

	}
}

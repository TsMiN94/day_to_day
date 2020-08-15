package com.ssafy.algo.daily.D0814.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*  람다를 쓰는이유 ? Stream API에서 사용하기 위하여
*  Stream API -JDK 1.8~
*  -Collection등의 데이터 처리
*  -빅데이터 관리하는데 용이
*  -Collection, Array 등 DataSource에 대해 공통된 접근 방식 제공 - 기존 데이터따른 정렬방식 ( sort->Collection.sort, Arrays.sort, TreeSet,)
*  Strema의 경우는 Stream.sorted로 모두 통일가능  
* 
*  -map/reduce 모델 적용 
*  map: 필요한 데이터만 고르기 , 필요한 데이터로 매핑시키기  ->중간 처리
*  reduce: 원하는 형태의 데이터만으로 줄인다. -		  ->최종 처리
*  
*  -병렬 처리가 쉬움
*   stream() / parallelStream() 
*  -기존 데이터(Collection등)을 변경하지 않는다.
* 
*  스트림을 사용하는 단계
*  
*  원본 Collection (배열 , Collection) --> Stream생성 --> 중간처리(map)....->중간처리 --> 최종처리(reduce)
*  - 각각의 중간 처리는 매번 새로운 스트림 리턴 --> builder패턴으로 생성 (builder패턴이란 자기 자신의 타입으로 리턴하는 형식을 말함)
*  - 최종 처리는 마지막이므로 스트림이 아닌 어떤 값으로 반환
*  
*  
*  스트림에서 처리하는 중간처리 종류
*  필터링 : distinct() , filter()
*  조건 : skip,limit()
*  정렬 : sorted()
*  조회 : peek() 디버깅용
*  매핑(변환 ): map -> 원본 스트림 요소와 변환 스트림 요소가 1:1 로 매핑
*  			 flatMap -> 원본 스트림 요소와 변환 스트림 요소가 1:N 으로 핑
*  
*  스트림에서 처리하는 최종 처리 종류
*  매칭 : allMath, anyMatch ,noneMath
*  수집 : collect ->결과를 새로운 컬렉션으로 반환
*  순회 : foEach
*  통계 : count(),max(),min(),groupBy, ...
*/

public class StreamTest {
	static List<String> heros = Arrays.asList("IronMan", "SpiderMan", "Thor", "Hurk");

	// hero의 요소중 길이가 3이상인 것들만 따로 모아서 출력
	public static void oldStyle() {
		List<String> sub = new ArrayList<String>();
		for (String hero : heros) {
			if (hero.length() > 6)
				sub.add(hero);
		}

		sub.forEach(param -> System.out.println(param));

	}

	public static void streamStyle() {
		heros.stream().filter(hero -> hero.length() > 6).forEach(hero -> System.out.println(hero));

	}

	public static void main(String[] args) {
		oldStyle();
		System.out.println("========");
		streamStyle();
	}
}

package com.ssafy.algo.daily.D0814.lambda;

public class InnerClassBecarful {
	interface Func {
		String method(String msg);
	}

	public void useFunc(Func f, String msg) {
		System.out.println(f.method(msg));
	}

	private int outerClassInstanceMember = 10;

	public static void main(String[] args) {
		int localVar = 20;
		InnerClassBecarful icb = new InnerClassBecarful();
		icb.useFunc(name -> {
			System.out.println();
			return "Hello" + name;
		}, "홍길동");
		
		
	}
}

package com.ssafy.algo.daily.D0814.lambda;

public class FunctionTest {

	@FunctionalInterface
	interface FuncNoParmNoReturn {
		void method();
	}

	@FunctionalInterface
	interface FuncParmaNoReturn {
		void method(String name);
	}

	@FunctionalInterface
	interface FuncParamReturn {
		String method(String name);
	}

	public void useFuncParamReturn(FuncParamReturn func, String name) {
		System.out.println(func.method(name));
	}

	public void useFuncNoParmNoReturn(FuncNoParmNoReturn func) {
		func.method();
	}

	public void useFuncParmaNoReturn(FuncParmaNoReturn func, String name) {
		func.method(name);
	}

	public static void main(String[] args) {
		FunctionTest ft = new FunctionTest();
		ft.useFuncNoParmNoReturn(new FuncNoParmNoReturn() {

			@Override
			public void method() {
				System.out.println("익명클래스");
			}
		});

		ft.useFuncNoParmNoReturn(() -> System.out.println("익명"));
		ft.useFuncParmaNoReturn((String name) -> {
			System.out.println("hello" + name);
		}, "홍길동");

		ft.useFuncParamReturn((String name) -> {
			return "hello" + name;
		}, "임꺽정");
		ft.useFuncParamReturn(name -> "hello" + name, "임꺽정");

	}
}

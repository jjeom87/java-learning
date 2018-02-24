package org.sunj.tutorials.generic;

import java.util.ArrayList;
import java.util.List;

/*
 * ?는 알 수 없는 타입
 * <?> : 모든 객체 자료형, 내부적으로는 Object로 인식
 * <? super 객체자료형> : 명시된 객체자료형의 상위 객체, 내부적으로는 Object로 인식
 * <? extends 객체자료형> : 명시된 객체 자료형을 상속한 하위객체, 내부적으로는 명시된 객체 자료형으로 인식
 * extends 뒤에는 클래스, 인터페이스가 올 수 있다. (E, ? 인 경우 사용 가능)
 * E - Element
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 * */

class NotAllowedGenericType<T> {

	// static 필드는 제너릭 타입을 가질 수 없음
	// private static T t;

	public NotAllowedGenericType() {
		// T type은 인스턴스로 생성할 수 없음
		// new T();

		// primitives 타입으로 제너릭 타입을 선언할 수 없음
		// List<int> list = new ArrayList<>();
	}
}

public class WildcardGenericType {

	public List<? extends Number> method1() {
		return new ArrayList<Long>();
	}

	// Bounded wildcard parameterized type
	public <T> List<? extends String> method2(T param) {
		return new ArrayList<String>();
	}

	// Unbounded wildcard parameterized type
	public List<?> method3() {
		return new ArrayList<>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildcardGenericType wildcardGenericType = new WildcardGenericType();
		List<Integer> list = (List<Integer>) wildcardGenericType.method1();
		List<String> list2 = (List<String>) wildcardGenericType.method2("12");
		List<?> list3 = wildcardGenericType.method3();
	}

}

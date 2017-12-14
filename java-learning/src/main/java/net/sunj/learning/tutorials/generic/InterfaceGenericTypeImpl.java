package net.sunj.learning.tutorials.generic;

interface InterfaceGenericType<T1, T2> {
	T1 doSomething(T2 t);
	T2 doSomething2(T1 t);
}

public class InterfaceGenericTypeImpl implements InterfaceGenericType<String, Integer> {

	@Override
	public String doSomething(Integer t) {
		return String.valueOf(t);
	}

	@Override
	public Integer doSomething2(String t) {
		return Integer.valueOf(t);
	}

	public static void main(String[] args) {
		InterfaceGenericType<String, Integer> interfaceGenericType = new InterfaceGenericTypeImpl();
		System.out.println(interfaceGenericType.doSomething(5));
	}

}

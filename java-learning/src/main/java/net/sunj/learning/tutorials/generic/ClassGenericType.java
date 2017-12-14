package net.sunj.learning.tutorials.generic;

public class ClassGenericType<T> {

	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public static void main(String[] args) {
		ClassGenericType<String> classGenericType = new ClassGenericType<>();
		classGenericType.set("String Type!!!");
		System.out.println(classGenericType.get());
	}

}
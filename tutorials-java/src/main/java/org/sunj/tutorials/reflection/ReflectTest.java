package org.sunj.tutorials.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
	public static void main(String[] args) throws ClassNotFoundException {
		// 클래스 정보를 가져온다.
		Class<?> cls = Class.forName("net.sunj.learning.java.reflection.ex02.ReflectCls");

		// 가지고 있는 멤버 변수를 출력해보자. public 멤버 변수만 가져온다.
		Field[] fields = cls.getFields();
		for (Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		System.out.println("--------------------------------------------");

		// 가지고 있는 메소드의 이름을 출력 해보자. public 메소드만 가져온다.
		Method[] methods = cls.getMethods();
		StringBuffer sb = new StringBuffer();
		for (Method method : methods) {
			sb.append(method.getName());

			// 메소드 인자가 있다면 출력하자.
			Class<?>[] argTypes = method.getParameterTypes();
			sb.append("(");
			int size = argTypes.length;
			for (Class<?> argType : argTypes) {
				String argName = argType.getName();
				sb.append(argName + " val");
				if (--size != 0) {
					sb.append(", ");
				}
			}
			sb.append(")");

			// 리턴 인자를 출력하자.
			Class<?> returnType = method.getReturnType();
			sb.append(" : " + returnType.getName());

			System.out.println(sb);
			sb.setLength(0);
		}
		System.out.println("--------------------------------------------");

		// 가지고 있는 메소드를 써보자
		try {
			// 객체 하나 생성
			Object obj = cls.newInstance();

			// sum 메소드를 가져와서 합 구하기 (인자 파라미터 나열)
			Method method = cls.getMethod("sum", int.class, int.class);
			System.out.println(method.invoke(obj, 1, 2));
			
			// private 메소드 호출은 안된다.
			Method pmethod = cls.getDeclaredMethod("psum", int.class, int.class);
			System.out.println("psum : " + pmethod.invoke(obj, 1, 2));

			// sum 메소드를 가져와서 합 구하기 (클래스 배열 파라미터)
			Class[] param = { int.class, int.class };
			method = cls.getMethod("sum", param);
			System.out.println(method.invoke(obj, 5, 2));

			// sum 메소드를 가져와서 합 구하기 (다이렉트)
			method = cls.getMethod("sum", new Class[] { int.class, int.class });
			System.out.println(method.invoke(obj, new Object[] { 1, 5 }));

			// sub static 메소드를 가져와서 차이 구하기
			method = cls.getMethod("sub", int.class, int.class);
			// static 메소드는 클래스 객체가 필요 없다.
			System.out.println(method.invoke(null, 3, 1));
			// 있어도 상관은 없다.
			System.out.println(method.invoke(obj, 3, 1));
			System.out.println(method.invoke(cls, 3, 1));

			// 오버로딩 - 매개 인자가 없는 메소드 실행하기
			method = cls.getMethod("getArrayList", (Class<?>[]) null);
			method.invoke(obj);
			method = cls.getMethod("getArrayList");
			method.invoke(obj);

			// 오버로딩 - 매개 인자가 있는 메소드 실행하기
			method = cls.getMethod("getArrayList", new Class[] { int.class });
			method.invoke(obj, new Object[] { 1 });

			// 클래스를 형변환해서 테스트
			ReflectCls c = (ReflectCls) obj;
			System.out.println(c.sum(5, 2));
			System.out.println(c.sub(5, 2));
			System.out.println(ReflectCls.sub(5, 2));

		} catch (InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}

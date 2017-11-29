package net.sunj.learning.java.annotation;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsNull;
import org.junit.Test;

import net.sunj.learning.tutorials.sunj.annotation.MyContextContainer;
import net.sunj.learning.tutorials.sunj.annotation.MyObject;

public class AnnotationTest {
	@Test
	public void StringInjectorTest() throws Exception {
		// 컨텍스트 컨테이너를 초기화 합니다.
        MyContextContainer demo = new MyContextContainer();

        // MyOjbect 객체를 하나 받아옵니다.
        MyObject obj = demo.get(MyObject.class);
        
        assertThat(obj.getName(), is("My name is JDM."));
        assertThat(obj.getDefaultValue(), is("This is StringInjector."));
        assertThat(obj.getInvalidType(), is(IsNull.nullValue()));
	}
}

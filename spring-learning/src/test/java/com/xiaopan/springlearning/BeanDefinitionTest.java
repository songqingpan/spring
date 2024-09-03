package com.xiaopan.springlearning;

import org.junit.jupiter.api.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanDefinitionTest {

	@Test
	public void testGenericBeanDefinition(){
		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClassName("com.xiaopan.springlearning.entity.User");
		beanDefinition.setScope("prototype");
		beanDefinition.setInitMethodName("init");

		MutablePropertyValues propertyValues = new MutablePropertyValues();
		propertyValues.add("name", "张三");
		propertyValues.add("age", 19);
		beanDefinition.setPropertyValues(propertyValues);
	}

	@Test
	public void testRootDefinition(){
		RootBeanDefinition beanDefinition = new RootBeanDefinition();
		beanDefinition.setBeanClassName("com.xiaopan.springlearning.entity.Dog");
		MutablePropertyValues propertyValues = new MutablePropertyValues();
		propertyValues.add("color", "红色");
		propertyValues.add("age", 20);
		beanDefinition.setPropertyValues(propertyValues);

		//指定父类bean的名字, 上面是com.xiaopan.springlearning.entity.Dog, 默认为dog
		ChildBeanDefinition childBeanDefinition = new ChildBeanDefinition("dog");
		childBeanDefinition.setBeanClassName("com.xiaopan.springlearning.entity.TeddyDog");
		MutablePropertyValues propertyValues2 = new MutablePropertyValues();
		propertyValues2.add("name", "小泰迪");
		childBeanDefinition.setPropertyValues(propertyValues2);
	}

}

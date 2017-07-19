package com.rookiego.utils.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 属性描述注解
 *
 * @author zhh
 * @date 2017年7月19日-下午10:37:20
 * @jdk jdk1.8
 */
@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface FieldDsc {

	/**
	 * 属性对应中文名称
	 * 
	 * @return
	 */
	String value();

	/**
	 * 属性额外说明
	 * 
	 * @return
	 */
	String remark() default "";

}

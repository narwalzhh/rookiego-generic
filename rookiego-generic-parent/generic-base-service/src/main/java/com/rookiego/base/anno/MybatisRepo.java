package com.rookiego.base.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义Mybatis接口注解，便于Mybatis扫描
 *
 * @author zhh
 * @date 2017年7月30日-下午3:30:52
 * @jdk jdk1.8
 */
@Target(value = { ElementType.TYPE })
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MybatisRepo {

}

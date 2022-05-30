package com.annotation;

import java.lang.annotation.*;

/**
 * 忽略Token验证
 */
@Target(ElementType.METHOD) //注解作用在方法上
@Retention(RetentionPolicy.RUNTIME) //注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在
@Documented
public @interface IgnoreAuth {

}

package cn.edu.ecit.concurrency.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//表示当前主机作用的对象：类
@Target(ElementType.TYPE)
//SOURCE表示：注解在编译的时候就会被忽略掉。此处我们只想做一下标示
@Retention(RetentionPolicy.SOURCE)
/**
 * 课程用来标记线程不安全的类或者写法
 */
public @interface NotThreadSafe {
    String value() default "";
}

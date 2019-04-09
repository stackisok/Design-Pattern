package Strategy.advanced.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DiscountCondiction {
    double min() default Integer.MIN_VALUE;
    double max() default Double.MAX_VALUE;

}

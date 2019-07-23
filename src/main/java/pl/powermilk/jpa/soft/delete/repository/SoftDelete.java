package pl.powermilk.jpa.soft.delete.repository;

import java.lang.annotation.*;

/**
 * @author yuequan
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Documented
public @interface SoftDelete {
    String value() default "";
}
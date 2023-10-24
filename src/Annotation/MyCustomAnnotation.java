package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //processed at runtime
@Target(ElementType.METHOD) //applies only to the method, if you try to apply this annotation to a class or any other type it will give us a error.
public @interface MyCustomAnnotation {
    int value();
}

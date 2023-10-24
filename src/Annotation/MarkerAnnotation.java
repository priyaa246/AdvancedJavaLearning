package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //tell them when to execute this annotation runtime or compile time(source)
                                    //when the mentioned annotation is going to be active
@Target(ElementType.TYPE) //You can apply this annotation to a constructor,method, field, local variable, package.
                          //where you want to apply this annotation
public @interface MarkerAnnotation {
}

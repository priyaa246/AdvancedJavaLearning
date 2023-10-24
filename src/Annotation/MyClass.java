package Annotation;

import java.lang.reflect.Method;

public class MyClass {
    @MyCustomAnnotation(value=20)
    public void sayHello(){
        System.out.println("This is my custom annotation");
    }

    public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass();
        Method methodVal = obj.getClass().getMethod("sayHello"); //calling the method using reflection API[Kinda advanced API], can also call the method directly.
        //But this is how you want to call it if you want to use annotation properties value or if you want to fetch the value of that annotation

        MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
        System.out.println("Value from my custom annotation is: "+myCustomAnnotation.value());


    }
}

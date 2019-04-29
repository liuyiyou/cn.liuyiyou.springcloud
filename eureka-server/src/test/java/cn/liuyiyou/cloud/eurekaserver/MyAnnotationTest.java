package cn.liuyiyou.cloud.eurekaserver;

import org.junit.Test;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.type.MethodMetadata;
import org.springframework.core.type.StandardAnnotationMetadata;
import org.springframework.util.MultiValueMap;

import java.lang.annotation.Annotation;
import java.util.Set;

/**
 * @author: liuyiyou.cn
 * @date: 2019/4/29
 * @version: V1.0
 */
@MyAnnotation("abcdefg")
@MyOtherAnnotation
public class MyAnnotationTest {


    @Test
    public void test() {
        MyAnnotation annotation = AnnotationUtils.findAnnotation(MyAnnotationTest.class, MyAnnotation.class);

        StandardAnnotationMetadata standardAnnotationMetadata = new StandardAnnotationMetadata(MyAnnotationTest.class);
        String className = standardAnnotationMetadata.getClassName();
        System.out.println("(在哪个类上加的注解)className:"+className);
        Set<String> annotationTypes = standardAnnotationMetadata.getAnnotationTypes();

        annotationTypes.forEach(s -> {
            System.out.println("(在这个类上加的是什么注解)");
            System.out.println("annotationType:" + s);
            MultiValueMap<String, Object> allAnnotationAttributes = standardAnnotationMetadata.getAllAnnotationAttributes(s);
            allAnnotationAttributes.forEach((k, v) -> {
                System.out.println("key:" + k + "\tvalue" + v);
            });
            Set<MethodMetadata> annotatedMethods = standardAnnotationMetadata.getAnnotatedMethods(s);
            annotatedMethods.forEach(m -> {
                String methodName = m.getMethodName();
                String declaringClassName = m.getDeclaringClassName();
                System.out.println("methodName:" + methodName + "\tdeclaringClassName：" + declaringClassName);
            });
        });

        String value = annotation.value();
        Class<? extends Annotation> aClass = annotation.annotationType();
        System.out.println(aClass.getCanonicalName());
        System.out.println(value);
    }
}

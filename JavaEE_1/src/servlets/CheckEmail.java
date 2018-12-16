package servlets;

import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Constraint(validatedBy = {CheckEmailLogic.class})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR})
public @interface CheckEmail {
    String message() default "{servlets.CheckEmail.url.port}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    int port() default -1;
    String host() default "";
    String protocol() default "";
}

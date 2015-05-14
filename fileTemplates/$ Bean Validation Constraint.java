#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
#if ($Validator_class != "")
@Constraint(validatedBy = ${Validator_class}.class)
#else
@Constraint(validatedBy = ValidatorClass.class)
#end
@Target({TYPE, FIELD, PARAMETER})
@Retention(RUNTIME)
public @interface $NAME {

    //TODO Add custom attributes if needed

    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

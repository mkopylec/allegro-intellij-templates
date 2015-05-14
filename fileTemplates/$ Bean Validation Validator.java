#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

#if ($Constraint_annotation_class != "")
    #set($ANNOTATION = $Constraint_annotation_class)
#else
    #set($ANNOTATION = "ConstraintAnnotationClass")
#end
#if ($Validated_object_class != "")
    #set($OBJECT = $Validated_object_class)
#else
    #set($OBJECT = "ValidatedObjectClass")
#end
public class $NAME implements ConstraintValidator<$ANNOTATION, $OBJECT> {

    @Override
    public void initialize($ANNOTATION constraint) {
    }

    @Override
    public boolean isValid($OBJECT value, ConstraintValidatorContext context) {
        //TODO Validate value
        return true;
    }
}

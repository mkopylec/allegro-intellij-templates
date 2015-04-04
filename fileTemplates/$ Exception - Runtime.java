#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

public class ${NAME} extends RuntimeException {

    public ${NAME}(String message) {
        super(message);
    }
}

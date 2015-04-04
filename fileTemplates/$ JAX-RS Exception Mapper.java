#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class $NAME implements ExceptionMapper<$Exception_class> {

    @Override
    public Response toResponse($Exception_class ex) {
        return null;
    }
}

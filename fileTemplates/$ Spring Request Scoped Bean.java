#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS;

@Component
@Scope(value = "request", proxyMode = TARGET_CLASS)
public class $NAME {

}

#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("$Endpoints_root_path")
public class $NAME extends ResourceConfig {

    public $NAME() {
        //TODO Add endpoints and providers using Allegro live templates
    }
}

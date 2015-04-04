#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@Configuration
@ApplicationPath("$Endpoints_root_path")
public class $NAME extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        addResources(resources);
        return resources;
    }

    private void addResources(Set<Class<?>> resources) {
        //TODO Add endpoints and providers using Allegro live templates
    }
}

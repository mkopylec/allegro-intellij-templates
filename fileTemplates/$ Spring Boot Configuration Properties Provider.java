#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("${Properties_group_prefix}")
public class ${NAME} {
    //TODO Add field representations of properties with prefix: '${Properties_group_prefix}' application-*.yml files
}

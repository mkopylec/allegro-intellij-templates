#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import org.springframework.data.repository.CrudRepository;

public interface $NAME extends CrudRepository<$Entity_class, String> {
    //TODO Add finding methods signatures if needed
}

#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

#if ($ID_type != "" && $ID_name != "")
import org.springframework.data.annotation.Id;
#end
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "$NAME.substring(0,1).toLowerCase()$NAME.substring(1)")
public class $NAME {

#if ($ID_type != "" && $ID_name != "")
    @Id
    private $ID_type $ID_name;
    //TODO add more properties that maps to document fields in database

    public $ID_type get$ID_name.substring(0,1).toUpperCase()$ID_name.substring(1)() {
        return $ID_name;
    }

    public void set$ID_name.substring(0,1).toUpperCase()$ID_name.substring(1)($ID_type $ID_name) {
        this.$ID_name = $ID_name;
    }
#end
}

package uo.diesels.model.generator.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.resource.Resource;

public class ResourceUtils {
	
	public static String obtainGroupArtifactName(Resource resource) {
        String pattern = ".*src\\/main\\/java\\/(.*)\\/diesels.*";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(resource.getURI().toString());
        
        if (m.matches()) {
            return m.group(1);
        } else {
        	throw new RuntimeException("Can not find the package diesels with DSL files");
        }
	}
	
	public static String obtainProjectName(Resource resource) {
        String pattern = ".*resource\\/(.*)\\/src.*";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(resource.getURI().toString());
        
        if (m.matches()) {
            return m.group(1);
        } else {
        	throw new RuntimeException("Can not find the package diesels with DSL files");
        }
	}

}

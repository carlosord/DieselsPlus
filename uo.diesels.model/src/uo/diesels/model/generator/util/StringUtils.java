package uo.diesels.model.generator.util;

public class StringUtils {

	public static String remplaceDotToSlash(String s) {
		return s.replaceAll("\\.", "\\/");
	}
	
	public static String remplaceSlashToDot(String s) {
		return s.replaceAll("\\/", "\\.");
	}

	public static String toUpperFirst(String s) {
		return s.substring(0, 1).replace(s.charAt(0), s.toUpperCase().charAt(0)) + s.substring(1);
	}
	
	public static String toLowerFirst(String s) {
		return s.substring(0, 1).replace(s.charAt(0), s.toLowerCase().charAt(0)) + s.substring(1);
	}
	
	public static String removeLastChar(String s) {
		return s.substring(0, s.length() > 1 ? s.length() - 2 : s.length());
	}
	
	public static String stringNewLine(String s) {
		return s + "\n";
	}
	
	public static String newLine() {
		return "\n";
	}

}

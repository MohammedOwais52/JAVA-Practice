import java.util.regex.*;

		public class RE {

			public static void main(String[] args) {

			java.lang.String pattern = "[a-z]+";
			java.lang.String check = "Regular Expressions";
			Pattern p = Pattern.compile(pattern);
			Matcher c = p.matcher(check);
			
			while (c.find())
		      	System.out.println( check.substring( c.start(), c.end() ) );
			}
		}
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestaMatch {
	public static void main(String args[]) {
		Pattern p = Pattern.compile(args[0]);
		Matcher m = p.matcher(args[1]);
		boolean b = m.matches();
		
		System.out.println("Resultado: "+b);
	}
}
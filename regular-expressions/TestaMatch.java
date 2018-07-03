import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestaMatch{
	public static void main(String args[]) {
		Pattern p = Patter.compile("a*b");
		Matcher m = p.matcher("aaaaaab");
		boolean b = m.matches();
	}
	
}
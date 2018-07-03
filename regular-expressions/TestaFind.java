import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestaFind{
	public static void main(String args[]){
		Console console = System.console();
		
		while(true){
			Pattern pattern = 
			Pattern.compile(console.readLine("%nDigite a regex: "));
			
			Matcher matcher =
			pattern.matcher(console.readLine("Digite a cadeia: "));
			
			boolean encontrou = false;
			
			while(matcher.find()){
				console.format("Encontrei o texto "+" \"%s\" começando em %d e terminando em %d.%n", matcher.group(), matcher.start(), matcher.end());
				encontrou = true;
			}
			
			if(!encontrou){
				console.format("Nada encontrado.%n");
			}
		}
	}
}
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 
{
	public static void main(String[] args)
	{
		Pattern pattern=Pattern.compile("Fa[a-z]e");//Range of characters from a-z
		Matcher m=pattern.matcher("Fake");
		if(m.find())
		{
			System.out.println("True");
			
		}
		else
		{
			System.out.println("False");
		}
		System.out.println(Pattern.matches("Fa[ac]e", "Fabe")); //true,because either a or c will come after a
		System.out.println(Pattern.matches("Do\\[", "Do["));//true, 
		System.out.println(Pattern.matches("Do[\\[\\]]", "Do]"));
		
		//Regex Metacharacters
		System.out.println(Pattern.matches("Hi\\d", "Hi5"));
		System.out.println(Pattern.matches("Hi\\D", "Hi5"));
		System.out.println(Pattern.matches("Hello\\sWorld", "Hello World"));
		System.out.println(Pattern.matches("Hello\\SWorld", "Hello World"));
		System.out.println(Pattern.matches("Hi\\wWorld", "Hi5World"));
		System.out.println(Pattern.matches("Hi\\WWorld", "Hi5World"));
		Pattern p1=Pattern.compile("\\A[a-zA-Z]"); //Range of characters from a-z or A-Z
		Matcher m1=p1.matcher("Be strong");
		while(m1.find())
		{
			System.out.println(m1.group());
			
		}

	}

}

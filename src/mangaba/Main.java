package mangaba;
import java.io.FileReader;
import java.io.PushbackReader;

import mangaba.lexer.Lexer;
import mangaba.node.EOF;
import mangaba.node.Start;
import mangaba.node.Token;
import mangaba.parser.Parser;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "teste/teste1.man";

			Lexer lexer =
				new Lexer(
					new PushbackReader(  
						new FileReader(arquivo), 1024));
			Parser p = new Parser(lexer);
		
		/*Token token;
			while(!((token = lexer.next()) instanceof EOF)) {
				String a[] = token.getClass().toString().split(".");
				String n = token.getClass().toString();
				a = n.split("node");
				String nome = a[a.length-1];
				if (token.toString().compareTo("\n") == 0) {
					System.out.println(nome + "('"+token.getText()+"') ");
				} else {
					System.out.print(" "+ nome.substring(1, nome.length()) + "('"+token.getText()+"') ");
				}
				
			}*/
			Start tree = p.parse();
			tree.apply(new ASTDisplay());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
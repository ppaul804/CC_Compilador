package decaf;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.io.*;

import java.util.Arrays;

//import antlr.Token;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.Treewalker;
import org.antlr.v4.gui.TreeViewer;
import java6035.tools.CLI.*;

class Main {
    public static void main(String[] args) {
        try {
        	CLI.parse (args, new String[0]);

        	InputStream inputStream = args.length == 0 ?
                    System.in : new java.io.FileInputStream(CLI.infile);

        	if (CLI.target == CLI.SCAN)
        	{
        		DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
        		Token token;
        		boolean done = false;
        		while (!done)
        		{
        			try
        			{
		        		for (token=lexer.nextToken(); token.getType()!=Token.EOF; token=lexer.nextToken())
		        		{
		        			String type = ""; //Limpar
		        			String text = token.getText();

		        			switch (token.getType())
		        			{
		        			case DecafLexer.ID:
		        				type = " IDENTIFIER";
		        				break;						
						case DecafLexer.CHAR_LITERAL:
							type = " CHARLITERAL";
							break;					
						case DecafLexer.STRING_LITERAL:
							type = " STRINGLITERAL";
							break;
						case DecafLexer.INT:
							type = " INTLITERAL";
							break;
						case DecafLexer.BOOLEAN_LITERAL:
							type = " BOOLEANLITERAL";
							break;
						}
		        			System.out.println (token.getLine() + type + " " + text);
		        		}
		        		done = true;
        			} catch(Exception e) {
        	        	// print the error:
        	            System.out.println(CLI.infile+" "+e);
        	            lexer.skip();
        	        }
        		}
        	} else if (CLI.target == CLI.PARSE || CLI.target == CLI.DEFAULT){
        		DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
        		DecafParser parser = new DecafParser(tokens);
                	parser.programa();

        	} else if (CLI.target == CLI.INTER){
        		DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
        		DecafParser parser = new DecafParser(tokens);

			ParseTree tree = parser.programa();

			System.out.println(tree.toStringTree(parser));

			JFrame frame = new JFrame("Antlr AST");
			JPanel panel = new JPanel();
			TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
			
			viewr.setScale(1.5);
			panel.add(viewr);
			frame.add(panel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			frame.setVisible(true);
		}
        	
        } catch(Exception e) {
        	// print the error:
            System.out.println(CLI.infile+" "+e);
        }
    }
}


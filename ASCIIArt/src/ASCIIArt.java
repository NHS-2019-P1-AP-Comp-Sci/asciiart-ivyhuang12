/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void space() {
		System.out.println("");
		
	}
	public static void eightAstricks() {
		System.out.print("********");
	}
	
	public static void fourAstricks() {
		System.out.print("****");
	}
	
	public static void caption() {
		System.out.println("----------------------------");
	}
	public static void main (String [] args) {
		caption();
		System.out.println("|I'm hungry! I want bamboo!|");
		caption();
		System.out.println("\t\\");
		System.out.println("\t \\");
		System.out.println("\t  \\");
		System.out.println("\t   \\");
		
		space();
		space();
		space();
		space();
		System.out.print("\t");
		fourAstricks();
		System.out.print("\t\t    ");
		fourAstricks();
		System.out.print("\n       "); /*panda ears*/
		fourAstricks();
		System.out.print("\t\t     ");
		fourAstricks();	
		System.out.println("\n        **\t\t      ** ");
		space();
		
		
		
		System.out.print("       *");
		System.out.println("    **\t         **    *");
		System.out.print("      *");
		System.out.println("    ** *\t        * **    *");
		System.out.print("     *");
		System.out.println("      **\t         **      *");
		System.out.print("    *");
		System.out.println("   \t  ****\t\t  *");
		System.out.print("    *");
		System.out.println("   \t   **\t\t  *");  /*panda face*/
		System.out.print("     *");
		System.out.println("    \t********\t  *");
		System.out.println("      *  \t\t\t *");
		System.out.println("       *\t\t\t*");
		space();
	
		System.out.println("\t ***\t\t     ***");
		System.out.print("\t");
		eightAstricks();
		eightAstricks();
		eightAstricks();
		System.out.println("*");
		System.out.print("       ");
		eightAstricks();
		eightAstricks();
		eightAstricks();
		System.out.println("***");
		System.out.print("      ");
		eightAstricks();
		System.out.print("  \t   ");
		eightAstricks();
		System.out.print("\n     ");
		eightAstricks();
		System.out.print("    \t    ");
		eightAstricks();
		System.out.println("");
	    System.out.print("     ");	/*panda body*/
	    eightAstricks();
	    System.out.print("    \t    ");
	    eightAstricks();
	    System.out.println("");
	    System.out.print("     ");
	    eightAstricks();
	    System.out.print("    \t    ");
	    eightAstricks();
	    System.out.print("\n      ");
	    eightAstricks();
	    System.out.print("    \t   ");
	    eightAstricks();
	    
	    
	    space();
	    space();
	    space();
	    System.out.println("A panda exclaiming their desire for bamboo.");
	    
	    
	    
	   
		
		
	}
}
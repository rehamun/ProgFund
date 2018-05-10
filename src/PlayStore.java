/* COSC2531 Programming Fundamentals, Sem 2, 2018
 *
    !!!!!!!!!!!!!!!
    !!!IMPORTANT!!!
    !!!!!!!!!!!!!!!
 This is a sample main method that checks the funtionalities required in the assignment 2.
    This file will NOT compile unless you write all the required java classes, along with their attributes and the methods.
 */

import java.util.*;


abstract class Content{
String ID;
String applicationName;
int numberOfdowns;
double appPrice;
 ArrayList<Comment> review = new ArrayList<Comment>();
     public Content(String id, String Cname, int dwonloads, double CappPrice ,ArrayList<Comment> Creview ) 
			{
			ID = id;
			applicationName = Cname;
			numberOfdowns =  dwonloads;
			appPrice = CappPrice;
			review = Creview;
			
			}	
     public Content(String id, String Cname, int dwonloads, double CappPrice  ) 
		{
		ID = id;
		applicationName = Cname;
		numberOfdowns =  dwonloads;
		appPrice = CappPrice;
	
		}	
  
      /*
       * constructor without  ArrayList<Comment>
       *  public Content(String id, String name, int dwonloads, double CappPrice  ) 
			{
			ID = id;
			applicationName = name;
			numberOfdowns =  dwonloads;
			price = CappPrice;
			
			}*/	
     public Content(String id, String cname,  double CappPrice  ) 
		{
		ID = id;
		applicationName = cname;
		numberOfdowns =  0;
		appPrice = CappPrice;
		
		}	
     
     public Content(String id, String cname  ) 
		{
		ID = id;
		applicationName = cname;
		numberOfdowns =  0;
		appPrice = 0;// the price 
		
		}
     
    
}
/////////////////////////////////////////////////////////////
class Game extends Content {
	boolean isMultiPlayer;
	private OS os;
	public Game(String id, String cname, int dwonloads, double CappPrice,  boolean isMultiPl ,OS cos) {
		super(id, cname,dwonloads,CappPrice);
		isMultiPlayer = isMultiPl;
		os = cos;
	}
	
	public Game(String id, String cname,  double CappPrice,  boolean isMultiPl ,OS cos ) {
		super(id, cname,CappPrice);
		isMultiPlayer = isMultiPl;
		os = cos;
		//Game g1 = new Game (“G101”, “Pokemon”, 10, false, os1);
	}
	
	public Game(String id, String name,  boolean isMultiPl ,OS cos) {
		super(id, name);
		isMultiPlayer = isMultiPl;
		os = cos;
		// Game g1 = new Game (“G101”, “Pokemon”, false, os1);
	}
	
	
	
}
////////////////////////////////////////////////////////////////////////////////////////
abstract class Reading extends Content {
	String publisher;
	String genre;
	int  numberOfpages;
	
	public Reading (String id, String name, int dwonloads, double AppPrice, String Cpublisher,String Cgenre, int CnumberOfpages ) {
		super(id, name,dwonloads,AppPrice);
		publisher = Cpublisher;
		genre = Cgenre; 
		numberOfpages = CnumberOfpages;
			
	}
	
	public Reading (String id, String name, double AppPrice, String Cpublisher,String Cgenre, int CnumberOfpages ) {
		super(id, name,AppPrice);
		publisher = Cpublisher;
		genre = Cgenre; 
		numberOfpages = CnumberOfpages;
			
	}
	public Reading (String id, String name, String Cpublisher,String Cgenre, int CnumberOfpages ) {
		super(id, name);
		publisher = Cpublisher;
		genre = Cgenre; 
		numberOfpages = CnumberOfpages;
			
	}
}
////////////////////////////////////////////////////////////////////////////////////
class Book extends Reading {
	String[] author;
public 	Book(String id, String name, int dwonloads, double AppPrice, String Cpublisher,String Cgenre, int numberOfpages, String[] Cauthor) {
	super ( id,  name,  dwonloads,  AppPrice,  Cpublisher, Cgenre,  numberOfpages);
	author = Cauthor;
	
}
	
public 	Book(String id, String name, double AppPrice, String Cpublisher,String Cgenre, int numberOfpages, String[] Cauthor) {
	super ( id,  name,   AppPrice,  Cpublisher, Cgenre,  numberOfpages);
	author = Cauthor;
	
}	

public 	Book(String id, String name,  String Cpublisher,String Cgenre, int numberOfpages, String[] Cauthor) {
	super ( id,  name,  Cpublisher, Cgenre,  numberOfpages);
	author = Cauthor;
	
}
	
}	
	
/////////////////////////////////////////////////////////////////////////////////
class Magazine extends Reading {
	String title;
public 	Magazine(String id, String name, int dwonloads, double AppPrice, String Cpublisher,String Cgenre, int numberOfpages, String Ctitle) {
	super ( id,  name,  dwonloads,  AppPrice,  Cpublisher, Cgenre,  numberOfpages);
	title = Ctitle;
	
}
	
public 	Magazine(String id, String name, double AppPrice, String Cpublisher,String Cgenre, int numberOfpages, String Ctitle) {
	super ( id,  name,   AppPrice,  Cpublisher, Cgenre,  numberOfpages);
	title = Ctitle;
	//Magazine(“M21”, “Forbes”, 8, “Forbes Media”, “Business”, 50,“World’s richest under 30”);
}	

public 	Magazine(String id, String name,  String Cpublisher,String Cgenre, int numberOfpages, String Ctitle) {
	super ( id,  name,  Cpublisher, Cgenre,  numberOfpages);
	title = Ctitle;
	//Magazine(“M21”, “Forbes”,  “Forbes Media”, “Business”, 50,“World’s richest under 30”);	
}
	
}	

/////////////////////////////////////////////////////////////////////////////////

class Comment{
	private User user;
	String comment;
	Object [] commentArray;
	Comment(User u, String comm){
	user = u;
	comment = comm;
	//Comment cmnt = new Comment(u1, “This is a fantastic game!”);
	}
	
}
/////////////////////////////////////////////////////////////////////////////////
class OS{
	
String TypeOfOS;
int versionNumber;

public OS(String OStype, int versionNum) {
	TypeOfOS = 	OStype;
	versionNumber = versionNum;
	
	//OS os1 = new OS(“Android”, 4);
	
}
	
}
/////////////////////////////////////////////////////////////////////////////////
class User{
	
String ID;
String name;
String phonNumber;
double balance;
private OS os;
private Content content;
ArrayList<String> premium = new ArrayList<String>();
public User (String id, String Cname, String CphoneNum, double Cbalance, OS Cos) {
	
ID = id;
name = Cname;
phonNumber = CphoneNum;
balance = Cbalance;
os = Cos;
}

public User (String id, String Cname, String CphoneNum, OS Cos) {
	
ID = id;
name = Cname;
phonNumber = CphoneNum;
os = Cos;

}
public void becomePremium(User usr) {
	// misunderstanding 
	if ( balance < 0 )
	{
		System.out.println("insufficient balance.");
	}
	else if (content.appPrice > 100)
	{
		
		premium.add(name);
		
	}
}
public String getuser() {
return 	name;
}

public void buyContent(Content con)
  {
	
		balance -= content.appPrice;
		for (String var : premium) 
		{ 
		 if(var == name)   
		 {
			content.appPrice=content.appPrice * (20/100); 
		 }
		}
       content.numberOfdowns +=1;
       
       if (con instanceof Game )   
       {
    	   
    	   
       }
  }

}
/////////////////////////////////////////////////////////////////////////////////
public class PlayStore {

	public static void main(String[] args) {
		

	}

}



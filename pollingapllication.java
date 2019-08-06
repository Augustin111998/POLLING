package pollingapllication;

import java.util.Scanner;

public  class   pollingapllication{
	static Scanner scanner = new Scanner(System.in);
	static String s;
	
    public static  void Candidates(){
    	
	String  s="W";
	System.out.println("CANDIDATES ELECTION");
    System.out.println("TOTAL NUMBER OF CANDIDATES :3");
    System.out.println("THE CANDIDATES ARE : \n (1) jayalalitha \n (2) stalin \n (3) dhinakar:");
    System.out.println("TO KNOW THE CANDIDATES RESPECTIVE WARD's press (W):");
    s=scanner.next();
     
    }
	public static void wards(String s){
		
		System.out.println( "press 1 for jeyalalitha, press 2 for stalin ,press  3 for dhinakar:");
		char operator= scanner.next().charAt(0);
		  
		switch(operator) {
		     case '1':
		    	 System.out.println( "JAYALAITHA'S WARD IS *THRIVALLUR*");
		    	 break;
		     case '2':
		    	 System.out.println( " STALIN'S WARD IS *KOLATHUR*");
		    	 break;
		     case '3':
		    	 System.out.println( " DHINAKAR'S WARD IS *PORUR*");
		    	 break;
		    default:
		    	System.out.println("YOU ENTERED A WORNG OPTION PLEASE ENTER A VALID CANDIDATE NUMBER( 1 or 2 or 3)");
		    	
		    	
		    	 }
		}
	public  static void votting(){
		
		System.out.println("PLEASE ENTER A RESPECTIVE ALPHABETS OF CANDIDATES TO VOTE THEM : \n (J) jayalalitha \n (R) stalin \n (S) dhinakar");
		System.out.println("please enter your choice:");
		char votting= scanner.next().charAt(0);
		
		
		switch(votting) {
	     case 'J':
	    	 System.out.println( "YOU VOTED JEYALALITHA\n");
	    	 break;
	     case 'S':
	    	 System.out.println( " YOU VOTED STALIN\n");
	    	 break;
	     case 'D':
	    	 System.out.println( " YOU VOTED DHINAKAR\n");
	    	 break;
	    default:
	    	System.out.println("YOU ENTERED A WRONG OPTION PLEASE SELECT (J) OR (S) OR (D)....");
	    	Candidates( );
	    	wards(s);
			votting();
	    	
	    	}
		  
		  
		  }
	public static void main(String[] args) {
		pollingapllication obj=new pollingapllication();
		pollingapllication.Candidates();
		obj.wards(s);
		obj.votting();
		Candidates();
		wards(s);
		votting();
		 }
}
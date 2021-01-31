import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Player extends Node {
	
	protected Node first=null;
	protected Node last=null;
	String nameOfPlayer="";
	Player()
	{
		super();
		System.out.print("Welcome, Enter Player Name: ");
		Scanner object= new Scanner(System.in);
		nameOfPlayer=object.next();
		Node new_node=new Node();
		first=new_node;
		last=new_node;
	}
	
	
	void handOutCard(ArrayList <String> cards, String word)
	{
		
			Node new_card=new Node();
			new_card.card_info=word;
			last.next=new_card;
			last=new_card;
				
			
	}

	
	void seeHand()
	{
		Node temp=first.next;
		while(temp!=null)
		{
				
				System.out.print(temp.card_info + "   ");
				temp=temp.next;
			
		}
		

		System.out.println("");
		
	}
	

	void chooseTeamMate()
	{
		System.out.print("Which player you like to be your teammate?");
		Scanner object=new Scanner(System.in);
		String teamMate=object.nextLine();
		System.out.println(this.nameOfPlayer + ", "  + teamMate + " is your teammate..");
	}
	
	
	int getRandNumber(int UpperBound)
	{
		Random r= new Random();
		int rand = r.nextInt(UpperBound);
		return rand;
	}
	
	
	

	
	void readSecondaryArray(ArrayList <String> ma)
	{
		for(int i=0;i<5;i++)
		{
			System.out.print(ma.get(i) + " ");
		}
		System.out.println("");
	}
	
	
	

	public static void main(String args [])
	{		
		ArrayList <String> cards= new ArrayList <String>(52);
		ArrayList <String> playerHand=new  ArrayList <String>();
		Scanner myReader= null;
		String word;
		int size=52;
		File file =new File("Card.txt");

		try {
			myReader = new Scanner (file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(myReader.hasNext())
		{
			word=myReader.next();
			cards.add(word);
		}
		

		// cards is filled at this point
		Player p1=new Player();
		CARD d=new CARD();
		for(int i=0;i<5;i++)
		{
			int m= cards.size();
			int rand_n=p1.getRandNumber(m);
			String a1=d.getrandCard(cards, rand_n);
			playerHand.add(a1);
			cards.remove(a1);
		}
		p1.readSecondaryArray(playerHand);
		
		
		Player p2=new Player();
		CARD d2=new CARD();
		ArrayList <String> play=new  ArrayList <String>();
		for(int i=0;i<5;i++)
		{
			int m= cards.size();
			int rand_n=p2.getRandNumber(m);
			String a1=d2.getrandCard(cards, rand_n);
			play.add(a1);
			cards.remove(a1);
		}
		p2.readSecondaryArray(play);
		
		
		Player p3=new Player();
		CARD d3=new CARD();
		ArrayList <String> play3=new  ArrayList <String>();
		
		for(int i=0; i<5;i++)
		{
		int u3= cards.size();
		int r3=p3.getRandNumber(u3);
		String a3= d3.getrandCard(cards, r3);
		play3.add(a3);
		cards.remove(a3);
		}
		p3.readSecondaryArray(play3);
		
		
		
		
		Player p4=new Player();
		CARD d4=new CARD();
		ArrayList <String> play4=new  ArrayList <String>();
		for(int i=0; i<5;i++)
		{
		int u4= cards.size();
		int r4=p4.getRandNumber(u4);
		String a4= d4.getrandCard(cards, r4);
		play4.add(a4);
		cards.remove(a4);
		}
		p4.readSecondaryArray(play4);
		
		
		
		
		
		
		int m= cards.size();
		System.out.print(m);
		
		
		
	
	}


}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CARD {


int getCurrentSize(ArrayList <String> cards)
{
	int length=cards.size();
	System.out.print(length + " ");
	return length;
}



void deleteCard(ArrayList <String> cards,int index)
{
	String w=cards.get(index);
	cards.remove(w);
}



String getrandCard(ArrayList <String> cards,int position)
{
	String array_W = null;
	array_W=cards.get(position);
	return array_W;
	
}
	
	
	
	
	
	
	
	

}

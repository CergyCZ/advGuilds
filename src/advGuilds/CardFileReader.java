package advGuilds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CardFileReader {
	
	Scanner lineScanner;
	int id;
	String itemFileName = "itemCardsData";
	String path = new String("src/advGuilds/cardsData/");
	
	
	public CardFileReader() { //nedelat v konstruktoru, ale samostatnou metodou. Aby se dal menit soubor za behu.
		id = 1000;
			
		readItemFile();
	}
	
	
	public void readItemFile() {
		int id, price;
		String name, desc;
		itemType iType;
		File cardFile = new File(path + itemFileName);
		try (Scanner lineScanner = new Scanner(cardFile)) { //tohle prej nemusi mit close()
			while(lineScanner.useDelimiter(";").hasNext()) {
				
				System.out.println(lineScanner.useDelimiter(";").next());
				price = lineScanner.useDelimiter(";").nextInt();
				name = lineScanner.useDelimiter(";").next();
				desc = lineScanner.useDelimiter(";").next();
				iType = itemType.valueOf(lineScanner.useDelimiter(";").next());
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	public Card getOneCard() {
		
		
		
		
		
		return new Card(getNewId(), 0, "line", "line");//dodelat
	}
	
	
	private int getNewId() {
		return ++id;
	}
	

}

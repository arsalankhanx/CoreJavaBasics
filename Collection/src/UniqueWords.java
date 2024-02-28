import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;


public class UniqueWords {
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("C:/word.txt");
		ArrayList arr = new ArrayList();
		HashMap<String, Integer> listOfWords = new HashMap<String, Integer>();
		Scanner in = new Scanner(f);
		int i = 0;
		while(in.hasNext())
		{
			String s = in.next();
			//System.out.println(s);
			arr.add(s);
		}
		Iterator itr = arr.iterator();
		while(itr.hasNext())
		{
			i++;
			listOfWords.put((String)itr.next(),i);
			//System.out.println(listOfWords);
		}
         Set sh = listOfWords.keySet();
		System.out.println(sh);
	     
	}

}

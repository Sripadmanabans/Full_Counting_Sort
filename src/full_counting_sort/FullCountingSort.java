package full_counting_sort;


import java.util.HashMap;
import java.util.Scanner;

public class FullCountingSort 
{
	public static void countSort(int index[], String content[]) 
	{
		HashMap<Integer, StringBuilder> map = new HashMap<Integer, StringBuilder>();
		int count[] = new int[100];
		for(int i = 0; i < index.length; i++)
		{
			count[index[i]] += 1;
			StringBuilder contents = new StringBuilder();
			if(i < (index.length / 2))
			{
				if(map.containsKey(index[i]))
				{
					contents = map.get(index[i]);
				}
				contents.append("- ");
			}
			else
			{
				if(map.containsKey(index[i]))
				{
					contents = map.get(index[i]);
				}
				contents.append(content[i] + " ");
			}
			map.put(index[i], contents);
		}
		for(int i = 0; i < count.length; i++)
		{
			if(count[i] != 0)
			{
				System.out.print(map.get(i));
				
			}
		}
	}
	public static void main(String args[]) 
	{
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int index[] = new int[n];
		String content[] = new String[n];
		for(int i = 0; i < n; i++)
		{
			index[i] = sr.nextInt();
			content[i] = sr.next();
		}
		countSort(index, content);
		sr.close();
	}
}

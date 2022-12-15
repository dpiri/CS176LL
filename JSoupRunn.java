import java.io.IOException; 
import java.util.ArrayList; 
import java.util.Map; 
import java.util.TreeMap; 

import org.jsoup.*; 
import org.jsoup.nodes.Document; 
import org.jsoup.select.Elements; 
import org.jsoup.nodes.Element; 

import org.jsoup.Jsoup; 

public class JSoupRunn 
{
	
	public static void main(String [] args) throws IOException 
			{ 

			ArrayList<String> Ranks2020= new ArrayList<String>(); 
			ArrayList<String> Ranks2021= new ArrayList<String>(); 
			ArrayList<String> Ranks2022= new ArrayList<String>(); 

			//String[] Ranks2020= new String[142]; 
			//String[] Ranks2021= new String[132]; 
			//String[] Ranks2022= new String[130]; 

			ArrayList<String> finalList= new ArrayList<String>(); 
			ArrayList<String> all_repeat= new ArrayList<String>(); 
			ArrayList<Double> arrayList_AVG_POS= new ArrayList<Double>(); 

			try 
			{ 

			Document doc1= Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0&page=1_300").get(); 

			String text=doc1.body().text(); 

			Elements links = doc1.select("tbody"); 

			int counter=0; 

			for(Element link : links.select("td.grid_line_regular")) 
			{ 

			final String name=link.select("a").text(); 

			if(name!="" && name.length()>3) 
			{ 

			Ranks2022.add(name); 

			counter++;	 

		} 

		} 

			}catch (IOException e) { 

			e.printStackTrace(); 

		} 

			System.out.println("Leaderboard For 2022"); 

			System.out.println(); 

			for(int i=0; i<10; i++) { 

			System.out.println(Ranks2022.get(i)); 

		} 

			System.out.println(); 

			try 
			{ 

			Document doc2= Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0&page=1_300").get(); 

			String text=doc2.body().text(); 

			Elements links = doc2.select("tbody"); 

			int counter=0; 

			for(Element link : links.select("td.grid_line_regular")) 
			{ 

			final String name=link.select("a").text(); 

			if(name!="" && name.length()>3) 
			{ 

			Ranks2021.add(name); 

			counter++; 

		} 

		} 

		}	
			catch (IOException e) 
			
			{ 

			e.printStackTrace(); 

		} 

			System.out.println("Leaderboard For 2021"); 

			System.out.println(); 

			for(int i=0; i<10; i++) 
			{ 

			System.out.println(Ranks2021.get(i)); 

		} 

			try 
			{ 

			Document doc3= Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0&page=1_300").get(); 

			String text=doc3.body().text(); 

			Elements links = doc3.select("tbody"); 

			int counter=0; 

			for(Element link : links.select("td.grid_line_regular")) 
			{ 

			final String name=link.select("a").text(); 

			if(name!="" && name.length()>3) 
			{ 

			Ranks2020.add(name); 

			counter++; 

		} 

		} 

			}catch (IOException e) 
			{ 

			e.printStackTrace(); 

		} 

			System.out.println(); 

			System.out.println("Leaderboard For 2020"); 

			System.out.println(); 

			for(int i=0; i<10; i++) { 

			System.out.println(Ranks2020.get(i)); 

		} 

			for(int i = 0; i< Ranks2022.size(); i++) 
			{ 

			if(Ranks2021.contains(Ranks2022.get(i))) 
			{ 

			finalList.add(Ranks2022.get(i)); 

		} 

		} 

			for(int i = 0; i< finalList.size(); i++) 
			{ 

			if(Ranks2020.contains(finalList.get(i))) 
			{ 

			all_repeat.add(finalList.get(i)); 

		} 

		} 

			System.out.println(); 

			for(int i = 0; i< all_repeat.size(); i++) 
			{ 

			arrayList_AVG_POS.add(((Ranks2022.indexOf(all_repeat.get(i)) + 1) + 

			(Ranks2021.indexOf(all_repeat.get(i)) + 1) + (Ranks2020.indexOf(all_repeat.get(i)) + 1)) 

			/ 3.0); 

		} 

			TreeMap<Double, String> ranks = new TreeMap<Double, String>(); 

			for(int i = 0; i< all_repeat.size(); i++) { 

			ranks.put(arrayList_AVG_POS.get(i), all_repeat.get(i)); 

		} 

			System.out.println("Top Ten Players From 2020, 2021, and 2022"); 

			System.out.println(); 

			for(int x = 0; x<11; x++) { 

			Map.Entry<Double, String> namePLUSrank = ranks.pollFirstEntry(); 

			String names = namePLUSrank.getValue(); 
			Double rank = namePLUSrank.getKey(); 
			System.out.println(x+1 + " : " + names + " | " + rank); 

		} 

		} 

		} 
		
		
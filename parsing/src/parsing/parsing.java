package parsing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class parsing {

	public static void main(String[] args) {
		String path = "sample.csv";

		List<List<String>> records = csv.getData(path);

		System.out.println("Registrerar belastning:");
		for (List<String> line : records) {
			System.out.println(line);
		}

		System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");

		int member1 = 1;
		int member2 = 2;
		String searchWord = "a";
		List<String> nameWithA = new ArrayList<String>();

		for (List<String> line : records) {
			if(line.get(member1).length() < 15) {
			// hoppar över första
				if (line.get(member1).toLowerCase().contains(searchWord)) {
					nameWithA.add(line.get(member1));
				}
				if (line.get(member2).toLowerCase().contains(searchWord)) {
					nameWithA.add(line.get(member2));
				}
			}
		}

		System.out.println("det finns " + nameWithA.size() 
							+ " personer vars namn innerhåller  " 
							+ searchWord + ":");
		System.out.println(nameWithA);

		System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------\n");

		int timeStamp = 0;
		List<Integer> indexes = new ArrayList<>();

		for (int i = 0; i < records.size(); i++) {
			List<String> checkline = records.get(i);
			for (List<String> line : records) {
				if ((!line.equals(checkline)) && 
						(line.get(timeStamp).equals(checkline.get(timeStamp)))) {
					
					indexes.add(i);
				}
			}
		}

		System.out.println("Det är " + indexes.size() 
							+ " grupper som har samma tidsstämpel som andra:");
		for (Integer i : indexes) {
			System.out.println(records.get(i));
		}

		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------\n");

		int workWith = 6;
		String andriod = "Android App";
		List<String> workWithA = new ArrayList<String>();

		for (List<String> line : records) {
			if (line.get(workWith).equals(andriod)) {
				workWithA.add(line.get(member1));
				workWithA.add(line.get(member2));
			}
		}

		System.out.println("Det är " + workWithA.size() 
							+ " \r\n" + 
							"människor som vill arbeta med Android-appen:");
		System.out.println(workWithA);

		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------\n");

		int email1 = 3;
		int email2 = 4;

		Map<String, String> accounts = new TreeMap<String, String>();

		for (List<String> line : records) {
			if ((!line.get(member1).equals("")) && (line.get(member1).length() < 15)) {
			
				accounts.put(line.get(member1), line.get(email1));
				accounts.put(line.get(member2), line.get(email2));
			}
		}

		Set<String> errorKeys = new TreeSet<String>();

		for (String key : accounts.keySet()) {
			System.out.println("Namn: " + key + " Email: " + accounts.get(key));
			for (String testKey : accounts.keySet()) {
				if (!key.equals(testKey) && 
						accounts.get(key).equals(accounts.get(testKey))) {
					errorKeys.add(key);
				}
			}
		}

		System.out.println("\nDet är " + errorKeys.size() 
							+ " \r\n" + 
							"människor som har likadan e-post:");

		for (String s : errorKeys) {
			System.out.println("Namn: " + s + " Email: " + accounts.get(s));
		}

	}

}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

//კონსოლიდან შეგვყავს წყვილ-წყვილად მეგობრების სახელები, მანამ სანამ არ შევიყვანთ
//ცარიელ სტრინგს. დაბეჭდეთ იმ ადამიანის სახელი ვისაც ჰყავს ყველაზე მეტი მეგობარი.
//მეგობრობა შეიძლება იყოს ცალმხრივი. თუკი შევიყვანთ A-ს და B-ს, ეს ნიშნავს, რომ A არის
//B-ს მეგობარი, მაგრამ B შეიძლება არ იყოს A-ს მეგობარი.

//problem 64 and problem 65 solution is in this class.
public class Problem63 extends ConsoleProgram {

	private Map<String, ArrayList<String>> friendsList = new HashMap<String, ArrayList<String>>();

	public void run() {
		while (true) {
			String name = readLine("Enter your name: ");
			if (friendsList.containsKey(name)) {
				println(name + "'s friend list is already saved. Please type in another person.");
				name = readLine("Enter your name: ");
			}
			if (name.equals(""))
				break;
			friendsList.put(name, new ArrayList<String>());
			typingFriends(name);
		}

		printPeoplesNamesAndTheirFriends();
		detectWhoHasMostFriends();
	}

	private void detectWhoHasMostFriends() {
		String popularFriend = "";
		int maxFriend = 0;
		for (String name : friendsList.keySet()) {
			if (friendsList.get(name).size() > maxFriend) {
				maxFriend = friendsList.get(name).size();
				popularFriend = name;
			}
		}
		println(popularFriend + "'s the most popular guy." + popularFriend + " have " + maxFriend + " friends.");
	}

	private void typingFriends(String name) {
		while (true) {
			String friend = readLine("Enter your friend: ");
			if (friend.equals(""))
				break;
			if (friendsList.get(name).contains(friend)) {
				println(friend + " is already saved in your current friends list.");
				friend = readLine("Enter your friend: ");
				if (friend.equals(""))
					break;
			}
			friendsList.get(name).add(friend);
		}

	}

	private void printPeoplesNamesAndTheirFriends() {
		for (String person : friendsList.keySet()) {
			print(person + "'s friends are: ");
			printFriends(person);
		}

	}

	private void printFriends(String person) {
		for (int i = 0; i < friendsList.get(person).size(); i++) {
			if (i < friendsList.get(person).size() - 1) {
				print(friendsList.get(person).get(i) + ", ");
			} else {
				print(friendsList.get(person).get(i) + ". ");
			}
		}

	}
}

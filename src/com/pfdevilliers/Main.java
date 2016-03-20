package com.pfdevilliers;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		String[] suites = {"Spades", "Diamonds", "Hearts", "Clubs"};
		String[] types = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
		ArrayList<Card> deck = new ArrayList<Card>();
	
		for (int i = 0; i < suites.length; i++) {
			for (int j = 0; j < types.length; j++) {
				deck.add(new Card(suites[i], types[j]));
			}
		}
		System.out.println(deck);
		Collections.shuffle(deck);
		System.out.println(deck);
	}

}

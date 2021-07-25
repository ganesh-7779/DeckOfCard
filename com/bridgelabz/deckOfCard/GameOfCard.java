package com.bridgelabz.deckOfCard;
/**
 * Purpose : Distribute 9 card of deck each four player by shuffling deck of card.
 * @author Ganesh Gavhad
 * @Version 1.0
 * @Since 25-07-2021
 *
 */
import java.util.Random;

public class GameOfCard{
	String [] suit = {"Clubs","Diamond","Hearts","Spades"};
	String [] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	static String [] Deck = new String [52];
	String [][] ShuffleDeck = new String [12][3];
	
	public static void main(String[] args) {
		GameOfCard card = new GameOfCard();
		card.deckOfCard();
		card.shuffleCard();
		card.twoDArray();
	}
	/**
	 * Creates a deck of cards (1D array) from Suit[] and ranks[]
	 **/
	public void deckOfCard() {
		for (int i=0; i<Deck.length;i++) {
			
			Deck[i]=suit[i/13]+"-"+rank[i%13];	
		}
	}

	/**
	 * Shuffles the deck of card
	 */
	public void shuffleCard() {
		Random random = new Random ();
		for(int i=0; i<Deck.length;i++) {
			int index =random.nextInt(52);
			String temp = Deck[i];
			Deck[i]=Deck[index];
			Deck[index]=temp;
		}
	}
	/**
	 * Stores shuffled deck array into 2D array
	 *And Distributed 9 card each four player
	 */
	public void twoDArray() {
		for(int j=0;j<12;j++)
		{
			for(int k=0;k<3;k++)
			{	
				ShuffleDeck[j][k]=Deck[(k*10)+j];
				System.out.print(ShuffleDeck[j][k]+"  ||  ");
			}
			System.out.println();
			if((j+1)%3==0)
				System.out.println();
		}
	}
}

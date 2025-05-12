package com.intheeast.interfaces;

// 자바에서 지원해주는 인터페이스를 상속받는 인터페이스를 정의할 수 있다.
public interface Card extends Comparable<Card> {

	/*public static final*/Double e = 3.14;
	// public int compareTO(Card o);	

	public enum Suit { 
        DIAMONDS (1, "Diamonds"), 
	    CLUBS    (2, "Clubs"   ), 
	    HEARTS   (3, "Hearts"  ), 
	    SPADES   (4, "Spades"  );
	    
	    private final int value;
	    private final String text;
	    Suit(int value, String text) {
	        this.value = value;
	        this.text = text;
	    }
	    public int value() {return value;}
	    public String text() {return text;}
	}
	
	public enum Rank { 
	    DEUCE  (2 , "Two"  ),
	    THREE  (3 , "Three"), 
	    FOUR   (4 , "Four" ), 
	    FIVE   (5 , "Five" ), 
	    SIX    (6 , "Six"  ), 
	    SEVEN  (7 , "Seven"),
	    EIGHT  (8 , "Eight"), 
	    NINE   (9 , "Nine" ), 
	    TEN    (10, "Ten"  ), 
	    JACK   (11, "Jack" ),
	    QUEEN  (12, "Queen"), 
	    KING   (13, "King" ),
	    ACE    (14, "Ace"  );
	    private final int value;
	    private final String text;
	    Rank(int value, String text) {
	        this.value = value;
	        this.text = text;
	    }
	    public int value() {return value;}
	    public String text() {return text;}
	}
	
	public Card.Suit getSuit();
	public Card.Rank getRank();
}

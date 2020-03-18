package io.github.hedi_guedidi;

public class DiceUser {
	public static TripletOfDice rollOnce(){
		TripletOfDice res = new TripletOfDice(6);
		res.rollAllDice();
		return res;
	}
	public static void main(String[] args) {
		TripletOfDice res=rollOnce();
		System.out.println("the number on the die 1 is "+res.getfirstDie());
		System.out.println("the number on the die 2 is "+res.getSecondDie());
		System.out.println("the number on the die 3 is "+res.getThirdDie());
	}
}

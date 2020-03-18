package io.github.hedi_guedidi;

public class DiceUser {
	public static TripletOfDice rollOnce(){
		TripletOfDice res = new TripletOfDice(6);
		res.rollAllDice();
		return res;
	}
	public static void main(String[] args) {
		TripletOfDice res=rollOnce();
		System.out.println("The die number 1 is a "+res.getfirstDie());
		System.out.println("The die number 1 is a "+res.getSecondDie());
		System.out.println("The die number 1 is a "+res.getThirdDie());
	}
}

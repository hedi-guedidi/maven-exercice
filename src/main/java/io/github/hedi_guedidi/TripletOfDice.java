package io.github.hedi_guedidi;

public class TripletOfDice{
	private int numfacedie;
	private int valdie1;
	private int valdie2;
	private int valdie3;
	/**
	 * this constructor initializes the number of face of the 3 dice
	 * 
	 * 
	 * @param numface a number greater or equal to 1 represents the number of faces wanted in the 3 dice
	 */
	public TripletOfDice(int numface) {
		numfacedie=numface;
		valdie1=-1;
		valdie2=-1;
		valdie3=-1;

	}
	/**
	 * Roll the 3 dice (give them values between 1 and the number of face)
	 */
	public void rollAllDice() {
		valdie1=(int)(Math.random()*(numfacedie)) + 1;
		valdie2=(int)(Math.random()*(numfacedie)) + 1;
		valdie3=(int)(Math.random()*(numfacedie)) + 1;
	}
	/**
	 * give value between 1 and the number of face to the dice in parameter
	 * @throws IllegalArgumentException if die number isn't 1,2 or 3
	 * @param dieNumber should be equal to 1 ,2 or 3 and represents which die to roll
	 */

	public void rollOneDie(int dieNumber) {
	if(dieNumber==1) {
		valdie1=(int)(Math.random()*(numfacedie-1)) + 1;
	}
	else {
		if(dieNumber==2) {
			valdie2=(int)(Math.random()*(numfacedie-1)) + 1;
		}
		else {
			if(dieNumber==3) {
				valdie3=(int)(Math.random()*(numfacedie-1)) + 1;
			}
			else {
				throw new IllegalArgumentException();
			}
		}
	}
	}
	/**
	 * @throws IllegalStateException if the die isn't initialized (rolled)
	 * @return the value of the first dice
	 */
	public int getfirstDie(){
		if(valdie1 ==-1) {
			throw new IllegalStateException();
		}
		return valdie1;
		
	}
	/**
	 * 
	 * @throws IllegalStateException if the die isn't initialized (rolled)
	 * @return the value of the second dice
	 */

	public int getSecondDie() {
		if(valdie2 ==-1) {
			throw new IllegalStateException();
		}
		return valdie2;
	}
	/**
	 * @throws IllegalStateException if the die isn't initialized (rolled)
	 * @return the value of the third dice
	 */
	public int getThirdDie() {
		if(valdie3 ==-1) {
			throw new IllegalStateException();
		}
		return valdie3;
	}
}
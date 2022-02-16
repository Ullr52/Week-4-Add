package model;

/**
 * @author jword - jord
 * CIS175 - Spring - 2022
 * Feb 9, 2022
 */
public class AddFourNumbers {
	
	private int numOne;
	private int numTwo;
	private int numThree;
	private int numFour;
	private int sum;
	/**
	 * 
	 */
	public AddFourNumbers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	/**
	 * @param numOne
	 * @param numTwo
	 * @param numThree
	 * @param numFour
	 * @param sum
	 */
	public AddFourNumbers(int numOne, int numTwo, int numThree, int numFour) {
		super();
		this.numOne = numOne;
		this.numTwo = numTwo;
		this.numThree = numThree;
		this.numFour = numFour;


	}





	/**
	 * @param numOne
	 * @param numTwo
	 * @param numThree
	 * @param numFour
	 * @param sum
	 */
	public AddFourNumbers(int sum) {
		super();
		this.sum = sum;
		setSum (numOne, numTwo, numThree, numFour);

	}




	/**
	 * @return the numOne
	 */
	public int getNumOne() {
		return this.numOne;
	}
	/**
	 * @param numOne the numOne to set
	 */
	public void setNumOne(int numOne) {
		this.numOne = numOne;
	}
	/**
	 * @return the numTwo
	 */
	public int getNumTwo() {
		return this.numTwo;
	}
	/**
	 * @param numTwo the numTwo to set
	 */
	public void setNumTwo(int numTwo) {
		this.numTwo = numTwo;
	}
	/**
	 * @return the numThree
	 */
	public int getNumThree() {
		return this.numThree;
	}
	/**
	 * @param numThree the numThree to set
	 */
	public void setNumThree(int numThree) {
		this.numThree = numThree;
	}
	/**
	 * @return the numFour
	 */
	public int getNumFour() {
		return this.numFour;
	}
	/**
	 * @param numFour the numFour to set
	 */
	public void setNumFour(int numFour) {
		this.numFour = numFour;
	}
	/**
	 * @return the sum
	 */

	public int getSum() {
	
		this.sum = numOne + numTwo + numThree + numFour;

		return this.sum;
	}
	
	
	/**
	 * @param sum the sum to set
	 */
	public void setSum(int numOne, int numTwo, int numThree, int numFour) {

		this.sum = sum;

		

	
		
		
	}
	









	@Override
	public String toString() {
		return "AddFourNumbers [ numOne=" + numOne + ", numTwo=" + numTwo + ", numThree="
				+ numThree + ", numFour=" + numFour + ", sum=" + sum + "]";
	}
	
	

	
	

}

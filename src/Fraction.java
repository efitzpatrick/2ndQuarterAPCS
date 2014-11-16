/**
 * Ellie Fitzpatrick
 * AP Computer Science
 * Nov 9, 2014
 * Mrs. Zayas
 * Fraction Class
 */

public class Fraction {
 //Initialize variables
	private int numerator;
	private int denominator;
	
  //constructor
 public Fraction(int num, int denom){
   numerator = num;
   denominator = denom;
 }
 
 //accessors
 public int getNumerator(){
  return numerator;
 }
 
 public int getDenominator(){
   return denominator;
 }
 
 public String toString(){
   String str;
   str = this.numerator + "/" + this.denominator;
   return str;
   
 }
 
 
 public Fraction add(Fraction frac){
  int leftNum, rightNum, leftDenom, rightDenom, newNum, newDenom;
  
  leftNum = this.numerator;
  leftDenom = this.denominator;
  
  //frac1.add(frac2)
  //this.<method> refers to frac1
  //frac.getNumerator refers to frac2
  
  rightNum = frac.getNumerator();
  rightDenom = frac.getDenominator();
  
  newNum = leftNum*rightDenom + rightNum*leftDenom;
  newDenom = leftDenom * rightDenom;
  
  Fraction sum = new Fraction(newNum, newDenom); //delares new fraction, sum
  
  return sum;
 }
 public Fraction subtract(Fraction frac){
	 int leftNum, rightNum, leftDenom, rightDenom, newNum, newDenom;

	 leftNum = this.numerator;
	 leftDenom = this.denominator;

	 rightNum = frac.getNumerator();
	 rightDenom = frac.getDenominator();

	 newNum = leftNum*rightDenom - rightNum*leftDenom;
	 newDenom = leftDenom * rightDenom;

	 Fraction subtract = new Fraction(newNum, newDenom);

	 return subtract;
 }
 public Fraction multiply(Fraction frac){
	 int leftNum, rightNum, leftDenom, rightDenom, newNum, newDenom;

	 leftNum = this.numerator;
	 leftDenom = this.denominator;

	 rightNum = frac.getNumerator();
	 rightDenom = frac.getDenominator();

	 newNum = leftNum *rightNum;
	 newDenom = leftDenom * rightDenom;

	 Fraction divide = new Fraction(newNum, newDenom);

	 return divide;
 }
 public Fraction divide(Fraction frac){
	 int leftNum, rightNum, leftDenom, rightDenom, newNum, newDenom;

	 leftNum = this.numerator;
	 leftDenom = this.denominator;

	 rightNum = frac.getNumerator();
	 rightDenom = frac.getDenominator();

	 newNum = leftNum *rightDenom;
	 newDenom = leftDenom *rightNum;

	 Fraction divide = new Fraction(newNum, newDenom);

	 return divide;
 }


}



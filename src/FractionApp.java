/**
 * Ellie Fitzpatrick
 * AP Computer Science
 * Nov 10, 2014
 * Mrs. Zayas
 * Title
 */


public class FractionApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction frac1 = new Fraction(1,2);
		Fraction frac2 = new Fraction(3, 4);
		
		Fraction add, sub,  mult, divide;
		
		
		add = frac1.add(frac2); //frac 1 is this. frac 2 is the object frac (that is a parameter)
		sub = frac1.subtract(frac2);
		mult = frac1.multiply(frac2);
		divide = frac1.divide(frac2);
		
		
		System.out.println("Add 1/2 and 3/4 =" + add.toString());
		System.out.println("Subtract 1/2 and 3/4 =" + sub.toString());
		System.out.println("Multiply 1/2 and 3/4 =" + mult.toString());
		System.out.println("Divide 1/2 and 3/4 =" + divide.toString());
		
	}

}

/*
 * for i in range(1,9):
 * 		if (newNum % i && newDenom % i):
 * 			newNum = newNum / i
 * 			newDenom= newDenom /i
 * 		else:
 * 			pass*/

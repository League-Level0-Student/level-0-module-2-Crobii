//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
		// 1. Make a main method that includes all the steps below
		Random ran = new Random();
		// 2. Get the user to enter a question for the 8 ball to answer
		JOptionPane.showInputDialog("What do you want to ask?");

		// 3. Make a variable and initialize it to a random number.
		// ** You will need to make a random object!
		// Limit the random numbers to be between 0 and 3
		int randomnumber = ran.nextInt(3 - 0 + 1);

		// 4. If the random number is 0
		if (randomnumber == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		// -- tell the user "Yes"

		// 5. If the random number is 1
		if (randomnumber == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}
		// -- tell the user "No"

		// 6. If the random number is 2
		if (randomnumber == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask google?");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 7. If the random number is 3
		if (randomnumber == 3) {
			JOptionPane.showMessageDialog(null, "Ask your mum?");
		}
		// -- write your own answer
	}
}

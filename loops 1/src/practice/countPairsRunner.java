package practice;

import javax.swing.JOptionPane;

public class countPairsRunner {

	public static void main(String args[]) {
		
		JOptionPane.showMessageDialog(null, "enter a word to find the pairs");
		String word = JOptionPane.showInputDialog("enter word:");
		countPairs number = new countPairs(word);
		
		number.findpairs();
	}
}

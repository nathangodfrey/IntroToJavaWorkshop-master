import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String days = JOptionPane.showInputDialog("what is your birthday?");
		if (days.equals("July 2")) {
			JOptionPane.showMessageDialog(null, "happy birthday");

		} else {
			JOptionPane.showMessageDialog(null, "happy unbirthday");
		}
	}
}

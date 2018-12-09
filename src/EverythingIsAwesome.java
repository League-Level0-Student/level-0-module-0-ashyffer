import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "what do you like");
		JOptionPane.showMessageDialog(null, name + ", me too, that's awesome");

	}
}

import javax.swing.JOptionPane;

class New {
	 public static void main(String[] args) {
		 
		 String first_name;
		 first_name = JOptionPane.showInputDialog("First Name", "Enter your name");
		 
		 String middle_name = JOptionPane.showInputDialog("Middle Name", "Enter your middle name");
		 
		 String family_name;
		 family_name = JOptionPane.showInputDialog("Surname", "Enrer your family name");
		 
		 String full_name;
		 full_name = "You are " + first_name + " " + middle_name + " " + family_name;
		 
		 JOptionPane.showMessageDialog(null, full_name, "Name", JOptionPane.WARNING_MESSAGE);
		 System.exit(0);
	 }
} 
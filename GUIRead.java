import javax.swing.*;

class GUIRead 
{
	public static void main(String[] args) 
	{
		String name,sage;
		int age=0;

		name = JOptionPane.showInputDialog("Enter ur name:");
		sage = JOptionPane.showInputDialog("Enter ur Age:");

		age=Integer.parseInt(sage);


		JOptionPane.showMessageDialog(null,"Heyy "+name+" ur age is "+ (age+1));


	}
}

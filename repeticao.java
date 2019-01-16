package repete3;

import javax.swing.JOptionPane;

public class repeticao {
	
	public void repetir() {
		
		
		for(int num = 0; num <= 10; num++) {
			JOptionPane.showMessageDialog(null, "aguarde "+num);
			System.out.println("aguarde "+num);
		}
	}
	
}

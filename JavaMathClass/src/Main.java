import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		//calcoliamo l'ipotenusa di un triangolo dall'input dell'utente
		JOptionPane.showMessageDialog(null, "Calcoliamo l'ipotenusa di un triangolo", null, 1);
		double a = Float.parseFloat(JOptionPane.showInputDialog("Inserisci il primo cateto"));
		double b= Float.parseFloat(JOptionPane.showInputDialog("Inserisci il secondo cateto"));
		//usiamo Math.sqrt che sarebbe la radice quadrata di a^2 + b^2
		double ipotenusa= Math.sqrt((a*a)+(b*b));
	}

}

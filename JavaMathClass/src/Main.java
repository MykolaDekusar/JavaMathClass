import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		//calcoliamo l'ipotenusa di un triangolo dall'input dell'utente
		JOptionPane.showMessageDialog(null, "Calcoliamo l'ipotenusa di un triangolo");
		double a = Float.parseFloat(JOptionPane.showInputDialog("Inserisci il primo cateto"));
		double b= Float.parseFloat(JOptionPane.showInputDialog("Inserisci il secondo cateto"));
		//usiamo Math.sqrt che sarebbe la radice quadrata di a^2 + b^2
		double ipotenusa= Math.sqrt((a*a)+(b*b));
		System.out.println(ipotenusa);
		JOptionPane.showMessageDialog(null, "L'potenusa è: "+ipotenusa);
		//proviamo ad usare Math.max per prendere il valore piu alto tra 2 numeri
		double max = Math.max(a, b);
		System.out.println(max);
		//proviamo ad usare Math.min per prendere il valore piu basso tra 2 numeri
		double min = Math.min(a, b);
		System.out.println(min);
		//Math.round porta un numero decimale al valore intero piu vicino tipo 3.2 diventa 3
		//3.6 diventa 4
		//Math.floor porta un numero decimale sempre al valore intero piu basso es: 3.9 diventa 3
		//Math.ceil invece porta un numero decimale sempre al valore intero piu alto es: 3.1 diventa 4
		
	}

}

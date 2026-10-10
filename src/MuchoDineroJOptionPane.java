import javax.swing.JOptionPane;

public class MuchoDineroJOptionPane {
    public static void main(String[] args) {
        double balance = 20000.00;
        double amount;

        do {
            String input = JOptionPane.showInputDialog(
                    "Enter amount (positive = deposit, negative = withdrawal, 0 = stop):");
            amount = Double.parseDouble(input);

            if (amount == 0) {
                break;
            }

            if (amount < 0 && balance + amount < 0) {
                JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
            } else {
                balance += amount;
            }
            JOptionPane.showMessageDialog(null,
                    "Outstanding balance: P" + String.format("%.2f", balance));
        } while (amount != 0);
    }
}

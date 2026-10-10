import javax.swing.JOptionPane;

public class HighestLowestJOptionPane {
    public static void main(String[] args) {
        double highest = 0, lowest = 0;

        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog("Enter number " + i + ":");
            double num = Double.parseDouble(input);

            if (i == 1) {
                highest = num;
                lowest = num;
            } else {
                if (num > highest) highest = num;
                if (num < lowest) lowest = num;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Highest number: " + highest + "\nLowest number: " + lowest);
    }
}


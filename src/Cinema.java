import java.util.Arrays;                                      // Import ang Arrays class para magamit ang deepToString()

public class Cinema {
    public static void main(String[] args){

        String[][] seats = {                                  // idineklara at ini-initializa ang 2D String array na seats
                {"Alice", "Bob", "Charli"},                   // Row 1 (index 0): Alice, Bob, Charlie
                {"David", "Emma", "Frank"}                    // Row 2 (index 1): David, Emma, Frank
        };
        System.out.println(seats[1][2]);                      // i-print and row 2, column 3 (index [1][2]) = Frank

        seats [0][1] = "vacant";                              // Palitan and "Bob" (row 1, column 2) ng "Vacant"

        System.out.println(Arrays.deepToString(seats));        // i-prin and boung 2D array sa isang Linya
    }
}

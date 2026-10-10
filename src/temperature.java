public class temperature {
    public static void main(String[] args) {

        double[] temperatures = new double[5];                                     // gumawa ng 1D double array na may eksaktong 5 slots

        temperatures[0] = 32.5;                                                   // Index 0 (Day 1): 32.5
        temperatures[1] = 34.0;                                                   // Index 1 (Day 2): 34.o
        temperatures[2] = 31.8;                                                   // Index 2 (Day 3): 31.8
        temperatures[3] = 33.2;                                                   // Index 3 (Day 4): 33.2
        temperatures[4] = 35.1;                                                   // Index 4 (Day 5): 35.1

        for (int i = 0; i < temperatures.length; i++) {                           // For loop: i ay mula 0 hanggang umabot sa length na lima
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);        // i-print and bawat temperatra (i + 1 para sa araw 1-5}
        }
        temperatures[2] = 32.0;                                                   // i-update ang araw 3(index2) mula 31,8 patungo sa 32.0

        System.out.println("Updated Day 3: " + temperatures[2]);                  // i-print ang bagong temperatura ng araw 3
    }
}

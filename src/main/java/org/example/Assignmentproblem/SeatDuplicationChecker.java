package org.example.Assignmentproblem;


public class SeatDuplicationChecker {

    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;

        System.out.println("Duplicate Seat Numbers:");

        for (int i = 0; i < seatNumbers.length; i++) {
            boolean alreadyPrinted = false;

            // Check if this number appeared earlier
            for (int k = 0; k < i; k++) {
                if (seatNumbers[i] == seatNumbers[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Compare with all subsequent seat numbers
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: "
                            + seatNumbers[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        int[] seats1 = {101, 102, 103, 102, 105};
        int[] seats2 = {101, 102, 103, 104, 105};

        checkDuplicateSeats(seats1);
        System.out.println();

        checkDuplicateSeats(seats2);
    }
}


package org.example.Assignmentproblem;


import java.util.Scanner;

public class InventoryCSVParser {

    static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",", -1);

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println(
                    "Product: " + fields[0].trim()
                            + " | SKU: " + fields[1].trim()
                            + " | Qty: " + fields[2].trim()
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CSV record: ");
        String csvLine = sc.nextLine();

        parseInventoryRecord(csvLine);

        sc.close();
    }
}

package ec.edu.espe.urbanizationtreasury.view;

import ec.edu.espe.urbanizationtreasury.model.Resident;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author WebMasterTeam, DCCO-ESPE
 */
public class UrbanizationTreasurySystem {

    public static void main(String[] args) {

        int option; //For options menu
        boolean exit = false; //Exit menu
        int residentNumber = 0; //position in the array
        int numberToEnter = 0;
        int contadorMounths = 0;

        ArrayList<Resident> residents = new ArrayList();

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println(" ---- National Polytechnic School Urbanization ---- ");
        System.out.println("              ---- Treasury System ---- ");
        System.out.println("====================================================");

        while (!exit) {

            System.out.println("================================");
            System.out.println("#####Residents and Payments#####");
            System.out.println("1. Enter Resident");
            System.out.println("2. Aliquot");
            System.out.println("3. Access Card");
            System.out.println("4. Access Control");
            System.out.println("5. Extraordinary");
            System.out.println("6. Archive the residents");
            System.out.println("7. Read File");
            System.out.println("8. Exit");
            System.out.println("=================================");
            try {
                System.out.print("Enter an option: ");
                option = sc.nextInt();

                switch (option) {
                    case 1 -> {
                        enterResident(residents, residentNumber); //Enter Residents
                        residentNumber++;
                    }
                    case 2 -> {

                        if (residentNumber != 0) {
                            System.out.println("----------------------------------------");
                            int returnMenu = 2;
                            do {
                                System.out.println("================================");
                                System.out.println("1. Pay");
                                System.out.println("2. History");
                                System.out.println("3. Print bill");
                                System.out.println("4. Exit");
                                System.out.println("================================");
                                try {

                                    System.out.print("Enter an option: ");
                                    option = sc.nextInt();

                                    switch (option) {
                                        case 1 -> {
                                            System.out.println("====================================================");
                                            numberToEnter = 1;
                                            contadorMounths = casePayments(residentNumber, residents, numberToEnter, contadorMounths);
                                            System.out.println("====================================================");
                                        }
                                        case 2 -> {
                                            System.out.println("====================================================");
                                            numberToEnter = 1;
                                            caseHistory(residentNumber, residents, numberToEnter);
                                            System.out.println("====================================================");
                                        }
                                        case 3 -> {
                                            System.out.println("====================================================");
                                            numberToEnter = 1;
                                            casePrintBill(residentNumber, residents, numberToEnter);
                                            System.out.println("====================================================");
                                        }
                                        case 4 -> {
                                            System.out.println("====================================================");
                                            System.out.println("Do you want go out? Yes(1) No(0)");
                                            returnMenu = sc.nextInt();
                                            System.out.println("====================================================");

                                        }
                                        default ->
                                            System.out.println("!Option invalid! ");
                                    }

                                } catch (InputMismatchException e) {
                                    System.out.println("!Opcion invalid!");
                                    sc.next();
                                }
                            } while (returnMenu != 1);
                            System.out.println("----------------------------------------");
                        } else {
                            System.out.println("|||No residents registered|||");
                        }

                    }

                    case 3 -> {
                        if (residentNumber != 0) {
                            System.out.println("----------------------------------------");
                            int returnMenu = 2;
                            do {
                                System.out.println("1. Pay");
                                System.out.println("2. History");
                                System.out.println("3. Print bill");
                                System.out.println("4. Exit");
                                try {

                                    System.out.print("Enter an option: ");
                                    option = sc.nextInt();

                                    switch (option) {
                                        case 1 -> {
                                            System.out.println("====================================================");
                                            numberToEnter = 2;
                                            contadorMounths = casePayments(residentNumber, residents, numberToEnter, contadorMounths);
                                            System.out.println("====================================================");
                                        }
                                        case 2 -> {
                                            System.out.println("====================================================");
                                            numberToEnter = 2;
                                            caseHistory(residentNumber, residents, numberToEnter);
                                            System.out.println("====================================================");
                                        }
                                        case 3 -> {
                                            System.out.println("====================================================");
                                            numberToEnter = 2;
                                            casePrintBill(residentNumber, residents, numberToEnter);
                                            System.out.println("====================================================");
                                        }
                                        case 4 -> {
                                            System.out.println("====================================================");
                                            System.out.println("Do you want go out? Yes(1) No(0)");
                                            returnMenu = sc.nextInt();
                                            System.out.println("====================================================");

                                        }
                                        default ->
                                            System.out.println("Option invalid ");
                                    }

                                } catch (InputMismatchException e) {
                                    System.out.println("Opcion invalid");
                                    sc.next();
                                }
                            } while (returnMenu != 1);
                            System.out.println("----------------------------------------");
                        } else {
                            System.out.println("|||No residents registered|||");
                        }
                    }
                    case 4 -> {

                        if (residentNumber != 0) {
                            System.out.println("----------------------------------------");
                            int returnMenu = 2;
                            do {
                                System.out.println("1. Pay");
                                System.out.println("2. History");
                                System.out.println("3. Print bill");
                                System.out.println("4. Exit");
                                try {

                                    System.out.print("Enter an option: ");
                                    option = sc.nextInt();

                                    switch (option) {
                                        case 1 -> {
                                            System.out.println("====================================================");
                                            numberToEnter = 3;
                                            contadorMounths = casePayments(residentNumber, residents, numberToEnter, contadorMounths);
                                            System.out.println("====================================================");
                                        }
                                        case 2 -> {
                                            numberToEnter = 3;
                                            caseHistory(residentNumber, residents, numberToEnter);
                                        }
                                        case 3 -> {
                                            System.out.println("====================================================");
                                            numberToEnter = 3;
                                            casePrintBill(residentNumber, residents, numberToEnter);
                                            System.out.println("====================================================");
                                        }
                                        case 4 -> {
                                            System.out.println("====================================================");
                                            System.out.println("Do you want go out? Yes(1) No(0)");
                                            returnMenu = sc.nextInt();
                                            System.out.println("====================================================");

                                        }
                                        default ->
                                            System.out.println("Option invalid ");
                                    }

                                } catch (InputMismatchException e) {
                                    System.out.println("Opcion invalid");
                                    sc.next();
                                }
                            } while (returnMenu != 1);
                            System.out.println("----------------------------------------");
                        } else {
                            System.out.println("|||No residents registered|||");
                        }

                    }
                    case 5 -> {

                        if (residentNumber != 0) {
                            System.out.println("----------------------------------------");
                            int returnMenu = 2;
                            do {
                                System.out.println("1. Pay");
                                System.out.println("2. History");
                                System.out.println("3. Print bill");
                                System.out.println("4. Exit");
                                try {

                                    System.out.print("Enter an option: ");
                                    option = sc.nextInt();

                                    switch (option) {
                                        case 1 -> {
                                            System.out.println("====================================================");
                                            numberToEnter = 4;
                                            contadorMounths = casePayments(residentNumber, residents, numberToEnter, contadorMounths);
                                            System.out.println("====================================================");
                                        }
                                        case 2 -> {
                                            System.out.println("====================================================");
                                            numberToEnter = 4;
                                            caseHistory(residentNumber, residents, numberToEnter);
                                            System.out.println("====================================================");
                                        }
                                        case 3 -> {
                                            System.out.println("====================================================");
                                            numberToEnter = 4;
                                            casePrintBill(residentNumber, residents, numberToEnter);
                                            System.out.println("====================================================");
                                        }
                                        case 4 -> {
                                            System.out.println("====================================================");
                                            System.out.println("Do you want go out? Yes(1) No(0)");
                                            returnMenu = sc.nextInt();
                                            System.out.println("====================================================");

                                        }
                                        default ->
                                            System.out.println("Option invalid ");
                                    }

                                } catch (InputMismatchException e) {
                                    System.out.println("Opcion invalid");
                                    sc.next();
                                }
                            } while (returnMenu != 1);
                            System.out.println("----------------------------------------");
                        } else {
                            System.out.println("|||No residents registered|||");
                        }
                    }
                    case 6 -> {
                        int saveResident;
                        int saveIdFound = 0;
                        if (residentNumber != 0) {

                            System.out.println("What recident do you want include in the file?");
                            System.out.print("Resident DNI: ");
                            saveResident = sc.nextInt();
                            System.out.println("What payment do you want include in the file?");
                            System.out.print("Payment: ");
                            System.out.println("1. Aliquot");
                            System.out.println("2. Access Card");
                            System.out.println("3. Access Control");
                            System.out.println("4. Extrordinary");
                            numberToEnter = sc.nextInt();

                            while (numberToEnter < 1 || numberToEnter > 5) {
                                System.out.println("Invalid option");
                                System.out.println("Re-enter the option");
                            }

                            if (numberToEnter > 0 && numberToEnter < 5) {
                                for (int i = 0; i < residents.size(); i++) {
                                    if (residents.get(i).getDni() == saveResident) {
                                        ArchiveListResidents(residents.get(i), residentNumber);
                                        System.out.println("Resident Registered");
                                        System.out.println("");
                                        saveIdFound++;
                                    }
                                    if (saveIdFound == 0) {
                                        System.out.println("Resident DNI not found");
                                    }
                                }
                            }
                        } else {
                            System.out.println("Resident no registrated");
                        }
                    }
                    case 7 -> {
                        readArchive();
                    }
                    case 8 -> {
                        System.out.println("=================================");
                        System.out.println("== Thanks for using the system ==");
                        System.out.println("=================================");
                        exit = true;
                    }
                    default ->
                        System.out.println("Option invalid ");
                }
            } catch (InputMismatchException e) {
                System.out.println("You need to enter a number");
                sc.next();
            }
        }
    }

    private static void casePrintBill(int residentNumber, ArrayList<Resident> residents, int numberToEnter) {
        int searchId;
        int searchIdFound = 0;
        Scanner sc = new Scanner(System.in);
        if (residentNumber != 0) {
            System.out.println("Enter resident DNI for print bill: ");
            searchId = sc.nextInt();

            for (int i = 0; i < residents.size(); i++) {
                if (residents.get(i).getDni() == searchId) {
                    System.out.println("=========== Resident " + searchId + " ===========");
                    if (numberToEnter == 1) {
                        printBill(residents.get(i), residents.get(i).payments.aliquot, residents.get(i).mounthsOfAliquot);
                    }
                    if (numberToEnter == 2) {
                        printBill(residents.get(i), residents.get(i).payments.accessCard, residents.get(i).mounthsOfAccessCard);
                    }
                    if (numberToEnter == 3) {
                        printBill(residents.get(i), residents.get(i).payments.accessControl, residents.get(i).mounthsOfAccessControl);
                    }
                    if (numberToEnter == 4) {
                        printBill(residents.get(i), residents.get(i).payments.extraordinary, residents.get(i).mounthsOfExtraordinary);
                    }
                    searchIdFound++;
                }
            }
            if (searchIdFound == 0) {
                System.out.println("Resident DNI not found");
            }
        } else {
            System.out.println("Resident no registrated");
        }
    }

    private static void caseHistory(int residentNumber, ArrayList<Resident> residents, int numberToEnter) {
        int searchId;
        int searchIdFound = 0;
        Scanner sc = new Scanner(System.in);
        if (residentNumber != 0) {
            System.out.println("Enter resident DNI for most the history: ");
            searchId = sc.nextInt();

            for (int i = 0; i < residents.size(); i++) {
                if (residents.get(i).getDni() == searchId) {
                    System.out.println("=========== Resident " + searchId + " ===========");
                    if (numberToEnter == 1) {
                        printHistory(residents.get(i).payments.aliquot, residents.get(i).mounthsOfAliquot);
                    }
                    if (numberToEnter == 2) {
                        printHistory(residents.get(i).payments.accessCard, residents.get(i).mounthsOfAccessCard);
                    }
                    if (numberToEnter == 3) {
                        printHistory(residents.get(i).payments.accessControl, residents.get(i).mounthsOfAccessControl);
                    }
                    if (numberToEnter == 4) {
                        printHistory(residents.get(i).payments.extraordinary, residents.get(i).mounthsOfExtraordinary);
                    }
                    searchIdFound++;
                }
            }
            if (searchIdFound == 0) {
                System.out.println("Resident DNI not found");
            }
        } else {
            System.out.println("Resident no registrated");
        }
    }

    private static int casePayments(int residentNumber, ArrayList<Resident> residents, int numberToEnter, int contadorMounths) {
        int searchId;
        int searchIdFound = 0;
        Scanner sc = new Scanner(System.in);
        if (residentNumber != 0) {
            System.out.println("Enter resident id: ");
            searchId = sc.nextInt();

            for (int i = 0; i < residents.size(); i++) {
                if (residents.get(i).getDni() == searchId) {
                    System.out.println("=========== Resident " + searchId + " ===========");
                    if (numberToEnter == 1) {
                        enterPayments(residents.get(i).payments.aliquot, residents.get(i).mounthsOfAliquot);
                    }
                    if (numberToEnter == 2) {
                        enterPayments(residents.get(i).payments.accessCard, residents.get(i).mounthsOfAccessCard);
                    }
                    if (numberToEnter == 3) {
                        enterPayments(residents.get(i).payments.accessControl, residents.get(i).mounthsOfAccessControl);
                    }
                    if (numberToEnter == 4) {
                        enterPayments(residents.get(i).payments.extraordinary, residents.get(i).mounthsOfExtraordinary);
                    }
                    contadorMounths++;
                    searchIdFound++;
                }
            }
            if (searchIdFound == 0) {
                System.out.println("Resident DNI not found");
            }
        } else {
            System.out.println("Resident no registrated");
        }
        return contadorMounths;
    }

    private static void enterResident(ArrayList<Resident> residents, int residentNumber) {

        long reEnterDni;
        Scanner sc = new Scanner(System.in);
        Resident resident = new Resident();
        System.out.print("Resident DNI: ");
        resident.setDni(sc.nextLong());
        String stringDni = String.valueOf(resident.getDni());
        reEnterDni = dniValidation(stringDni);

        reEnterDni = noRepeatRecident(residentNumber, residents, resident, sc, reEnterDni);

        if (reEnterDni == 0) {
            while (reEnterDni == 0) {
                System.out.println("Re-enter the DNI:");
                resident.setDni(sc.nextLong());
                String dniValidate = String.valueOf(resident.getDni());
                reEnterDni = dniValidation(dniValidate);
                reEnterDni = noRepeatRecident(residentNumber, residents, resident, sc, reEnterDni);
            }
        }

        System.out.print("Enter batch number: ");
        resident.setBatchNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter resident name: ");
        resident.setName(sc.nextLine());
        residents.add(resident);
        System.out.println("|||User entered |||");

    }

    private static long noRepeatRecident(int residentNumber, ArrayList<Resident> residents, Resident resident, Scanner sc, long reEnterDni) {
        if (residentNumber >= 1) {
            for (int i = 0; i < residentNumber; i++) {
                while (residents.get(i).getDni() == resident.getDni()) {
                    System.out.println("ERROR!! The resident DNI has already been entered");
                    System.out.print("Re-enter the resident DNI: ");
                    resident.setDni(sc.nextLong());
                    String stringID = String.valueOf(resident.getDni());
                    reEnterDni = dniValidation(stringID);
                    i = 0;
                }
            }
        }
        return reEnterDni;
    }

    private static int dniValidation(String dniValidation) {

        int number = 0, suma = 0, resultado = 0, result = 0;

        for (int i = 0; i < dniValidation.length(); i++) {
            number = Integer.parseInt(String.valueOf(dniValidation.charAt(i)));
            if (i % 2 == 0) {
                number = number * 2;
                if (number > 9) {
                    number = number - 9;
                }
            }
            suma = suma + number;
        }
        if (suma % 10 != 0) {
            resultado = 10 - (suma % 10);
            if (resultado == number) {
                System.out.println("Valid DNI");
            } else if (resultado != number) {
                System.out.println("Invalid DNI");
            }
        } else {
            System.out.println("Valid DNI");
            result = 1;
        }
        return (result);
    }

    private static void enterPayments(ArrayList<Float> payments, ArrayList<String> mountsOfPayments) {

        String mounth;
        float payment;
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("Enter the Mounth: ");
        mounth = sc.next();
        mountsOfPayments.add(mounth);
        System.out.println("Enter the payment: ");
        payment = sc.nextFloat();
        payments.add(payment);
        System.out.println("====================================================");

    }

    private static void printHistory(ArrayList<Float> payments, ArrayList<String> mounthsOfPayments) {

        for (int i = 0; i < mounthsOfPayments.size(); i++) {
            System.out.println("----------------------------------");
            System.out.println("Mounth  \t   | \t " + mounthsOfPayments.get(i));
            System.out.println("Payment  \t   | \t " + payments.get(i));
            System.out.println("----------------------------------");
        }

    }

    public static void printBill(Resident residents, ArrayList<Float> payments, ArrayList<String> mounthsOfPayments) {

        String searchPaymentMounth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Payment Mounth: ");
        searchPaymentMounth = sc.next();
        int foundMounth = mounthsOfPayments.indexOf(searchPaymentMounth);

        if (foundMounth != -1) {
            System.out.println("====================================================");
            System.out.println("| National Polytechnic School Urbanization |");
            System.out.println("| Resident DNI: " + residents.getDni());
            System.out.println("| Name: " + residents.getName());
            System.out.println("| Batch Number: " + residents.getBatchNumber());
            System.out.println("| Mounth of payment: " + mounthsOfPayments.get(foundMounth));
            System.out.println("| Payment: " + payments.get(foundMounth));
            
        } else {
            System.out.println("----------------------------------");
            System.out.println("Mounth not found!!");
            System.out.println("----------------------------------");
        }

    }

    private static void ArchiveListResidents(Resident residents, int residentNumber) {

        File residentFile = new File("ResidentsList.csv");
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(residentFile, true));
            for (int i = 0; i < residentNumber; i++) {

                writer.print(residents.getName() + "," + residents.mounthsOfAliquot + "," + residents.payments.aliquot + ","
                        + residents.mounthsOfAccessCard + "," + residents.payments.accessCard + ","
                        + residents.mounthsOfAccessControl + "," + residents.payments.accessControl + ","
                        + residents.mounthsOfExtraordinary + "," + residents.payments.extraordinary + ",");
                writer.print("");

            }
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void readArchive() {

        File file = new File("ResidentsList.csv");
        String[] fileData;
        try {
            BufferedReader input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            while (line != null) {
                fileData = line.split(";");
                for (String value : fileData) {
                    System.out.print(value + "");
                }
                line = input.readLine();
                System.out.println();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
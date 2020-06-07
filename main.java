/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class main {

    private static Scanner sr = new Scanner(System.in);

    public static void product() {
        System.out.println("===============Product menu===============");
        System.out.println("1.  Load data from file");
        System.out.println("2.  Input and add to the end");
        System.out.println("3.  Display data");
        System.out.println("4.  Save product list to file");
        System.out.println("5.  Search by pcode");
        System.out.println("6.  Delete by pcode");
        System.out.println("7.  Sort by pcode");
        System.out.println("8.  Add after postition k");
        System.out.println("9.  Delete the node after the node having code = xCode");
        System.out.println("10. Comeback main menu");
    }

    public static void customer() {

        System.out.println("===============Customer menu===============");
        System.out.println("1. Load data from file");
        System.out.println("2. Input and add to the end");
        System.out.println("3. Display data");
        System.out.println("4. Save customer list to file");
        System.out.println("5. Search by ccode");
        System.out.println("6. Delete by ccode");
        System.out.println("7. Comeback main menu");
    }

    public static void ordering() {
        System.out.println("===============Ordering menu===============");
        System.out.println("1. Input data");
        System.out.println("2. Display data with total value");
        System.out.println("3. Sort by pcode + ccode");
        System.out.println("4. Comeback main menu");
    }

    public static void main(String[] args) throws FileNotFoundException {
        int choice = 0, choice1, choice2, choice3;
        ProductList prl = new ProductList();
        CustomerList ctl = new CustomerList();
        do {
            System.out.println("\t==================================");
            System.out.println("===============Sale Management System===============");
            System.out.println("1. Product list");
            System.out.println("2. Customer list");
            System.out.println("3. Order list");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sr.nextInt();
            switch (choice) {
                case 1:
                    
                    do {
                        
                        product();
                        System.out.println("Enter your choice: ");
                        choice1 = sr.nextInt();
                        switch (choice1) {
                            case 1:
                                prl.loadFile();
                                break;
                            case 2:
                                prl.AddProduct();
                                break;
                            case 3:
                                prl.display();
                                break;
                            case 4:
                                prl.saveFile();
                                break;
                            case 5:
                                prl.searchByPCode();
                                break;
                            case 6:
                                prl.deleteByPCode();
                                break;
                            case 7:
                                prl.sortByPCode();
                                break;
                            case 8:
                                prl.AfterPosition();
                                break;
                            case 9:
                                prl.deleteProduct();
                                break;
                            case 10:
                                break;
                        }
                    } while (choice1 != 10);
                    break;
                case 2:
                    
                    do {
                        
                        customer();
                        System.out.println("Enter your choice: ");
                        choice2 = sr.nextInt();
                        switch (choice2) {
                            case 1:
                                ctl.loadFile();
                                break;
                            case 2:
                                ctl.addCustomer();
                                break;
                            case 3:
                                ctl.display();
                                break;
                            case 4:
                                ctl.saveToFile();
                                break;
                            case 5:
                                ctl.searchByCCode();
                                break;
                            case 6:
                                ctl.deleteByCCode();
                                break;
                            case 7:
                                break;

                        }
                    } while (choice2 != 7);
                    break;
                case 3:
                    do {
                        ordering();
                        System.out.println("Enter your choice: ");
                        choice3 = sr.nextInt();
                        switch (choice3) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    } while (choice3 != 4);
            }
        } while (choice != 4);
    }
}

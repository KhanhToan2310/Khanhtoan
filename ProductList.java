/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author PHONG VU
 */
public class ProductList {

    FirstLinkedList<Product> products = new FirstLinkedList<>();

    public Product input() {
        Product product = new Product();
        String code;
        do {
            System.out.println("Enter product code:");
            code = CheckInput.checkString();
            if (!CheckInput.checkPCode(products, code)) {
                System.out.println("Product code is exist!");
            }
        } while (!CheckInput.checkPCode(products, code));
        product.setPcode(code);
        System.out.println("Enter product name:");
        product.setPro_name(CheckInput.checkString());
        System.out.println("Enter quantity of product:");
        product.setQuantity(CheckInput.checkPositive());
        System.out.println("Enter saled of product:");
        product.setSaled(CheckInput.checkPositive());
        System.out.println("Enter price of product:");
        product.setPrice(CheckInput.checkDouble());
        System.out.println("Enter value of product:");
        product.setValue(CheckInput.checkDouble());
        return product;
    }

    public void AddProduct() {
        Product pr = input();
        products.addFirst(pr);
    }

    public void deleteByPCode() {
        System.out.println("Enter product code want to delete:");
        String code = CheckInput.checkString();
        for (Product prd : products) {
            if (code.equalsIgnoreCase(prd.getPcode())) {
                products.deleteNode(prd);
                System.out.println("Successfull!");
                return;
            }
        }
        System.out.println("Don't have this product!S");
    }

    public void display() {
        System.out.println(" ");
        System.out.printf("%10s|%11s|%11s|%11s|%12s|%10s", "code", "Pro_name", "Quantity", "Saled",
                "Price", "Value");
        System.out.println("");
        System.out.println("-------------------------------------------------------------");
        for (Product prd : products) {
            System.out.println(prd.toString());
        }
    }

    public void sortByPCode() {
        products.sort();
    }

    public void searchByPCode() {
        System.out.print("Enter product code want to search: ");
        String pcode = CheckInput.checkString();
        for (Product prd : products) {
            if (pcode.equalsIgnoreCase(prd.getPcode())) {
                System.out.println(prd.toString());
                return;
            }
        }
        System.out.println("Don't have this customer!");
    }

    public void AfterPosition() {
        int value;
        System.out.print("Enter position want to add: ");
        value = CheckInput.checkPositive();
        products.insertAfterPosition(input(), value);
    }
    
   public void deleteProduct() {
        String pcode;
        System.out.print("Enter train code: ");
        pcode = CheckInput.checkString();
        for (Product prd : products) {
            if (pcode.equalsIgnoreCase(prd.getPcode())) {
                products.deleteBefore(prd);
            }
        }
    }
    
    public void saveFile() throws FileNotFoundException {
        try {
            FileOutputStream out = new FileOutputStream("product.dat");
            ObjectOutputStream output = new ObjectOutputStream(out);
            output.writeObject(products);
            output.close();
        } catch (Exception e) {
            System.out.println("Error!");
        }
        PrintWriter pwr = new PrintWriter(new FileOutputStream("product.txt"));
        for (Product pd : products) {
            String temp = pd.toString();
            pwr.write(temp);
        }
        pwr.close();
    }

    public void loadFile() {
        String file = "product.dat";
        try {
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream inputStream = new ObjectInputStream(in);
            products = (FirstLinkedList) inputStream.readObject();
        } catch (IOException e) {
            System.out.println("Error!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Not have this file");
        }
    }

}

package _myfirstproject;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author std09
 */
import java.util.Scanner;   //Ενσωμάτωση κλάσης Scanner

//Εικόνα 2.7 Deitel, Σελίδα 45 Addition.java
//Προγραμμα πρόσθεσης δυο αριθμών

public class Addition                     //αρχή κλάσης Addition
{
    
    public static void main (String[] args) //αρχή μεθόδου main που εκτελέι την Java εφαρμογή
    {
        //δημιουργία Scanner για μεταγενεστερη χρηση εισόδου αριθμών
        Scanner input = new Scanner(System.in);
        
        int number1;    //Ορισμός μεταβλητής Πρώτου Ακεραίου
        int number2;    //Ορισμός μεταβλητής Δευτέρου Ακεραίου
        int sum;        //Ορισμός μεταβλητής Αρθροίσματος
        
        
        System.out.print("Εισάγετε τον πρώτο ακέραιο αριθμό : ");
        
        number1 = input.nextInt();  //εισαγωγή πρώτου ακεραίου
        
        System.out.print("Εισάγετε τον δευτερο ακέραιο αριθμό : ");
        
        number2 = input.nextInt();  //εισαγωγή δεύτερου ακεραίου
               
        // sum = number1 + number2;    //πρόσθεση των δύο ακεραίων αριθμών
        
        System.out.printf("Tο άρθροισμα είναι %d%n", (number1 + number2));   
        
    }                                       //τελος μαθόδου main
    
}                                           //τέλος κλάσης Addition

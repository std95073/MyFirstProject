package _myfirstproject;

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

//Εικόνα 2.15 Deitel, Σελίδα 55 Comparison.java
//Προγραμμα σύγκρισης δυο αριθμών Comparison

public class Comparison                     //αρχή κλάσης Comparison
{
    
    public static void main (String[] args) //αρχή μεθόδου main που εκτελέι την Java εφαρμογή
    {
        //δημιουργία Scanner για μεταγενεστερη χρηση εισόδου αριθμών
        Scanner input = new Scanner(System.in);
        
        int number1;    //Ορισμός μεταβλητής Πρώτου Ακεραίου
        int number2;    //Ορισμός μεταβλητής Δευτέρου Ακεραίου
        
        
        System.out.print("Εισάγετε τον πρώτο ακέραιο αριθμό : ");
        
        number1 = input.nextInt();  //εισαγωγή πρώτου ακεραίου
        
        System.out.print("Εισάγετε τον δευτερο ακέραιο αριθμό : ");
        
        number2 = input.nextInt();  //εισαγωγή δεύτερου ακεραίου
               
        if (number1 == number2)
            System.out.printf("O %d είναι ισος με τον %d%n", number1 , number2);   
        if (number1 != number2)
            System.out.printf("O %d είναι διάφορος του %d%n", number1 , number2);   
        if (number1 < number2)
            System.out.printf("O %d είναι μικρότερος του %d%n", number1 , number2);   
        if (number1 > number2)
            System.out.printf("O %d είναι μεγαλύτερος του %d%n", number1 , number2);   
        if (number1 >= number2)
            System.out.printf("O %d είναι μεγαλύτερος ή ίσος του %d%n", number1 , number2);   
        if (number1 <= number2)
            System.out.printf("O %d είναι μικρότερος ή ίσος του %d%n", number1 , number2);   
                                                
        
    }                                       //τελος μαθόδου main
    
}                                           //τέλος κλάσης Comparison

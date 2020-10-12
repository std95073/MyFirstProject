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
//Προγραμμα πολλαπλασιασμού τριών ακεραίων αριθμών BMICalculator 

public class BMICalculator                     //αρχή κλάσης BMICalculator 
{
    
    public static void main (String[] args) //αρχή μεθόδου main που εκτελέι την Java εφαρμογή
    {
        //δημιουργία Scanner για μεταγενεστερη χρηση εισόδου αριθμών
        Scanner input = new Scanner(System.in);
        
        int weight;     // βασος σε λιβρες
        int height;     // υψος σε ιντσες
        int bmi;        // Δείκτης μαζας σωματος

        // obtain weight in pounds and height in inches       
        System.out.println("Καλως ηλθατε στην εφαρμογή υπολογισμού δείκτης μαζας σώματος (BMI)");       
        System.out.print("Εισάγετε το βάρος σας σε κιλα: ");       
        weight = input.nextInt();       
        System.out.print("Εισάγετε το ύψος σε μετρα: ");       
        height = input.nextInt(); 

        // υπολογισμός BMI       
        bmi = weight / (height * height); 

        // display results       
        System.out.printf("Ο δείκτης μαζας σώματος σας (BMI) είναι : %d%n%n", bmi);       
        if(bmi < 18.5)
            System.out.println("Βάση του δεικτη μαζας σώματος σας είστε Underweight (Κάτω του 18.5)");      
        if(bmi >= 19 && bmi < 25)
            System.out.println("Βάση του δεικτη μαζας σώματος σας είστε Normal (Μεταξύ 18.5 και 24.9)");       
        if(bmi>=25 && bmi<30)
            System.out.println("Βάση του δεικτη μαζας σώματος σας είστε Overweight (Μεταξύ 25 και 29.9)");
        if(bmi>=30)
            System.out.println("Βάση του δεικτη μαζας σώματος σας είστε Obese (Ανω του 30)");
    }                                       //τελος μαθόδου main
    
}                                           //τέλος κλάσης BMICalculator 

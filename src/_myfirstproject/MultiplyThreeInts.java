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
//Προγραμμα πολλαπλασιασμού τριών ακεραίων αριθμών MultiplyThreeInts

public class MultiplyThreeInts                     //αρχή κλάσης MultiplyThreeInts
{
    
    public static void main (String[] args) //αρχή μεθόδου main που εκτελέι την Java εφαρμογή
    {
        //δημιουργία Scanner για μεταγενεστερη χρηση εισόδου αριθμών
        Scanner input = new Scanner(System.in);
        
        int number1;    //Ορισμός μεταβλητής Πρώτου Ακεραίου
        int number2;    //Ορισμός μεταβλητής Δευτέρου Ακεραίου
        int number3;    //Ορισμός μεταβλητής Τρίτου Ακεραίου        
        int sum;        //Ορισμός μεταβλητής Αρθροίσματος
        
        
        System.out.print("Εισάγετε τον πρώτο ακέραιο αριθμό : ");
        
        number1 = input.nextInt();  //εισαγωγή πρώτου ακεραίου
        
        System.out.print("Εισάγετε τον δευτερο ακέραιο αριθμό : ");
        
        number2 = input.nextInt();  //εισαγωγή δεύτερου ακεραίου

        System.out.print("Εισάγετε τον τρίτο ακέραιο αριθμό : ");
        
        number3 = input.nextInt();  //εισαγωγή τρίτου ακεραίου        
        
        sum = number1 * number2 * number3;
   
            System.out.printf("Το γινόμενο των ακεραίων %d, %d, %d είναι %d%n", number1 , number2,  number3, sum);   
                                                
        
    }                                       //τελος μαθόδου main
    
}                                           //τέλος κλάσης MultiplyThreeInts

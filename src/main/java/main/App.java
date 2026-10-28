/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import model.Calculation;
import model.InvalidBeratException;
import model.InvalidTinggiException;
/**
 *
 * @author finde
 */
public class App {

    public static void main(String[] args) {
        
        try{
        Calculation cal1 = new Calculation(180,75);
        
        
        System.out.println("Skor BMI : " + cal1.calculateBmi());
        System.out.println(cal1.indikator(cal1.calculateBmi()));
        }
        catch (InvalidTinggiException e){
            e.getMessage();
        }
        catch (InvalidBeratException e){
            e.getMessage();
        }
        
        
    }
}

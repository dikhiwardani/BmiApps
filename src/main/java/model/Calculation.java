/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author finde
 */
public class Calculation {
    private float beratB;
    private float tinggiB;
    

    public Calculation(float tinggiB, float beratB) throws InvalidTinggiException, InvalidBeratException{
        
        if ( tinggiB < 100 || tinggiB >= 1000){
            throw new InvalidTinggiException ("Tinggi harus diantara 100-999");
        }
        
        if ( beratB <= 0 || beratB >= 1000){
            throw new InvalidBeratException ("Berat harus diantara 0-999");
        }
        
        this.beratB = beratB;
        this.tinggiB = tinggiB / 100;
    }
    
    public float calculateBmi (){
        
        float bmi = beratB / (tinggiB*tinggiB);
        return bmi;
    }
    
    public String indikator (float hasil){
        String ind = null;
        if (hasil < 18.5){
            ind = "Underweight";
        }else if (hasil >= 18.5 && hasil < 23){
            ind = "Normal";
        }else if (hasil >= 23 && hasil < 25){
            ind = "Overweight";
        }else if (hasil >= 25 && hasil <30){
            ind = "Obesity 1";
        }else if (hasil >= 30 ){
            ind = "Obesity 2";
        }
        return ind;
    }
   
}

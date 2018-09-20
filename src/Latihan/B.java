/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Rudi Erwanto
 */
public class B extends A {
    private int B;
    public void setB (int nilai){
        B = nilai;
    }
    public int getB(){
        return B;
    }
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai B : " +getB());
    }
}

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
public class Person {
    private String Name;
    private int Age;
    
    public Person (String Name, int Age){
          this.Name = Name;
          this.Age = Age;
    }
    
    public void info(){
        System.out.println("Name : " +Name);
        System.out.println("Age  : " +Age);
    }
}

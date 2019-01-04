/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum10.Percobaan;

/**
 *
 * @author CQ42
 */
public class Person {
    protected String name;
    protected String address;
    
    //Default constructor
    public Person(){
        System.out.println("Inside Person:Constructor");
    name = "";
    address = "";
    }
    
    //Constructor dengan dua parameter
    public Person(String vname, String vaddress){
        this.name = vname;
        this.address = vaddress;
    }
    
    //Method accessor
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setName(String vname){
        this.name = vname;
    }
    
    public void setAddress(String vaddress){
        this.address = vaddress;
    }
}

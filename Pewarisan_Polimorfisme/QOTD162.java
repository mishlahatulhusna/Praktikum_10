/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum10.Pewarisan_Polimorfisme;

/**
 *
 * @author CQ42
 */
class QOTD162 {
    public int x = 5;
}

class Child extends QOTD162{
    public int x = 10;
    
    public void info(int x){
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

class AksesNilai{
    public static void main(String arg[]){
        Child c = new Child();
        c.info(15);
    }
}

/* 
    1. Jika pada baris ke 26 menggunakan modifier public, maka akan error.
        namun jika menggunakan modifier default, maka tidak akan error
    2. Output :
        15
        10
        5
*/
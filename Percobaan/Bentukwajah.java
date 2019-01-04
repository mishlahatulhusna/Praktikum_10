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
public class Bentukwajah {
    /*Membuat sebuah method respons pada class induk dimana mengembalikan
    sebuah nilai string
    */
    public String respons(){
        return("Perhatikan reaksi wajah saya\n");
    }
}

/* Membuat class-class lain dengan turunan dari class Bentukwajah
*/

class Senyum extends Bentukwajah{
    public String respons(){
        return("Senyum karena senang\n");
    }
}

class Tertawa extends Bentukwajah{
    public String respons(){
        return("Tertawa karena gembira\n");
    }
}

class Marah extends Bentukwajah{
    public String respons(){
        return("Kemarahan disebabkan bertengkar\n");
    }
}

class Sedih extends Bentukwajah{
    public String respons(){
        return("Sedih disebabkan cemburu\n");
    }
}

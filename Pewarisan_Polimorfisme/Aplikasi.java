package Praktikum10.Pewarisan_Polimorfisme;

class Induk{
    Induk(){}
    protected void Metode1(){
        System.out.println("Induk : Metode 1");
    }
}

class Anak extends Induk{
    Anak(){}
    public void Metode1(){
        System.out.println("Anak : Metode 1");
    }
}
public class Aplikasi {
    
    public static void main(String[] args) {
        Induk o = new Anak(); // karena class Induk adalah parent si Anak
        o.Metode1();
    }
}

/*
    1. Outputnya : Anak : Metode 1
        karena yang dipanggil adalah class Anak pada baris 19
*/
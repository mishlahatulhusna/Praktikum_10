package Praktikum10.Pewarisan_Polimorfisme;


class QOTD161 {
    int xxx;
    void yyy(){xxx=1;}
    
}

class Bbb extends QOTD161{
    final QOTD161 finalref = new QOTD161();
    
    final void yyy(){
        System.out.println("method yyy");
        finalref.xxx = 12345;
    }
}

/*
    1. Modifier final pada baris ke 4 dihilangkan agar tidak error
    2. Modifier final tidak bisa dipakai untuk class induk
*/
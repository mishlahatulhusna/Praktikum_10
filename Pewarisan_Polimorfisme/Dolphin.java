package Praktikum10.Pewarisan_Polimorfisme;

class Animal{}
class Mammal extends Animal{}
class Cat extends Animal{}
public class Dolphin extends Mammal {
    
    public static void main(String[] args) {
        Mammal m = (Mammal) new Animal();
        Animal a = m;
        Dolphin d = (Dolphin) a;
    }
    
}

/*
    1. Pada baris ke 9 error karena Mammal adalah subclassnya Animal, bukan Cat
    2. Cat bukan induk dari Mammal
    3. Harus dicasting jika ingin dibenarkan
*/
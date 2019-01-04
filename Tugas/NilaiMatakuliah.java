package Praktikum10.Tugas;

public class NilaiMatakuliah extends Matakuliah {
    Double bobot_uts;
    Double bobot_uas;
    Double bobot_lain2;
    Double nilai_uts;
    Double nilai_uas;
    Double nilai_lain2;
    Double nilai_akhir;
    String Grade;
    
    public double hitungNilai(){
        
        return nilai_akhir;
    }
    
    public void hitungGrade(){
        if(nilai_akhir<=100 || nilai_akhir>=80){
            System.out.println("Grade A");
        }else if(nilai_akhir<=79 || nilai_akhir>=55){
            System.out.println("Grade B");
        }else if(nilai_akhir<=54 || nilai_akhir>=50){
            System.out.println("Grade C");
        }else if(nilai_akhir<=49 || nilai_akhir>=45){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade E");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DortIslem dortislem=new DortIslem();   //bununla tanittim ve asagida esitlige verip yazdirdim  esitlige vermeden yazaman.
        int sonuc=dortislem.Topla(2,3);
        System.out.println(sonuc);




        int sonuc2=dortislem.Carp(8,8);
        System.out.println(sonuc2);



        int sonuc3=dortislem.Bol(8,4);
        System.out.println(sonuc3);     //yan dortislemler tarafindan boyle yazdirin.
    }



}
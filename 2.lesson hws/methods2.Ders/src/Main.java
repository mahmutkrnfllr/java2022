public class Main {
    public static void main(String[] args) {
        String mesaj="bugun hava cok guzel";
        String yeniMesaj=mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi=topla(5,7);
        System.out.println(sayi);
        int toplam=topla2(2,3,6,5,4,8,7,9,8,7,5);
        System.out.println(toplam);

    }
    public static void ekle(){       //bunlara void operasyon denir. bunlar veri tabninda ekler siler gunceller datayi
        System.out.println("eklendi");

    }
    public static void sil(){
        System.out.println("silindi");
    }

    public static void guncelle() {                      //bu voidler birseyi yap dersen kullanilir.
        System.out.println("guncellendi");
    }
       public static int topla(int sayi,int sayi2){     //bu fonksiyon integer degerinde bir deger dondururmus.
        return sayi+sayi2;

       }
       public static int topla2(int... sayilar){  //bu 3 tane nokta integer arrayi gibi istedigimiz kadar fazla sayi kullanacayik demektir.
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;

        }
        return toplam;

       }


       public static String sehirVer(){
        return "ankara";
       }
}
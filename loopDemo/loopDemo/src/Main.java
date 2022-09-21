public class Main {
    public static void main(String[] args) {
         for(int i=0;i<19;i+=2){
             System.out.println(i);
         }

        System.out.println("for dongu bitti");  //bunu dongu parantezi disina yaziyoruz cunku islem bitince yazsin diye tekrar etmesin diye.



         //while ogreniyoruz assagida

        int i=1;   //yukarida i tanimlandi fakat sadece for dongusu icinde oldugu icin orada dongu bitince gitti o.

        while(i<10){;
            System.out.println(i);
            i++;  //bunu system outun uzerine yazsaydik ilk once islemi yapip basacakdi sayiyi hep o yuzden sayi 2 ile baslaycakti.

        }
        System.out.println("while dongusu bitti");



        //Do-While dongusu ogreniyoruz assagida


        /*yukaridaki while ile benzer bunun farki, while da sart saglanmazsa dongu hic calismaz ama do while da once system out
        oldugu icin once o sayi bir kere yazilir daha sonra sayinin oraya uymadigi anlasilinca baska donguye girmez
        ama 1 kere de olsa dongu icine almaya calisir ve yazar */

        //gercek hayatta bir iste loglama kontrolu icin de kullanilir do while calisir mi kontrolu yapmak icin.


        int k=100;
        do{
            System.out.println(k);
            k++;
        }while(k<10);
        System.out.println("Do-While dongusu bitti");

    }
}
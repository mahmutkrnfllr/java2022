public class Main {
    public static void main(String[] args) {
        String ogrenci1="mahmut";
        String ogrenci2="mehmet";
        String ogrenci3="ahmet";

        //bunlarin hepsini yazdirmak tek tek cok zor olacagi icin arrayler kullanilir.

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
//boyle tek tek yazmak zorunda kalin.


        System.out.println("----------------");


        //array yapacaginda neyin arrayini yapacaksan mesela stringinsa string[] integersa int[]
        String[] ogrenciler=new String[4];   //bu 4 yazan yani string icinde toplam 4 tane sey tanimlaycam demektir.

        ogrenciler[0]="mahmut";
        ogrenciler[1]="mehmet";
        ogrenciler[2]="ahmet";
        ogrenciler[3]="hasan";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        for(String isim:ogrenciler){     //o isim yazdigim yere isdedigin seyi yazabilirdin onun anlami ogrenciler icinde olan sey ben da isim yazdim.
            System.out.println(isim);

        }

        System.out.println("---------------------------");




String[] arkadaslar=new String[3];
        arkadaslar[0]="hasan";
        arkadaslar[1]="ahmet";
        arkadaslar[2]="mehmet";

       for(int y=0;y<arkadaslar.length;y++){
           System.out.println(arkadaslar[y]);

       }
        System.out.println("-----------------");


       for(String isim:arkadaslar){
           System.out.println(isim);
       }

    }
}
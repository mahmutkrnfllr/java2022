public class Main {
    public static void main(String[] args) {
        String mesaj="bugun hava cok guzel.";
        System.out.println(mesaj);

        /*

        System.out.println(mesaj.length()); //kac tane harf var onu gosterir bize.

        System.out.println(mesaj.charAt(6));//burada 6. harf hangisi onu ogrendik. eger bosluk varsa o da harf sayilir.

        System.out.println(mesaj.concat("yasasin.!")); //mesaj stringinin sonuna bunu yazdigimiz yerde sadece bu ekledigin seyi ekler.

        System.out.println(mesaj.startsWith("b")); //burada da mesaj stringi b ile mi baslar diye sorduk dogru veya yanlis yazar bize.kucuk buyuk harf duyarlidir ama.

        System.out.println(mesaj.endsWith(".")); //burda da bununla mi biter diye sorduk.

        System.out.println(mesaj.indexOf("a"));  //burada a kacinci karakterdir onu ogrendik. ilk buldugu harfi verir.en bastan aramaya baslar.

        System.out.println(mesaj.lastIndexOf("a")); //aramaya cumle sonundan baslar.en sondan baslar derken sondaki a yi bulur. ama normal olarak soldan okumaya baslar.

        */

        //ust tarafi hep yoruma aliyorum istediginde ac ve kullan.

        System.out.println(mesaj.replace(" ", "-")); //ilk olarak  neyi degistirmek istersen onu yazacan sonra eklemek istedigin seyi ve hepsine ekler.

        /*stringlerin neredeyse tamami yukarida yaptiklarimiz da degisken gibi o metni kalici olarak degismez sadece o kullanildigi
    anda degisir o ve daha sonra yazarsan onu eskisi gibi yazilmaya devam eder eger kalici degismek istersen onu bir degiskene atayarak yazacan. */

        String yeniMesaj = mesaj.replace("a", "A"); //bunun gibi bunu kalici olarak degistik burada.
        System.out.println(yeniMesaj);


        System.out.println(mesaj.substring(2)); //bu substring da bildigin gibi cikarmak metinde yazdigin sayidan itibaren cikarir ve tekrar yazar sana devamini.

        System.out.println(mesaj.substring(2,8)); //boyle yazarsan da 2 den 8e kadar kesip verir bize.

        for(String kelime:mesaj.split(" ")){   //bu da kelimeleri ayrir hangisi seyi yazarsan biz dedik ki bosluklarda ayir ve bosluklarda ayirarak alt alta yazdi bize.
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //butun harfleri kucultur bu.

        System.out.println(mesaj.toUpperCase());//bu da butun harfleri buyuk yazar.

        String cumle="     cok bolsuk var     ";
        System.out.println(cumle.trim());  //trim ile de bir cumlenin basinda sonunda cok bosluk varsa onlari kaldirir.





    }
}
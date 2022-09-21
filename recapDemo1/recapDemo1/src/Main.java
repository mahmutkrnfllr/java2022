public class Main {
    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=25;
        int sayi3=2;

        int buyuk=sayi1;

        if(sayi1<sayi2){
            buyuk=sayi2;
        }
        if(sayi2<sayi3){
            buyuk=sayi3;
        }
        System.out.println("en buyuk:"+ buyuk);

    }
}
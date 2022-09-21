public class Main {
    public static void main(String[] args) {
       //if else oldugunda ikisinden biri calismak zorunda olur
        int sayi=25;
        if(sayi<20){
            System.out.println("sayi 20 den kucuktur");
        }else if(sayi==20){
            System.out.println("sayi 20 ye esittir");
        }else{
            System.out.println("20 den buyuktur");
        }
       //bu yaptigimiza defansive programming denir cunku olabilecek tum sartlara bir cevabi var.
    }
}

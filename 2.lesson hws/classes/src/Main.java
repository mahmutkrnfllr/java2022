public class Main {
    public static void main(String[] args) {
        //classlar referans tiptir
        CustomerManager customerManager=new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();

    }
   //her zaman esitlikde soldaki deger sagdakine esitlenir ve yukaridan asagiya okunur dil unutma.
    //arraylerde oyle degil ama tam cunku eger array olani digerine esitlersan tekrar donguye girmesine gerek kalmadan
    // direk digerinin sirasina girer ve onun aldigi degerleri almaya baslar
//deger tipi atadiginda stackde olur hepsi heapda olmaz ama arraylerde heapde olur.o yuzden degeri hemen alir.
}
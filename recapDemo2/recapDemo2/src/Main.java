public class Main {
    public static void main(String[] args) {

       //            double[] mylist=new double[4];     //bunu boyle da yazabilin.

        double[] mylist={1.2,1.3,1.4,8.2};//boyle da yazabilin bu daha kolay.

        double total=0;
        double enBuyuk=mylist[0];
        for(double number:mylist){
            if(enBuyuk<number){
                enBuyuk=number;
            }
            total=total+number;
            System.out.println(number);

        }
        System.out.println("--");
        System.out.println("toplam:"+total);
        System.out.println("en buyuk sayi:"+enBuyuk);
    }
}
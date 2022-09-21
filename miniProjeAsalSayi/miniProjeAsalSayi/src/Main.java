public class Main {
    public static void main(String[] args) {
        int number=1;
        int kalan=number % 2;
        //System.out.println(kalan);
        boolean asalMi=true;
        if(number<2){
            System.out.println("sayi gecersiz");
            return;
        }

        for(int i=2;i<number;i++){
            if(number%i==0){
                asalMi=false;

            }
        }
        if(asalMi){
            System.out.println("sayi asaldir");
        }else{
            System.out.println("sayi asal degildir");
        }
    }
}
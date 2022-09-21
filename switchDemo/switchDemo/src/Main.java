public class Main {
    public static void main(String[] args) {
        //ctr+shift+alt+l tuslarina basarak kelimeler yanlis yere yazildiysa yerlerini duzeltir otomatik.
        char not = 'F';

        switch (not) {
            case 'A':
                System.out.println("mukemmel: gectiniz");
                break;
            case 'B':
                System.out.println("cok guzel:gectiniz");
                break;
            case 'C':
                System.out.println("iyi:gectiniz");
                break;
            case 'D':
                System.out.println("fena degil:gectiniz");
                break;
            case 'F':
                System.out.println("maalesef kaldiniz");
                break;
            default:
                System.out.println("gecersiz harf girdiniz");


        }

    }
}
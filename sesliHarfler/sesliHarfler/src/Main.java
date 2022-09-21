public class Main {
    public static void main(String[] args) {
        char harf = 'K';
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("kalin sesli");
                break;
            default:
                System.out.println("ince sesli harf");
        }
    }
}
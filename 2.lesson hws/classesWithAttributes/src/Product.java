public class Product {    /*classlar 4 islem barindirir bir onceki ornek gibi ve bu ornekteki gibi de attribute
    yani ozellik de barindirir. */



    public Product(int id,String name,String description,double price,int stock){ //boyle yazarsaan sadece bunlari yazarsan kullanabilin demektir
        System.out.println("yapici blok calisti");
        this.id=id;                                 //kodu yukariya yazmadik cunku setten cikardik.
        this.name=name;
        this.description=description;
        this.price=price;
        this.stock=stock;
        this.kod=kod;
    }



    //attribute veya dield deller bunlara.
    private int id;
    private String name;     //getter vve setter almak icin name in uzerine sag click /reflactor/encapsulate filters/
    private String description;
    private double price;
    private int stock;

    private String kod;


    //product classi burdaki gibi olmali yani sadece attribute tutmali
    //public void vs icermemeli ayni anda ekranda.

    //simdi yukariyi private yaptik diye get ve set ekleyceyik okuyup myazabilmek icin altta.
    public int getId() { //bu get icindir .Getter
        return id;
    }

    public void setId(int id) {   //Setter
        this.id = id;
          /*buradaki this icinde bulundugum classdaki demektir. yani this.id deki id yuykardaki productin id si
        esittirden sonraki da parantez icindeki int yanindaki id. */
        //isdersan this. da yapabilin isdertsan yukaridaki degerlere basina _ da koyabilin klarismasin diye

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }

}





public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"laptop","asus laptop",5000,3);
        product.setName("laptop");
        product.setId(1);
        product.setDescription("asus laptop");
        product.setPrice(5000);
        product.setStock(3);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        //System.out.println(product.name);

        System.out.println(product.getKod());
    }
}


//encapsulation kullaniciyi bir alani kullanmak icin kisitlar.
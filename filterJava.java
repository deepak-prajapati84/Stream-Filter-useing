import java.util.ArrayList;
import java.util.List;

/**
 * InnerfilterJava
 */
class Product{
    int id;
    String name;
    float price;

    public Product(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}

public class filterJava{
    public static void main(String[] args){
        List<Product> product=new ArrayList<Product>();

        product.add(new Product(1, "oppo Mobile", 20000));
        product.add(new Product(2, "relme Mobile", 20000));
        product.add(new Product(3, "infinix Mobile", 17000));
        product.add(new Product(4, "apple Mobile", 90000));

        
        product.stream().filter(p->p.price>15000) // this is a filtering price
                        .map(pm->pm.price) //this is a fectching price
                        .forEach(System.out::println); // this is a iteratoing price

    }
}
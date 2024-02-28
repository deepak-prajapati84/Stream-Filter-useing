import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Prodect{
    int id;
    String name;
    float value;

    public Prodect(int ID,String Name,float Value){
        this.id=ID;
        this.name=Name;
        this.value=Value;
    }
}

public class allelements{
    public static void main(String args[]){
        List<Prodect>list=new ArrayList<>();
        list.add(new Prodect(1, "Anjali", 20));
        list.add(new Prodect(2, "Sonali", 20));
        list.add(new Prodect(3, "Geeta", 20));
        list.add(new Prodect(4, "Sonam", 20));

        list.stream()
            .map(p->p.id+" Name is : "+ p.name + " Ages : "+p.value)
            .forEach(System.out::println);
    }
}






// class Product {
//     int id;
//     String name;
//     float price;

//     public Product(int id, String name, float price) {
//         this.id = id;
//         this.name = name;
//         this.price = price;
//     }
// }

// public class allelements{
//     public static void main(String[] args) {
//         List<Product> products = new ArrayList<>();
//         products.add(new Product(2, "Rajan", 20));
//         products.add(new Product(3, "Abhishek", 30));
//         products.add(new Product(4, "Vikas", 40));
//         products.add(new Product(5, "Suraj", 50));

//         products.stream()
//                 .map(p -> p.id + " " + p.name + " " + p.price)
//                 .forEach(System.out::println);
//     }
// }
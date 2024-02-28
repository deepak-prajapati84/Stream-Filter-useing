import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class Prodect{
    int id;
    String name;
    float price;

    public Prodect(int ID,String Name,float Price){
        this.id=ID;
        this.name=Name;
        this.price=Price;
    }
}

public class filter2{
    // class Prodect{
    //     int id;
    //     String name;
    //     float price;

    //     public Prodect(int ID,String Name,float Price){
    //         this.id=ID;
    //         this.name=Name;
    //         this.price=Price;
    //     }
    // }   
    public static void main(String args[]){
        List<Prodect> prodect=new ArrayList<Prodect>();
        prodect.add(new Prodect(1, "Deepak", 20));
        prodect.add(new Prodect(2, "Anjali", 20));
        prodect.add(new Prodect(3, "Suraj", 23));

        List<Float>pricelist=prodect.stream()
                                    .filter(pv->pv.price>12)
                                    .map(pm->pm.price)
                                    .collect(Collectors.toList());
                                
                        System.out.println(pricelist);

    }
}
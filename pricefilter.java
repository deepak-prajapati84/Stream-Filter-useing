import java.util.ArrayList;
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


public class pricefilter{
    public static void main(String[] args){
        List<Prodect> prodect=new ArrayList<Prodect>();
        prodect.add(new Prodect(2, "Rajan", 20));
        prodect.add(new Prodect(3, "Abhishek", 20));
        prodect.add(new Prodect(4, "Vikas", 20));
        prodect.add(new Prodect(5, "Suraj", 20));

        List<Integer> idlist=prodect.stream()
                            .map(pid->pid.id)
                            .collect(Collectors.toList());

                    System.out.println(idlist);
    }
}
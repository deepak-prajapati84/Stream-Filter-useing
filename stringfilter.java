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


public class stringfilter{
    public static void main(String[] args)   {
        List<Prodect> prodect=new ArrayList<Prodect>();

        prodect.add(new Prodect(1, "Deepak", 20));
        prodect.add(new Prodect(2, "Pankaj", 22));
        prodect.add(new Prodect(3, "Suraj", 24));

        List<String> strname=prodect.stream()
                                    .map(pn->pn.name)
                                    .collect(Collectors.toList());
                                    
                    System.out.println(strname);
    }                   
}
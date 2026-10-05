import java.util.ArrayList;

class Laptop {

    String brand;
    int price;
    float weight;

    Laptop(String b, int p,float w){
        brand=b;
        price=p;
        weight=w;

    }

    @Override
    public String toString() {
        return brand+" "+price+" "+weight;
    }
}

public class LaptopImpl{
    public static void main(String[] args){
        Laptop l1=new Laptop("Lenovo",50000,1.8f);
        Laptop l2=new Laptop("Dell",55000,1.9f);
        Laptop l3=new Laptop("Hp",65000,1.6f);

        ArrayList<Laptop> al =new ArrayList<Laptop>();
        al.add(l1);
        al.add(l2);
        al.add(l3);

        for(Laptop ele:al){
            System.out.println(ele);
        }
        System.out.println("Before Sorting by brand: "+al);
        al.sort((ele1,ele2)->ele1.brand.compareTo(ele2.brand));
        System.out.println("After Sorting by brand: "+al);
        for(Laptop ele:al){
            System.out.println(ele);
        }
        System.out.println("Before Sorting by price: "+al);
        al.sort((ele1,ele2)->Integer.compare(ele1.price, ele2.price));
        System.out.println("After Sorting by price: "+al);
        for(Laptop ele:al){
            System.out.println(ele);
        }

        System.out.println("Before Sorting by weight: "+al);
        al.sort((ele1,ele2)->Float.compare(ele1.weight, ele2.weight));
        System.out.println("After Sorting by weight: "+al);
        for(Laptop ele:al){
            System.out.println(ele);
        }
    }

}



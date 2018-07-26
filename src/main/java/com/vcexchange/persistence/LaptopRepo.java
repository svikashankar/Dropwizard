package com.vcexchange.persistence;

import com.vcexchange.entity.Laptop;

import java.util.ArrayList;
import java.util.List;

public class LaptopRepo implements ILaptopRepo {
    //private  static List<Laptop> laptop=new ArrayList();

    private List<Laptop> laptop = setLaptops();
    public List<Laptop> getAll() {
        return laptop;
    }
    public List<Laptop> setLaptops() {
       List<Laptop> lap=new ArrayList();
        //laptop=new ArrayList();=new ArrayList();//Reset and gives the list from first
        lap.add(new Laptop("1", "Vikas"));
        lap.add(new Laptop("2", "akash"));
        lap.add(new Laptop("3", "abhi"));
        lap.add(new Laptop("4", "Thejus"));
        lap.add(new Laptop("5", "The Kien"));
        return lap;
    }

    public String removeLaptop(String customerid){
//objecttype variable:
//       Enhanced loop
        for(Laptop laptops: laptop){
            if(laptops.getCustomerid().equals(customerid))
                laptop.remove(laptops);
            return  "succeed";
        }
        return "failure";
    }
}

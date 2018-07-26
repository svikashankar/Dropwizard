package com.vcexchange.service;

import com.vcexchange.entity.Laptop;

import java.util.List;

public interface ILaptopService  {
    List<Laptop> getAll();
    String removeLaptop(String customerid);


    void addLaptop(Laptop laptop);
}

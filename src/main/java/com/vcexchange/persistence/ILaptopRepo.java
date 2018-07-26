package com.vcexchange.persistence;

import com.vcexchange.entity.Laptop;

import java.util.List;

public interface ILaptopRepo {
    List<Laptop>  getAll();

    String removeLaptop(String customerid);

    void addLaptop(Laptop laptop);
}

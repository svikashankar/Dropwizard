
package com.vcexchange.service;

import com.vcexchange.entity.Laptop;
import com.vcexchange.persistence.ILaptopRepo;

import java.util.List;

public class LaptopService implements ILaptopService {
    private ILaptopRepo laptopRepo;


    public LaptopService(ILaptopRepo laptopRepo) {
        this.laptopRepo= laptopRepo;
    }
    @Override
    public List<Laptop> getAll() {
        return laptopRepo.getAll();
    }
        @Override
        public String removeLaptop(String customerid){
            return laptopRepo.removeLaptop(customerid);
        }

        public void addLaptop(Laptop laptop){
        laptopRepo.addLaptop(laptop);
        }

    }


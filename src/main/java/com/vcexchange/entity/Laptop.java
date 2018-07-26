package com.vcexchange.entity;

import lombok.Getter;
import lombok.Setter;

    @Getter
    @Setter
    public class Laptop {

        private String customerid;
        private String name;

        public Laptop() {
        }

        public Laptop(String customerid, String name) {
            this.customerid = customerid;
            this.name = name;
        }

        public String getCustomerid() {
            return customerid;
        }

        public void setCustomerid(String customerid) {
            this.customerid = customerid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        //        //getter of ISBN
//        public String getIsbn() {
//            return isbn;
//        }

    }


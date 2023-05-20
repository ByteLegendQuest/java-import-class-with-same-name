package com.bytelegend;

import com.bytelegend.pet1.Cat;
import com.bytelegend.pet2.Cat;

public class Home {
    Cat cat1;
    Cat cat2;
    public static void main(String[] args) {
        Home h = new Home();
        h.cat1 = new com.bytelegend.pet1.Cat();
        h.cat2 = new com.bytelegend.pet2.Cat();
    }
}

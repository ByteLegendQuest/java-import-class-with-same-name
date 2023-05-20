package com.bytelegend;

import com.bytelegend.pet1.Cat;
import com.bytelegend.pet2.Cat;

public class Home {
    Cat cat1;
    Cat cat2;
    public void hasTwoKindsOfCat() {
        Home home = new Home();
        home.cat1 = new com.bytelegend.pet1.Cat();
        home.cat2 = new com.bytelegend.pet2.Cat();
    }
}

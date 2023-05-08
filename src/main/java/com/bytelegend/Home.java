package com.bytelegend;


public class Home {
    com.bytelegend.pet1.Cat cat1;
    com.bytelegend.pet2.Cat cat2;

    public Home() {
        // 分别创建两个不同的 Cat 对象
        cat1 = new com.bytelegend.pet1.Cat();
        cat2 = new com.bytelegend.pet2.Cat();
    }
}
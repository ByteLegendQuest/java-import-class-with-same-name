package com.bytelegend;

public class Home {
    com.bytelegend.pet1.Cat cat1;
    com.bytelegend.pet2.Cat cat2;
    
    public static void main(String[] args) {
        Home home = new Home();
        home.cat1 = new com.bytelegend.pet1.Cat();
        home.cat2 = new com.bytelegend.pet2.Cat();
        
        // Verwende cat1 und cat2 wie gewünscht
    }
}
package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Caveman human2 = new Caveman();
        ModernHuman human3 = new ModernHuman();

        human1.eat();
        human2.eat();
        human3.eat();
        human3.type();

        Human humanContainer1 = human1;
        Human humanContainer2 = (Human)human2;
        Human humanContainer3 = (Human)human3;

        humanContainer1.eat();
        humanContainer2.eat();
        humanContainer3.eat();
       // humanContainer3.type();

        Caveman cavemanContainer = (Caveman)human1;

        cavemanContainer.swingClub();


    }
}
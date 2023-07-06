package com.sefaerkan.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser = new User("Sefa","Musician");

        //Encapsulation => bir kere yazdıktan sonra değişmesin => getter setter devreye girer.
        Musician james= new Musician("James","Guitar",50);

        //Inheritance
        SuperMusician lars = new SuperMusician("Lars","Drums",54);
        lars.sing();

        //Polymorphism
        //Static Polymorphism
        Math math = new Math();
        math.sum();
        math.sum(5,4);
        math.sum(3,4,5);

        //Dynamic Polymorphism
        Animal animal = new Animal();
        animal.sing();

        Dog dog = new Dog();
        dog.test();
        dog.sing();

        //Abstract
        //People people = new People(); olmaz
        User my = new User("Sefa","Musician");
        my.information(); //Soyut sınıfa bu şekil ulaştık


        //Interface
        Piano piano = new Piano();
        piano.brand= "Yamaha";
        piano.digital=true;
        piano.info();

    }
}
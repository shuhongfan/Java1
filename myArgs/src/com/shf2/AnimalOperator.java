package com.shf2;

public class AnimalOperator {
    public void useAnimal(Animal a){
        a.eat();
    }
    public Animal getAnimal(){
        Animal a=new Cat();
        return a;
    }
}

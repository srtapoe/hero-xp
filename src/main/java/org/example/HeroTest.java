package org.example;

public class HeroTest {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Guerreiro", 560, "Guerreiro");
        Hero hero2 = new Hero("Merlin", 1200, "mago");
        Hero hero3 = new Hero("Monge", 100, "Monge");
        Hero hero4 = new Hero("Ninja", 19, "ninja");

        hero1.atacar();
        hero2.atacar();
        hero3.atacar();
        hero4.atacar();
    }
}

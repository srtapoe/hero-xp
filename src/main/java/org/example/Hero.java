package org.example;

public class Hero {
    
    private String name;
    private int age;
    private String type;

    public Hero(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void atacar(){
        if(type.equalsIgnoreCase("Mago")){
            System.out.println("Mago atacou usando magia.");
        } else if (type.equalsIgnoreCase("Guerreiro")) {
            System.out.println("Guerreiro atacou usando espada.");
        }else if (type.equalsIgnoreCase("Monge")) {
            System.out.println("Monge atacou usando artes marciais.");
        } else if (type.equalsIgnoreCase("Ninja")) {
            System.out.println("Ninja atacou usando shuriken.");
        }
    }
}

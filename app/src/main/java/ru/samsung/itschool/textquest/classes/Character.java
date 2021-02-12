package ru.samsung.itschool.textquest.classes;

public class Character {
    private String name;
    private int health;
    private int energy;
    private int hungry;
    private int score;

    public Character(){
        this.health = 0;
        this.energy = 0;
        this.hungry = 0;
        this.score = 0;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHungry() {
        return hungry;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}

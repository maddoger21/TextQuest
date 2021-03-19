package ru.samsung.itschool.textquest.classes;

public class Character {
    private static Character character;
    private static int health = 0;
    private static int energy = 0;
    private static int hungry = 0;

    private Character() {

    }

    public static Character getCharacter(){
        if (character == null){
            character = new Character();
        }

        return character;
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

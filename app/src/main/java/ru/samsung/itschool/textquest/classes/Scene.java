package ru.samsung.itschool.textquest.classes;

public class Scene {
    public Scene[] direction;
    public String text;
    private int dEnergy;
    private int dHealth;
    private int dHungry;
    private int dScore;
    private int variants;

    public Scene(String text, int variants, int dHealth, int dEnergy, int dHungry, int dScore) {
        this.text = text;
        this.variants = variants;
        this.dHealth = dHealth;
        this.dEnergy = dEnergy;
        this.dHungry = dHungry;
        this.dScore = dScore;
        direction = new Scene[variants];
    }

    public String getText() {
        return this.text;
    }

    public int getdEnergy() {
        return this.dEnergy;
    }

    public int getdHealth() {
        return this.dHealth;
    }

    public int getdHungry() {
        return this.dHungry;
    }

    public int getVariants() {
        return variants;
    }

    public int getdScore() {
        return this.dScore;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setVariants(int variants) {
        this.variants = variants;
    }

    public void setdEnergy(int dEnergy) {
        this.dEnergy = dEnergy;
    }

    public void setdHealth(int dHealth) {
        this.dHealth = dHealth;
    }

    public void setdHungry(int dHungry) {
        this.dHungry = dHungry;
    }

    public void setdScore(int dScore) {
        this.dScore = dScore;
    }

}

package ru.samsung.itschool.textquest.classes;

public class SituationEnd implements ISituation {
    public static int sceneDirection1 = 1;
    public static int sceneDirection2 = 1;
    public static int sceneDirection3 = 1;
    public static int health = 0;
    public static int energy = 0;
    public static int hungry = 0;
    public static String text = "Контент автором еще не доработан, поэтому вы просто умерли";
    public static String b1 = "Начать";
    public static String b2 = "игру";
    public static String b3 = "заново";
    @Override
    public String getText() {
        return text;
    }

    @Override
    public int getSceneDirection1() {
        return sceneDirection1;
    }

    @Override
    public int getSceneDirection2() {
        return sceneDirection2;
    }

    @Override
    public int getSceneDirection3() {
        return sceneDirection3;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getHungry() {
        return hungry;
    }

    @Override
    public String getButton1() {
        return b1;
    }

    @Override
    public String getButton2() {
        return b2;
    }

    @Override
    public String getButton3() {
        return b3;
    }
}

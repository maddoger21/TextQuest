package ru.samsung.itschool.textquest.classes;

public class Situation2 implements ISituation{
    public static int sceneDirection1 = 5;
    public static int sceneDirection2 = 6;
    public static int sceneDirection3 = 7;
    public static int sceneNum = 2;
    public static int health = 100;
    public static int energy = 90;
    public static int hungry = 90;
    public static String text = "Вы осмотрели обломки, но так ничего и не нашли. ";
    public static String b1 = "Вернуться";
    public static String b2 = "В лес";
    public static String b3 = "В Пещеру";

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

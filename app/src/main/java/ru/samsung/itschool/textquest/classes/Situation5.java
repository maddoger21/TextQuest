package ru.samsung.itschool.textquest.classes;

public class Situation5 implements ISituation{
    public static int sceneDirection1 = 6;
    public static int sceneDirection2 = 7;
    public static int sceneDirection3 = 8;
    public static int health = 100;
    public static int energy = 40;
    public static int hungry = 40;
    public static String text = "К утру прилив пригнал ваш корабль близко к берегу.";
    public static String b1 = "Вплавь добирается до него";
    public static String b2 = "Все же решили сначала обойти остров";
    public static String b3 = "Лежать на земле и рыдать";

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

package ru.samsung.itschool.textquest.classes;

public class Situation2 implements ISituation{
    public static int sceneDirection1 = 5;
    public static int sceneDirection2 = 5;
    public static int sceneDirection3 = 5;
    public static int health = 100;
    public static int energy = 100;
    public static int hungry = 100;
    public static String text = "Вы провели весь день, осмотривая обломки, но так ничего и не нашли. В итоге, с чувством скорби и безнадежности вы засыпаете на берегу";
    public static String b1 = "Спать";
    public static String b2 = "Спать";
    public static String b3 = "Спать";

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

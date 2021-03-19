package ru.samsung.itschool.textquest.classes;

public class Situation1 implements ISituation {
    public static int sceneDirection1 = 2;
    public static int sceneDirection2 = 3;
    public static int sceneDirection3 = 4;
    public static int health = 100;
    public static int energy = 100;
    public static int hungry = 100;
    public static String text = "Желая быстрее разбогатеть, вы в 1659 году принимает участие в нелегальном торговом рейсе в Африку за чёрными невольниками. Однако корабль попадает в шторм и садится на мель у неизвестного острова недалеко от устья Ориноко.";
    public static String b1 = "К обломкам";
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

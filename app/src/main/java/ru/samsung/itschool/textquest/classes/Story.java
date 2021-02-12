package ru.samsung.itschool.textquest.classes;

import ru.samsung.itschool.textquest.classes.Scene;

public class Story {
    private Scene[] scene = new Scene[5];
    public Scene currentScene;

    public Story(){
        scene[0] = new Scene("Где-то на берегу неизвестного острова лежит без сознания человек. Погодите, " +
                "похоже он просыпается. В его голове начинают всплывать вопросы: Что произошло? Где он? Как он тут очутился?" +
                " Известно только то, что этот человек - вы.",0, 0, 0, 0, 1);
        currentScene = scene[0];
        scene[1] = new Scene("Но все же в начале он хочет вспомнить свое имя.", 0, 50, 50, 50, 1);

        scene[2] = new Scene("В голове вспомнилось только это имя, но что теперь делать? Посмотрев вокруг, вы увидели обломки, так же неподалеку есть лес, а рядом с ним пещеру.", 3, 0, 0, 0, 1 );
        scene[2].direction[0] = new Scene("Осмотреть обломки", 0, 0, -15, 15, 1);
        scene[2].direction[1] = new Scene("Пойти в лес", 0, -5, -10, 15, 1);
        scene[2].direction[2] = new Scene("Исследовать пещеру", 0, -10, -5, 15, 1);

        scene[3]  = new Scene("С трудом вы находите еду и возвращаетесь на берег острова", 0, 0, 0, 0, 1);

        scene[4] = new Scene("Спасибо за просмотр ALPHA версии приложения, на данный момент контент закончился, ждите обновления", 0, 0, 0, 0, 1);


    }

    public void go(int num){
        currentScene=scene[num];
    }
//    public void go (int num, int subNum){
//        currentScene=scene[num].direction[subNum];
//    }
}

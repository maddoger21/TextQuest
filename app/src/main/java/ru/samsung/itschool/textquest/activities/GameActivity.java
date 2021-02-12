package ru.samsung.itschool.textquest.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ru.samsung.itschool.textquest.R;
import ru.samsung.itschool.textquest.classes.Character;
import ru.samsung.itschool.textquest.classes.Story;

public class GameActivity extends AppCompatActivity {

    private int sceneNum = 0;
    private TextView textGame;
    private TextView textName;
    private TextView textHealth;
    private TextView textEnergy;
    private TextView textHungry;
    private TextView direction1;
    private TextView direction2;
    private TextView direction3;
    private Story story;
    private Character player;
    private String name;
    private EditText textEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_game);

        textGame = findViewById(R.id.tv_game);
        textEnter = findViewById(R.id.et_enter_text);
        textName = findViewById(R.id.tv_name);
        textHealth = findViewById(R.id.tv_health);
        textEnergy = findViewById(R.id.tv_energy);
        textHungry = findViewById(R.id.tv_hungry);
        direction1 = findViewById(R.id.tv_direction1);
        direction2 = findViewById(R.id.tv_direction2);
        direction3 = findViewById(R.id.tv_direction3);

        story = new Story();
        player = new Character();
        //отображаем текст нулевой сцены
        textGame.setText(story.currentScene.getText());
        //делаем EditText для имени невидимиым
        textEnter.setVisibility(View.INVISIBLE);
        //заносим в БД пустое имя персонажа
        player.setName("");

    }
    //Если есть варианты ответа
    public void nextText(View view) {
        int id = view.getId();
        switch (id){
            //Если есть варианты ответа
            //direction1
            case R.id.tv_direction1:
                player.setHealth(player.getHealth()+story.currentScene.direction[0].getdHealth());
                player.setEnergy(player.getEnergy()+story.currentScene.direction[0].getdEnergy());
                player.setHungry(player.getHungry()+story.currentScene.direction[0].getdHungry());
                sceneNum++;
                story.go(sceneNum);
                textGame.setText(story.currentScene.getText());
                break;
            //direction2
            case R.id.tv_direction2:
                player.setHealth(player.getHealth()+story.currentScene.direction[1].getdHealth());
                player.setEnergy(player.getEnergy()+story.currentScene.direction[1].getdEnergy());
                player.setHungry(player.getHungry()+story.currentScene.direction[1].getdHungry());
                sceneNum++;
                story.go(sceneNum);
                textGame.setText(story.currentScene.getText());
                break;
            //direction3
            case R.id.tv_direction3:
                player.setHealth(player.getHealth()+story.currentScene.direction[2].getdHealth());
                player.setEnergy(player.getEnergy()+story.currentScene.direction[2].getdEnergy());
                player.setHungry(player.getHungry()+story.currentScene.direction[2].getdHungry());
                sceneNum++;
                story.go(sceneNum);
                textGame.setText(story.currentScene.getText());
                break;
            //нету вариантов выбора
            default:
                if (sceneNum == 1 && textEnter.length() == 0){
                    textEnter.setVisibility(View.VISIBLE);
                    Toast.makeText(this,"Введите имя!",Toast.LENGTH_SHORT).show();
                }
                //выполняется всегда кроме 1 сцены с вводом имени или когда есть варианты ответа
                else {
                    player.setHealth(player.getHealth()+story.currentScene.getdHealth());
                    player.setEnergy(player.getEnergy()+story.currentScene.getdEnergy());
                    player.setHungry(player.getHungry()+story.currentScene.getdHungry());

                    textEnter.setVisibility(View.INVISIBLE);

                    sceneNum++;
                    story.go(sceneNum);
                    textGame.setText(story.currentScene.getText());
                }
        }

        //Добавление имени в базу данных
        player.setName(textEnter.getText().toString());
        //Отображение вариантов ответа
        if (story.currentScene.getVariants() == 3){
            direction1.setText(story.currentScene.direction[0].getText());
            direction1.setBackgroundResource(R.color.background_color);
            direction2.setText(story.currentScene.direction[1].getText());
            direction2.setBackgroundResource(R.color.background_color);
            direction3.setText(story.currentScene.direction[2].getText());
            direction3.setBackgroundResource(R.color.background_color);
        }
        else if (story.currentScene.getVariants() == 2){
            direction1.setText(story.currentScene.direction[0].getText());
            direction1.setBackgroundResource(R.color.background_color);
            direction2.setText(story.currentScene.direction[1].getText());
            direction2.setBackgroundResource(R.color.background_color);
        }
        else if (story.currentScene.getVariants() == 1){
            direction1.setText(story.currentScene.direction[0].getText());
            direction1.setBackgroundResource(R.color.background_color);
        }
        else {
            direction1.setText("");
            direction1.setBackgroundResource(0);
            direction2.setText("");
            direction2.setBackgroundResource(0);
            direction3.setText("");
            direction3.setBackgroundResource(0);
        }

        //обновление параметров персонажа
        textName.setText("Имя: " + player.getName());
        textHealth.setText("Здоровье: " + player.getHealth());
        textEnergy.setText("Энергия: " + player.getEnergy());
        textHungry.setText("Голод: " + player.getHungry());
    }
}
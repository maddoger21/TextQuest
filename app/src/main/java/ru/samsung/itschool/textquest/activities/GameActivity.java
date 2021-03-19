package ru.samsung.itschool.textquest.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ru.samsung.itschool.textquest.R;
import ru.samsung.itschool.textquest.classes.Character;
import ru.samsung.itschool.textquest.classes.ISituation;
import ru.samsung.itschool.textquest.classes.ISituationFactory;
import ru.samsung.itschool.textquest.classes.Sit1Factory;
import ru.samsung.itschool.textquest.classes.Sit2Factory;
import ru.samsung.itschool.textquest.classes.SitEndFactory;

public class GameActivity extends AppCompatActivity {
    private int sceneDirection1,sceneDirection2,sceneDirection3;
    private int sceneNum = 1;
    private TextView textGame;
    private TextView textHealth;
    private TextView textEnergy;
    private TextView textHungry;
    private TextView direction1;
    private TextView direction2;
    private TextView direction3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        textGame = findViewById(R.id.tv_game);
        textHealth = findViewById(R.id.tv_health);
        textEnergy = findViewById(R.id.tv_energy);
        textHungry = findViewById(R.id.tv_hungry);
        direction1 = findViewById(R.id.tv_direction1);
        direction2 = findViewById(R.id.tv_direction2);
        direction3 = findViewById(R.id.tv_direction3);

        update();

        direction1.setOnClickListener(listener);
        direction2.setOnClickListener(listener);
        direction3.setOnClickListener(listener);
    }
    //обработка кнопок

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.tv_direction1:
                    sceneNum = sceneDirection1;
                    update();
                    break;
                case R.id.tv_direction2:
                    sceneNum = sceneDirection2;
                    update();
                    break;
                case R.id.tv_direction3:
                    sceneNum = sceneDirection3;
                    update();
                    break;
            }
        }
    };


    static ISituationFactory createSituationByNum(int SceneNum) {
        switch (SceneNum){
            case 1: return new Sit1Factory();
            case 2: return new Sit2Factory();
//            case 3: return new Sit3Factory();
//            case 4: return new Sit4Factory();
//            case 5: return new Sit5Factory();
//            case 6: return new Sit6Factory();
//            case 7: return new Sit7Factory();
            default: return new SitEndFactory();
        }

    }

    public void update(){
        ISituationFactory situationFactory = createSituationByNum(sceneNum);
        ISituation scene = situationFactory.Create();

        sceneDirection1 = scene.getSceneDirection1();
        sceneDirection2 = scene.getSceneDirection2();
        sceneDirection3 = scene.getSceneDirection3();

        Character.getCharacter().setHungry(scene.getHungry());
        Character.getCharacter().setEnergy(scene.getEnergy());
        Character.getCharacter().setHealth(scene.getHealth());

        textGame.setText(scene.getText());
        textHealth.setText("Здоровье: " + Integer.toString(Character.getCharacter().getHealth()));
        textEnergy.setText("Энергия: " + Integer.toString(Character.getCharacter().getEnergy()));
        textHungry.setText("Голод: " + Integer.toString(Character.getCharacter().getHungry()));
        direction1.setText(scene.getButton1());
        direction2.setText(scene.getButton2());
        direction3.setText(scene.getButton3());
    }
}

package ru.samsung.itschool.textquest.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import ru.samsung.itschool.textquest.R;

public class MainActivity extends AppCompatActivity {
    private Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
    public void beginGame(View view) {
        Context nowScene = MainActivity.this;
        Class nextScene = GameActivity.class;
        Intent changeScene = new Intent(nowScene, nextScene);
        startActivity(changeScene);
    }
}

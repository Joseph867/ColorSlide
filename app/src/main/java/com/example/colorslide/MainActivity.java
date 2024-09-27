package com.example.colorslide;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private SeekBar Slider1;
    private SeekBar Slider2;
    private SeekBar Slider3;
    private TextView RedColor;
    private TextView GreenColor;
    private TextView BlueColor;
    private View Colorview;
    private TextView ColorText;
    private Random Random;
    private Button RandomColor;
    private Button ResetColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
        Slider1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int r = Slider1.getProgress();
                int g = Slider2.getProgress();
                int b = Slider3.getProgress();
                Colorview.setBackgroundColor(Color.rgb(r,g,b));
                RedColor.setText("Red: " + r);
                GreenColor.setText("Green: " + g);
                BlueColor.setText("Blue: " + b);
                ColorText.setText("("+ String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");
                if (r + g < 200) {
                    ColorText.setTextColor(Color.WHITE);
                } else{
                    ColorText.setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                int r = Slider1.getProgress();
                int g = Slider2.getProgress();
                int b = Slider3.getProgress();
                Colorview.setBackgroundColor(Color.rgb(r,g,b));
                RedColor.setText("Red: " + r);
                GreenColor.setText("Green: " + g);
                BlueColor.setText("Blue: " + b);
                ColorText.setText("("+ String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");
                if (r + g < 200) {
                    ColorText.setTextColor(Color.WHITE);
                } else{
                    ColorText.setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int r = Slider1.getProgress();
                int g = Slider2.getProgress();
                int b = Slider3.getProgress();
                Colorview.setBackgroundColor(Color.rgb(r,g,b));
                RedColor.setText("Red: " + r);
                GreenColor.setText("Green: " + g);
                BlueColor.setText("Blue: " + b);
                ColorText.setText("("+ String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");
                if (r + g < 200) {
                    ColorText.setTextColor(Color.WHITE);
                } else{
                    ColorText.setTextColor(Color.BLACK);
                }
            }
        });
        Slider2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int r = Slider1.getProgress();
                int g = Slider2.getProgress();
                int b = Slider3.getProgress();
                Colorview.setBackgroundColor(Color.rgb(r,g,b));
                RedColor.setText("Red: " + r);
                GreenColor.setText("Green: " + g);
                BlueColor.setText("Blue: " + b);
                ColorText.setText("("+ String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");
                if (r + g < 200) {
                    ColorText.setTextColor(Color.WHITE);
                } else{
                    ColorText.setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                int r = Random.nextInt(255);
                int g = Random.nextInt(255);
                int b = Random.nextInt(255);
                Colorview.setBackgroundColor(Color.rgb(r,g,b));
                RedColor.setText("Red: " + r);
                GreenColor.setText("Green: " + g);
                BlueColor.setText("Blue: " + b);
                ColorText.setText("("+ String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");
                if (r + g < 200) {
                    ColorText.setTextColor(Color.WHITE);
                } else{
                    ColorText.setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int r = Slider1.getProgress();
                int g = Slider2.getProgress();
                int b = Slider3.getProgress();
                Colorview.setBackgroundColor(Color.rgb(r,g,b));
                RedColor.setText("Red: " + r);
                GreenColor.setText("Green: " + g);
                BlueColor.setText("Blue: " + b);
                ColorText.setText("("+ String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");
                if (r + g < 200) {
                    ColorText.setTextColor(Color.WHITE);
                } else{
                    ColorText.setTextColor(Color.BLACK);
                }
            }
        });
        Slider3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int r = Slider1.getProgress();
                int g = Slider2.getProgress();
                int b = Slider3.getProgress();
                Colorview.setBackgroundColor(Color.rgb(r,g,b));
                RedColor.setText("Red: " + r);
                GreenColor.setText("Green: " + g);
                BlueColor.setText("Blue: " + b);
                ColorText.setText("("+ String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");
                if (r + g < 200) {
                    ColorText.setTextColor(Color.WHITE);
                } else{
                    ColorText.setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                int r = Slider1.getProgress();
                int g = Slider2.getProgress();
                int b = Slider3.getProgress();
                Colorview.setBackgroundColor(Color.rgb(r,g,b));
                RedColor.setText("Red: " + r);
                GreenColor.setText("Green: " + g);
                BlueColor.setText("Blue: " + b);
                ColorText.setText("("+ String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");
                if (r + g < 200) {
                    ColorText.setTextColor(Color.WHITE);
                } else{
                    ColorText.setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int r = Slider1.getProgress();
                int g = Slider2.getProgress();
                int b = Slider3.getProgress();
                Colorview.setBackgroundColor(Color.rgb(r,g,b));
                RedColor.setText("Red: " + r);
                GreenColor.setText("Green: " + g);
                BlueColor.setText("Blue: " + b);
                ColorText.setText("("+ String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");
                if (r + g < 200) {
                    ColorText.setTextColor(Color.WHITE);
                } else{
                    ColorText.setTextColor(Color.BLACK);
                }
            }
        });
        RandomColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int r = Random.nextInt(255);
                int g = Random.nextInt(255);
                int b = Random.nextInt(255);
                Slider1.setProgress(r);
                Slider2.setProgress(g);
                Slider3.setProgress(b);
                Colorview.setBackgroundColor(Color.rgb(r,g,b));
                RedColor.setText("Red: " + r);
                GreenColor.setText("Green: " + g);
                BlueColor.setText("Blue: " + b);
                ColorText.setText("("+ String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");
                if (r + g < 200) {
                    ColorText.setTextColor(Color.WHITE);
                } else{
                    ColorText.setTextColor(Color.BLACK);
                }
            }
        });
        ResetColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Slider1.setProgress(0);
                Slider2.setProgress(0);
                Slider3.setProgress(0);
                Colorview.setBackgroundColor(Color.rgb(0,0,0));
                RedColor.setText("Red: 0");
                GreenColor.setText("Green: 0");
                BlueColor.setText("Blue: 0");
                ColorText.setText("(0,0,0)");
                ColorText.setTextColor(Color.WHITE);
            }
        });
    }
    public void init(){
        Slider1 = findViewById(R.id.Slider1);
        Slider2 = findViewById(R.id.Slider2);
        Slider3 = findViewById(R.id.Slider3);
        RedColor = findViewById(R.id.RedColor);
        GreenColor = findViewById(R.id.GreenColor);
        BlueColor = findViewById(R.id.BlueColor);
        Colorview = findViewById(R.id.Colorview);
        ColorText = findViewById(R.id.ColorText);
        RandomColor = findViewById(R.id.RandomColor);
        Random = new Random();
        ResetColor = findViewById(R.id.ResetColor);
    }
}
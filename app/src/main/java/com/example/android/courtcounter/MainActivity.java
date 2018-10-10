package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int scoreA=0,scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Athree(View view){
        scoreA += 3;
        dispalyScoreA(scoreA);
    }

    public void Atwo(View view){
        scoreA += 2;
        dispalyScoreA(scoreA);
    }

    public void Aone(View view){
        scoreA += 1;
        dispalyScoreA(scoreA);
    }

    private void dispalyScoreA(int scoreA){
        TextView textView = (TextView)findViewById(R.id.text_view_A);
        textView.setText(NumberFormat.getInstance().format(scoreA));
    }

    public void Bthree(View view){
        scoreB += 3;
        dispalyScoreB(scoreB);
    }

    public void Btwo(View view){
        scoreB += 2;
        dispalyScoreB(scoreB);
    }

    public void Bone(View view){
        scoreB += 1;
        dispalyScoreB(scoreB);
    }

    private void dispalyScoreB(int scoreB){
        TextView textView = (TextView)findViewById(R.id.text_view_B);
        textView.setText(NumberFormat.getInstance().format(scoreB));
    }
     public void RESET(View view){
        scoreA = 0;
        scoreB = 0;
        dispalyScoreA(scoreA);
        dispalyScoreB(scoreB);
     }
}

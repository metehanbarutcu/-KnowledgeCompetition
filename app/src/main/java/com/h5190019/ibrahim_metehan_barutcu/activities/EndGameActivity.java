package com.h5190019.ibrahim_metehan_barutcu.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5190019.ibrahim_metehan_barutcu.R;
import com.h5190019.ibrahim_metehan_barutcu.utils.AlertDialogUtil;
import com.h5190019.ibrahim_metehan_barutcu.utils.Constants;
import com.h5190019.ibrahim_metehan_barutcu.utils.QuestionUtil;

public class EndGameActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtQuestionNumber, txtPoint;
    Button btnExit, btnTurnToMainPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);

        init();

    }

    private void init() {

        txtPoint = findViewById(R.id.txtQuestionPoint);
        txtQuestionNumber = findViewById(R.id.txtQuestionNumber);
        btnTurnToMainPage = findViewById(R.id.btnTurnToMainPage);
        btnExit = findViewById(R.id.btnEndGameExit);

        btnTurnToMainPage.setOnClickListener(this);
        btnExit.setOnClickListener(this);

        txtPoint.setText(getResources().getString(R.string.question_point) + Constants.QUESTION_POINT);
        txtQuestionNumber.setText(getResources().getString(R.string.question_number) + Constants.QUESTION_NUMBER + getResources().getString(R.string.total_question));

    }

    private void turnToMainPage() {
        QuestionUtil.resetQuestionNumber();
        QuestionUtil.resetQuestionPoint();
        Intent categoriesScreen = new Intent(EndGameActivity.this, CategoriesActivity.class);
        startActivity(categoriesScreen);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTurnToMainPage:
                turnToMainPage();
                break;
            case R.id.btnEndGameExit:
                AlertDialogUtil.showExitAlert(this);
                break;
        }
    }
}
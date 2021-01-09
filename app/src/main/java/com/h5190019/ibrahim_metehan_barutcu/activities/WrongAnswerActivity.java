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

public class WrongAnswerActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtPoint, txtQuestionNumber;
    Button btnExit, btnMainPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_answer);

        init();

    }

    private void init() {

        btnExit = findViewById(R.id.btnWrongAnswerExit);
        btnMainPage = findViewById(R.id.btnTurnToMainPage);
        txtPoint = findViewById(R.id.txtQuestionPoint);
        txtQuestionNumber = findViewById(R.id.txtQuestionNumber);

        btnMainPage.setOnClickListener(this);
        btnExit.setOnClickListener(this);

        int trueAnswerCount = Constants.QUESTION_NUMBER - 1;

        txtPoint.setText(getResources().getString(R.string.question_point) + Constants.QUESTION_POINT);
        txtQuestionNumber.setText(getResources().getString(R.string.question_number) + trueAnswerCount + getResources().getString(R.string.total_question));


    }

    private void turnToMainPage() {
        QuestionUtil.resetQuestionNumber();
        QuestionUtil.resetQuestionPoint();
        Intent categoriesScreen = new Intent(WrongAnswerActivity.this, CategoriesActivity.class);
        startActivity(categoriesScreen);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTurnToMainPage:
                turnToMainPage();
                break;
            case R.id.btnWrongAnswerExit:
                AlertDialogUtil.showExitAlert(this);
                break;
        }
    }
}
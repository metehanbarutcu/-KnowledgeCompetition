package com.h5190019.ibrahim_metehan_barutcu.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5190019.ibrahim_metehan_barutcu.R;
import com.h5190019.ibrahim_metehan_barutcu.model.Player;
import com.h5190019.ibrahim_metehan_barutcu.utils.AlertDialogUtil;
import com.h5190019.ibrahim_metehan_barutcu.utils.Constants;
import com.h5190019.ibrahim_metehan_barutcu.utils.ObjectUtil;
import com.h5190019.ibrahim_metehan_barutcu.utils.PrefUtil;
import com.h5190019.ibrahim_metehan_barutcu.utils.QuestionUtil;

public class CategoriesActivity extends AppCompatActivity implements View.OnClickListener {

    TextView playerName;
    Button btnAlert, btnCategory1, btnCategory2, btnCategory3, btnCategory4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        init();

    }

    private void init() {
        btnAlert = findViewById(R.id.btnExit);
        btnCategory1 = findViewById(R.id.btnCategoryTechnology);
        btnCategory2 = findViewById(R.id.btnCategoryHistory);
        btnCategory3 = findViewById(R.id.btnCategorySport);
        btnCategory4 = findViewById(R.id.btnCategoryScience);

        btnAlert.setOnClickListener(this);
        btnCategory1.setOnClickListener(this);
        btnCategory2.setOnClickListener(this);
        btnCategory3.setOnClickListener(this);
        btnCategory4.setOnClickListener(this);

        playerName = findViewById(R.id.txtPlayerName);
        String playerJson = PrefUtil.getStringPref(getApplicationContext(), Constants.PREF_PLAYER_OBJECT);
        Player player = ObjectUtil.jsonStringToPlayer(playerJson);
        playerName.setText(player.getName());
    }

    private void chooseCategory() {
        Intent questionsScreen = new Intent(CategoriesActivity.this, GameMainPageActivity.class);
        startActivity(questionsScreen);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnCategoryTechnology:
                chooseCategory();
                QuestionUtil.setQuestionIndexTechnology();
                break;
            case R.id.btnCategoryHistory:
                chooseCategory();
                QuestionUtil.setQuestionIndexHistory();
                break;
            case R.id.btnCategorySport:
                chooseCategory();
                QuestionUtil.setQuestionIndexSport();
                break;
            case R.id.btnCategoryScience:
                chooseCategory();
                QuestionUtil.setQuestionIndexScience();
                break;
            case R.id.btnExit:
                AlertDialogUtil.showExitAlert(this);
                break;
        }
    }
}
package com.h5190019.ibrahim_metehan_barutcu.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.h5190019.ibrahim_metehan_barutcu.R;
import com.h5190019.ibrahim_metehan_barutcu.model.Question;
import com.h5190019.ibrahim_metehan_barutcu.utils.AlertDialogUtil;
import com.h5190019.ibrahim_metehan_barutcu.utils.Constants;
import com.h5190019.ibrahim_metehan_barutcu.utils.QuestionUtil;


public class GameMainPageActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtQuestion, txtPoint, txtQuestionNumber, txtQuestionTitle;
    Button btn1, btn2, btn3, btn4;
    ImageView imgQuestionIcon;
    int trueAnswer, totalPoint = 1000, answer1 = 1, answer2 = 2, answer3 = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main_page);
        init();

    }


    private void init() {
        imgQuestionIcon = findViewById(R.id.questionIcon);
        txtQuestion = findViewById(R.id.txtQuestion);
        txtPoint = findViewById(R.id.txtQuestionPoint);
        txtQuestionTitle = findViewById(R.id.txtQuestionTitle);
        txtQuestionNumber = findViewById(R.id.txtQuestionNumber);
        btn1 = findViewById(R.id.btnOption1);
        btn2 = findViewById(R.id.btnOption2);
        btn3 = findViewById(R.id.btnOption3);
        btn4 = findViewById(R.id.btnOption4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        txtPoint.setText(getResources().getString(R.string.question_point) + Constants.QUESTION_POINT);
        txtQuestionNumber.setText(getResources().getString(R.string.question_number) + Constants.QUESTION_NUMBER + getResources().getString(R.string.total_question));

        QuestionUtil.createQuestions(getApplicationContext());
        resetButtons();
        fillInQuestion();
    }

    private void fillInQuestion() {
        setTitle();
        resetButtons();
        Question question = QuestionUtil.getNextQuestion();
        txtQuestion.setText(question.getQuestion());
        btn1.setText(question.getAnswer1());
        btn2.setText(question.getAnswer2());
        btn3.setText(question.getAnswer3());
        btn4.setText(question.getAnswer4());
    }

    private void setTitle() {
        if (Constants.QUESTION_INDEX < 10) {
            txtQuestionTitle.setText(getResources().getString(R.string.category_technology_title));
            txtQuestionTitle.setBackground(getResources().getDrawable(R.drawable.rounded_true_answer_button));
            imgQuestionIcon.setBackground(getResources().getDrawable(R.drawable.technology));
        } else if (Constants.QUESTION_INDEX < 20) {
            txtQuestionTitle.setText(getResources().getString(R.string.category_history_title));
            txtQuestionTitle.setBackground(getResources().getDrawable(R.drawable.rounded_category_history_button));
            imgQuestionIcon.setBackground(getResources().getDrawable(R.drawable.history));
        } else if (Constants.QUESTION_INDEX < 30) {
            txtQuestionTitle.setText(getResources().getString(R.string.category_sport_title));
            txtQuestionTitle.setBackground(getResources().getDrawable(R.drawable.rounded_category_sport_button));
            imgQuestionIcon.setBackground(getResources().getDrawable(R.drawable.sport));
        } else {
            txtQuestionTitle.setText(getResources().getString(R.string.category_science_title));
            txtQuestionTitle.setBackground(getResources().getDrawable(R.drawable.rounded_category_science_button));
            imgQuestionIcon.setBackground(getResources().getDrawable(R.drawable.science));
        }
    }

    private void answerCheck(int clickedAnswer, final View btnClicked) {

        if (QuestionUtil.isThisTrueAnswer(clickedAnswer)) {
            btnClicked.setBackground(getResources().getDrawable(R.drawable.rounded_true_answer_button));
            trueAnswerTimer();
        } else {
            btnClicked.setBackground(getResources().getDrawable(R.drawable.rounded_false_button));
            falseAnswerTimer();
        }
    }

    private void resetButtons() {
        btn1.setBackground(getResources().getDrawable(R.drawable.rounded_option_button));
        btn2.setBackground(getResources().getDrawable(R.drawable.rounded_option_button));
        btn3.setBackground(getResources().getDrawable(R.drawable.rounded_option_button));
        btn4.setBackground(getResources().getDrawable(R.drawable.rounded_option_button));
    }


    private void disableButtons() {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
    }

    private void enabledButtons() {
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
    }

    private void paintTrueAnswer() {
        trueAnswer = QuestionUtil.getTrueAnswer(Constants.QUESTION_INDEX);

        if (trueAnswer == answer1) {
            btn1.setBackground(getResources().getDrawable(R.drawable.rounded_true_answer_button));
        } else if (trueAnswer == answer2) {
            btn2.setBackground(getResources().getDrawable(R.drawable.rounded_true_answer_button));
        } else if (trueAnswer == answer3) {
            btn3.setBackground(getResources().getDrawable(R.drawable.rounded_true_answer_button));
        } else {
            btn4.setBackground(getResources().getDrawable(R.drawable.rounded_true_answer_button));
        }

    }

    private void trueAnswerTimer() {
        QuestionUtil.toIncreaseQuestionPoint();
        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                disableButtons();
                AlertDialogUtil.showNextQuestionAlert(GameMainPageActivity.this,
                        getResources().getString(R.string.congrats_true_answer),
                        getResources().getString(R.string.next_question));

                txtPoint.setText(getResources().getString(R.string.question_point) + Constants.QUESTION_POINT);
                txtQuestionNumber.setText(getResources().getString(R.string.question_number) + Constants.QUESTION_NUMBER + getResources().getString(R.string.total_question));
            }

            @Override
            public void onFinish() {
                questionPointCheck();
            }
        };
        countDownTimer.start();
    }

    private void questionPointCheck() {
        if (Constants.QUESTION_POINT < totalPoint) {
            enabledButtons();
            QuestionUtil.toIncreaseQuestionIndex();
            QuestionUtil.toIncreaseQuestionNumber();
            fillInQuestion();
        } else {
            Intent endGameScreen = new Intent(GameMainPageActivity.this, EndGameActivity.class);
            startActivity(endGameScreen);
        }
    }

    private void falseAnswerTimer() {
        paintTrueAnswer();
        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                disableButtons();
            }

            @Override
            public void onFinish() {
                enabledButtons();
                Intent falseAnswerScreen = new Intent(GameMainPageActivity.this, WrongAnswerActivity.class);
                startActivity(falseAnswerScreen);
            }
        };
        countDownTimer.start();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnOption1:
                answerCheck(1, view);
                break;
            case R.id.btnOption2:
                answerCheck(2, view);
                break;
            case R.id.btnOption3:
                answerCheck(3, view);
                break;
            case R.id.btnOption4:
                answerCheck(4, view);
                break;
        }
    }
}
package com.h5190019.ibrahim_metehan_barutcu.utils;

import android.content.Context;

import com.h5190019.ibrahim_metehan_barutcu.R;
import com.h5190019.ibrahim_metehan_barutcu.model.Question;

import java.util.ArrayList;


public class QuestionUtil {
    static ArrayList<Question> questions = new ArrayList<>();

    public static void createQuestions(Context context) {
        Question questionTechnology = new Question(
                context.getResources().getString(R.string.technology_question1),
                context.getResources().getString(R.string.technology_q1_answer1),
                context.getResources().getString(R.string.technology_q1_answer2),
                context.getResources().getString(R.string.technology_q1_answer3),
                context.getResources().getString(R.string.technology_q1_answer4_true),
                4
        );
        Question questionTechnology2 = new Question(
                context.getResources().getString(R.string.technology_question2),
                context.getResources().getString(R.string.technology_q2_answer1_true),
                context.getResources().getString(R.string.technology_q2_answer2),
                context.getResources().getString(R.string.technology_q2_answer3),
                context.getResources().getString(R.string.technology_q2_answer4),
                1
        );
        Question questionTechnology3 = new Question(
                context.getResources().getString(R.string.technology_question3),
                context.getResources().getString(R.string.technology_q3_answer1),
                context.getResources().getString(R.string.technology_q3_answer2_true),
                context.getResources().getString(R.string.technology_q3_answer3),
                context.getResources().getString(R.string.technology_q3_answer4),
                2
        );
        Question questionTechnology4 = new Question(
                context.getResources().getString(R.string.technology_question4),
                context.getResources().getString(R.string.technology_q4_answer1),
                context.getResources().getString(R.string.technology_q4_answer2),
                context.getResources().getString(R.string.technology_q4_answer3),
                context.getResources().getString(R.string.technology_q4_answer4_true),
                4
        );
        Question questionTechnology5 = new Question(
                context.getResources().getString(R.string.technology_question5),
                context.getResources().getString(R.string.technology_q5_answer1),
                context.getResources().getString(R.string.technology_q5_answer2),
                context.getResources().getString(R.string.technology_q5_answer3),
                context.getResources().getString(R.string.technology_q5_answer4_true),
                4
        );
        Question questionTechnology6 = new Question(
                context.getResources().getString(R.string.technology_question6),
                context.getResources().getString(R.string.technology_q6_answer1),
                context.getResources().getString(R.string.technology_q6_answer2),
                context.getResources().getString(R.string.technology_q6_answer3_true),
                context.getResources().getString(R.string.technology_q6_answer4),
                3
        );
        Question questionTechnology7 = new Question(
                context.getResources().getString(R.string.technology_question7),
                context.getResources().getString(R.string.technology_q7_answer1),
                context.getResources().getString(R.string.technology_q7_answer2),
                context.getResources().getString(R.string.technology_q7_answer3),
                context.getResources().getString(R.string.technology_q7_answer4_true),
                4
        );
        Question questionTechnology8 = new Question(
                context.getResources().getString(R.string.technology_question8),
                context.getResources().getString(R.string.technology_q8_answer1),
                context.getResources().getString(R.string.technology_q8_answer2),
                context.getResources().getString(R.string.technology_q8_answer3),
                context.getResources().getString(R.string.technology_q8_answer4_true),
                4
        );
        Question questionTechnology9 = new Question(
                context.getResources().getString(R.string.technology_question9),
                context.getResources().getString(R.string.technology_q9_answer1),
                context.getResources().getString(R.string.technology_q9_answer2),
                context.getResources().getString(R.string.technology_q9_answer3_true),
                context.getResources().getString(R.string.technology_q9_answer4),
                3
        );
        Question questionTechnology10 = new Question(
                context.getResources().getString(R.string.technology_question10),
                context.getResources().getString(R.string.technology_q10_answer1_true),
                context.getResources().getString(R.string.technology_q10_answer2),
                context.getResources().getString(R.string.technology_q10_answer3),
                context.getResources().getString(R.string.technology_q10_answer4),
                1
        );
        Question questionHistory = new Question(
                context.getResources().getString(R.string.history_question1),
                context.getResources().getString(R.string.history_q1_answer1),
                context.getResources().getString(R.string.history_q1_answer2),
                context.getResources().getString(R.string.history_q1_answer3_true),
                context.getResources().getString(R.string.history_q1_answer4),
                3
        );
        Question questionHistory2 = new Question(
                context.getResources().getString(R.string.history_question2),
                context.getResources().getString(R.string.history_q2_answer1_true),
                context.getResources().getString(R.string.history_q2_answer2),
                context.getResources().getString(R.string.history_q2_answer3),
                context.getResources().getString(R.string.history_q2_answer4),
                1
        );
        Question questionHistory3 = new Question(
                context.getResources().getString(R.string.history_question3),
                context.getResources().getString(R.string.history_q3_answer1),
                context.getResources().getString(R.string.history_q3_answer2_true),
                context.getResources().getString(R.string.history_q3_answer3),
                context.getResources().getString(R.string.history_q3_answer4),
                2
        );
        Question questionHistory4 = new Question(
                context.getResources().getString(R.string.history_question4),
                context.getResources().getString(R.string.history_q4_answer1),
                context.getResources().getString(R.string.history_q4_answer2_true),
                context.getResources().getString(R.string.history_q4_answer3),
                context.getResources().getString(R.string.history_q4_answer4),
                2
        );
        Question questionHistory5 = new Question(
                context.getResources().getString(R.string.history_question5),
                context.getResources().getString(R.string.history_q5_answer1),
                context.getResources().getString(R.string.history_q5_answer2),
                context.getResources().getString(R.string.history_q5_answer3),
                context.getResources().getString(R.string.history_q5_answer4_true),
                4
        );
        Question questionHistory6 = new Question(
                context.getResources().getString(R.string.history_question6),
                context.getResources().getString(R.string.history_q6_answer1_true),
                context.getResources().getString(R.string.history_q6_answer2),
                context.getResources().getString(R.string.history_q6_answer3),
                context.getResources().getString(R.string.history_q6_answer4),
                1
        );
        Question questionHistory7 = new Question(
                context.getResources().getString(R.string.history_question7),
                context.getResources().getString(R.string.history_q7_answer1),
                context.getResources().getString(R.string.history_q7_answer2),
                context.getResources().getString(R.string.history_q7_answer3),
                context.getResources().getString(R.string.history_q7_answer4_true),
                4
        );
        Question questionHistory8 = new Question(
                context.getResources().getString(R.string.history_question8),
                context.getResources().getString(R.string.history_q8_answer1),
                context.getResources().getString(R.string.history_q8_answer2),
                context.getResources().getString(R.string.history_q8_answer3),
                context.getResources().getString(R.string.history_q8_answer4_true),
                4
        );
        Question questionHistory9 = new Question(
                context.getResources().getString(R.string.history_question9),
                context.getResources().getString(R.string.history_q9_answer1),
                context.getResources().getString(R.string.history_q9_answer2),
                context.getResources().getString(R.string.history_q9_answer3_true),
                context.getResources().getString(R.string.history_q9_answer4),
                3
        );
        Question questionHistory10 = new Question(
                context.getResources().getString(R.string.history_question10),
                context.getResources().getString(R.string.history_q10_answer1_true),
                context.getResources().getString(R.string.history_q10_answer2),
                context.getResources().getString(R.string.history_q10_answer3),
                context.getResources().getString(R.string.history_q10_answer4),
                1
        );
        Question questionSport = new Question(
                context.getResources().getString(R.string.sport_question1),
                context.getResources().getString(R.string.sport_q1_answer1_true),
                context.getResources().getString(R.string.sport_q1_answer2),
                context.getResources().getString(R.string.sport_q1_answer3),
                context.getResources().getString(R.string.sport_q1_answer4),
                1
        );
        Question questionSport2 = new Question(
                context.getResources().getString(R.string.sport_question2),
                context.getResources().getString(R.string.sport_q2_answer1_true),
                context.getResources().getString(R.string.sport_q2_answer2),
                context.getResources().getString(R.string.sport_q2_answer3),
                context.getResources().getString(R.string.sport_q2_answer4),
                1
        );
        Question questionSport3 = new Question(
                context.getResources().getString(R.string.sport_question3),
                context.getResources().getString(R.string.sport_q3_answer1),
                context.getResources().getString(R.string.sport_q3_answer2),
                context.getResources().getString(R.string.sport_q3_answer3_true),
                context.getResources().getString(R.string.sport_q3_answer4),
                3
        );
        Question questionSport4 = new Question(
                context.getResources().getString(R.string.sport_question4),
                context.getResources().getString(R.string.sport_q4_answer1),
                context.getResources().getString(R.string.sport_q4_answer2_true),
                context.getResources().getString(R.string.sport_q4_answer3),
                context.getResources().getString(R.string.sport_q4_answer4),
                2
        );
        Question questionSport5 = new Question(
                context.getResources().getString(R.string.sport_question5),
                context.getResources().getString(R.string.sport_q5_answer1),
                context.getResources().getString(R.string.sport_q5_answer2),
                context.getResources().getString(R.string.sport_q5_answer3),
                context.getResources().getString(R.string.sport_q5_answer4_true),
                4
        );
        Question questionSport6 = new Question(
                context.getResources().getString(R.string.sport_question6),
                context.getResources().getString(R.string.sport_q6_answer1_true),
                context.getResources().getString(R.string.sport_q6_answer2),
                context.getResources().getString(R.string.sport_q6_answer3),
                context.getResources().getString(R.string.sport_q6_answer4),
                1
        );
        Question questionSport7 = new Question(
                context.getResources().getString(R.string.sport_question7),
                context.getResources().getString(R.string.sport_q7_answer1),
                context.getResources().getString(R.string.sport_q7_answer2_true),
                context.getResources().getString(R.string.sport_q7_answer3),
                context.getResources().getString(R.string.sport_q7_answer4),
                2
        );
        Question questionSport8 = new Question(
                context.getResources().getString(R.string.sport_question8),
                context.getResources().getString(R.string.sport_q8_answer1),
                context.getResources().getString(R.string.sport_q8_answer2),
                context.getResources().getString(R.string.sport_q8_answer3),
                context.getResources().getString(R.string.sport_q8_answer4_true),
                4
        );
        Question questionSport9 = new Question(
                context.getResources().getString(R.string.sport_question9),
                context.getResources().getString(R.string.sport_q9_answer1),
                context.getResources().getString(R.string.sport_q9_answer2_true),
                context.getResources().getString(R.string.sport_q9_answer3),
                context.getResources().getString(R.string.sport_q9_answer4),
                2
        );
        Question questionSport10 = new Question(
                context.getResources().getString(R.string.sport_question10),
                context.getResources().getString(R.string.sport_q10_answer1),
                context.getResources().getString(R.string.sport_q10_answer2),
                context.getResources().getString(R.string.sport_q10_answer3_true),
                context.getResources().getString(R.string.sport_q10_answer4),
                3
        );
        Question questionScience = new Question(
                context.getResources().getString(R.string.science_question1),
                context.getResources().getString(R.string.science_q1_answer1),
                context.getResources().getString(R.string.science_q1_answer2),
                context.getResources().getString(R.string.science_q1_answer3_true),
                context.getResources().getString(R.string.science_q1_answer4),
                3
        );
        Question questionScience2 = new Question(
                context.getResources().getString(R.string.science_question2),
                context.getResources().getString(R.string.science_q2_answer1_true),
                context.getResources().getString(R.string.science_q2_answer2),
                context.getResources().getString(R.string.science_q2_answer3),
                context.getResources().getString(R.string.science_q2_answer4),
                1
        );
        Question questionScience3 = new Question(
                context.getResources().getString(R.string.science_question3),
                context.getResources().getString(R.string.science_q3_answer1),
                context.getResources().getString(R.string.science_q3_answer2_true),
                context.getResources().getString(R.string.science_q3_answer3),
                context.getResources().getString(R.string.science_q3_answer4),
                2
        );
        Question questionScience4 = new Question(
                context.getResources().getString(R.string.science_question4),
                context.getResources().getString(R.string.science_q4_answer1),
                context.getResources().getString(R.string.science_q4_answer2_true),
                context.getResources().getString(R.string.science_q4_answer3),
                context.getResources().getString(R.string.science_q4_answer4),
                2
        );
        Question questionScience5 = new Question(
                context.getResources().getString(R.string.science_question5),
                context.getResources().getString(R.string.science_q5_answer1),
                context.getResources().getString(R.string.science_q5_answer2),
                context.getResources().getString(R.string.science_q5_answer3),
                context.getResources().getString(R.string.science_q5_answer4_true),
                4
        );
        Question questionScience6 = new Question(
                context.getResources().getString(R.string.science_question6),
                context.getResources().getString(R.string.science_q6_answer1),
                context.getResources().getString(R.string.science_q6_answer2),
                context.getResources().getString(R.string.science_q6_answer3_true),
                context.getResources().getString(R.string.science_q6_answer4),
                3
        );
        Question questionScience7 = new Question(
                context.getResources().getString(R.string.science_question7),
                context.getResources().getString(R.string.science_q7_answer1_true),
                context.getResources().getString(R.string.science_q7_answer2),
                context.getResources().getString(R.string.science_q7_answer3),
                context.getResources().getString(R.string.science_q7_answer4),
                1
        );
        Question questionScience8 = new Question(
                context.getResources().getString(R.string.science_question8),
                context.getResources().getString(R.string.science_q8_answer1_true),
                context.getResources().getString(R.string.science_q8_answer2),
                context.getResources().getString(R.string.science_q8_answer3),
                context.getResources().getString(R.string.science_q8_answer4),
                1
        );
        Question questionScience9 = new Question(
                context.getResources().getString(R.string.science_question9),
                context.getResources().getString(R.string.science_q9_answer1),
                context.getResources().getString(R.string.science_q9_answer2_true),
                context.getResources().getString(R.string.science_q9_answer3),
                context.getResources().getString(R.string.science_q9_answer4),
                2
        );
        Question questionScience10 = new Question(
                context.getResources().getString(R.string.science_question10),
                context.getResources().getString(R.string.science_q10_answer1),
                context.getResources().getString(R.string.science_q10_answer2),
                context.getResources().getString(R.string.science_q10_answer3_true),
                context.getResources().getString(R.string.science_q10_answer4),
                3
        );

        questions.add(questionTechnology);
        questions.add(questionTechnology2);
        questions.add(questionTechnology3);
        questions.add(questionTechnology4);
        questions.add(questionTechnology5);
        questions.add(questionTechnology6);
        questions.add(questionTechnology7);
        questions.add(questionTechnology8);
        questions.add(questionTechnology9);
        questions.add(questionTechnology10);

        questions.add(questionHistory);
        questions.add(questionHistory2);
        questions.add(questionHistory3);
        questions.add(questionHistory4);
        questions.add(questionHistory5);
        questions.add(questionHistory6);
        questions.add(questionHistory7);
        questions.add(questionHistory8);
        questions.add(questionHistory9);
        questions.add(questionHistory10);

        questions.add(questionSport);
        questions.add(questionSport2);
        questions.add(questionSport3);
        questions.add(questionSport4);
        questions.add(questionSport5);
        questions.add(questionSport6);
        questions.add(questionSport7);
        questions.add(questionSport8);
        questions.add(questionSport9);
        questions.add(questionSport10);

        questions.add(questionScience);
        questions.add(questionScience2);
        questions.add(questionScience3);
        questions.add(questionScience4);
        questions.add(questionScience5);
        questions.add(questionScience6);
        questions.add(questionScience7);
        questions.add(questionScience8);
        questions.add(questionScience9);
        questions.add(questionScience10);


    }

    public static void setQuestionIndexTechnology() {
        Constants.QUESTION_INDEX = 0;
    }

    public static void setQuestionIndexHistory() {
        Constants.QUESTION_INDEX = 10;
    }

    public static void setQuestionIndexSport() {
        Constants.QUESTION_INDEX = 20;
    }

    public static void setQuestionIndexScience() {
        Constants.QUESTION_INDEX = 30;
    }

    public static void toIncreaseQuestionIndex() {
        Constants.QUESTION_INDEX++;
    }

    public static void toIncreaseQuestionNumber() {
        Constants.QUESTION_NUMBER++;
    }

    public static void toIncreaseQuestionPoint() {
        Constants.QUESTION_POINT += 100;
    }


    public static void resetQuestionNumber() {
        Constants.QUESTION_NUMBER = 1;
    }

    public static void resetQuestionPoint() {
        Constants.QUESTION_POINT = 0;
    }

    public static int getTrueAnswer(int index) {
        return questions.get(index).getTrueAnswer();
    }

    public static Question getNextQuestion() {
        return questions.get(Constants.QUESTION_INDEX);
    }

    public static Boolean isThisTrueAnswer(int answer) {
        if (questions.get(Constants.QUESTION_INDEX).getTrueAnswer() == answer) {
            return true;
        } else {
            return false;
        }
    }
}

package com.h5190019.ibrahim_metehan_barutcu.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.h5190019.ibrahim_metehan_barutcu.R;
import com.h5190019.ibrahim_metehan_barutcu.model.Player;
import com.h5190019.ibrahim_metehan_barutcu.utils.Constants;
import com.h5190019.ibrahim_metehan_barutcu.utils.ObjectUtil;
import com.h5190019.ibrahim_metehan_barutcu.utils.PrefUtil;


public class PlayerLoginActivity extends AppCompatActivity {

    EditText edtTxtPlayerName;
    Button btnCategoriesScreen;
    String playerName, playerJson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_login);

        PlayerLoginScreen();

    }

    private void PlayerLoginScreen() {

        btnCategoriesScreen = findViewById(R.id.btnNextPage);

        btnCategoriesScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkEmptyName();
            }
        });
    }

    private void checkEmptyName() {

        edtTxtPlayerName = findViewById(R.id.txtEnterPlayerName);
        playerName = edtTxtPlayerName.getText().toString();

        if (TextUtils.isEmpty(playerName)) {

            Toast.makeText(PlayerLoginActivity.this, getResources().getString(R.string.alert_name),
                    Toast.LENGTH_SHORT).show();

        } else {

            Player player = new Player(edtTxtPlayerName.getText().toString(), 0);
            playerJson = ObjectUtil.playerToString(player);
            PrefUtil.setStringPref(getApplicationContext(), Constants.PREF_PLAYER_OBJECT, playerJson);
            Intent categoriesScreen = new Intent(PlayerLoginActivity.this, CategoriesActivity.class);
            startActivity(categoriesScreen);

        }
    }
}
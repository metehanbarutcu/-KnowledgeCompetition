package com.h5190019.ibrahim_metehan_barutcu.utils;

import com.google.gson.Gson;
import com.h5190019.ibrahim_metehan_barutcu.model.Player;

public class ObjectUtil {
    public static String playerToString(Player player) {

        Gson gson = new Gson();
        return gson.toJson(player);

    }

    public static Player jsonStringToPlayer(String jsonString) {

        Gson gson = new Gson();
        return gson.fromJson(jsonString, Player.class);

    }
}

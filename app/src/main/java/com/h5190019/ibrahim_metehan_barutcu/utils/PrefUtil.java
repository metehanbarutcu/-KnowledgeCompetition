package com.h5190019.ibrahim_metehan_barutcu.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PrefUtil {

    private static SharedPreferences getPrefs(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setStringPref(Context context, String key, String value) {
        getPrefs(context).edit().putString(key, value).apply();
    }

    public static String getStringPref(Context context, String key) {
        return getPrefs(context).getString(key, "");
    }

    public static void setIntPref(Context context, String key, int value) {
        getPrefs(context).edit().putInt(key, value).apply();
    }

    public static int getIntPref(Context context, String key) {
        return getPrefs(context).getInt(key, -1);
    }
}


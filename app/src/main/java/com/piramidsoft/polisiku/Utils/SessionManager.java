package com.piramidsoft.polisiku.Utils;

/**
 * Created by Web on 16/04/2016.
 */

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import com.piramidsoft.polisiku.LoginActivity;


public class SessionManager {

    SharedPreferences pref;

    Editor editor;

    Context _context;

    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "com.piramidsoft.polisiku.save";

    private static final String IS_LOGIN = "IsLoggedIn";

    public static final String KEY_ID = "id";

    public static final String KEY_NAME = "name";

    public static final String KEY_SPECIALIZTION = "specialization";

    public static final String KEY_ADDRESS = "address";

    public static final String KEY_TOKEN = "token";

    public static final String KEY_API_KEY = "apikey";

    public static final String KEY_REFRESH_CODE = "refreshCode";

    public static final String KEY_LAT = "lat";

    public static final String KEY_LON = "lon";

    public static final String KEY_FCM_ID = "fcm_id";


    public SessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void createLoginSession(String id, String name, String token, String apikey, String refreshcode) {

        editor.putBoolean(IS_LOGIN, true);

        editor.putString(KEY_ID, id);

        editor.putString(KEY_NAME, name);

        editor.putString(KEY_TOKEN, token);

        editor.putString(KEY_API_KEY, apikey);

        editor.putString(KEY_REFRESH_CODE, refreshcode);


        editor.commit();
    }


    public boolean checkLogin() {
        // Check login status

        boolean stLogin = true;

        if (!this.isLoggedIn()) {

            stLogin = false;
        }

        return stLogin;

    }

    public void logoutUser() {
        // Clearing all data from Shared Preferences
        String token = getToken();
        editor.clear();
        editor.commit();
        setToken(token);

    }

    public boolean isLoggedIn() {
        return pref.getBoolean(IS_LOGIN, false);
    }

    public String getName() {

        return pref.getString(KEY_NAME, null);
    }

    public void setName(String name) {
        editor.putString(KEY_NAME, name);
        editor.commit();
    }

    public String getToken() {

        return pref.getString(KEY_TOKEN, null);
    }

    public void setToken(String token) {
        editor.putString(KEY_TOKEN, token);
        editor.commit();
    }

    public String getApiKey() {

        return pref.getString(KEY_API_KEY, null);
    }

    public void setApiKey(String apiKey) {
        editor.putString(KEY_API_KEY, apiKey);
        editor.commit();
    }

    public String getId() {

        return pref.getString(KEY_ID, null);
    }

    public void setId(String id) {
        editor.putString(KEY_ID, id);
        editor.commit();
    }

    public String getLat() {

        return pref.getString(KEY_LAT, null);
    }

    public void setLat(String lat) {
        editor.putString(KEY_LAT, lat);
        editor.commit();
    }

    public String getLon() {

        return pref.getString(KEY_LON, null);
    }

    public void setLon(String lon) {
        editor.putString(KEY_LON, lon);
        editor.commit();
    }

    public String getRefreshCode() {

        return pref.getString(KEY_REFRESH_CODE, null);
    }

    public void setRefreshCode(String refreshCode) {
        editor.putString(KEY_REFRESH_CODE, refreshCode);
        editor.commit();
    }

    public String getFcmId() {

        return pref.getString(KEY_FCM_ID, null);
    }

    public void setFcmId(String id) {
        editor.putString(KEY_FCM_ID, id);
        editor.commit();
    }

    public void checkExpired(String result, String msg) {
        if (result.equals("expired")) {

            GlobalToast.ShowToast(_context, msg);

            this.logoutUser();
            Intent intent = new Intent(_context, LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            _context.startActivity(intent);

        }
    }


}
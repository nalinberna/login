package com.example.netlabs.register;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import static android.accounts.AccountManager.KEY_PASSWORD;

public class DBHandler {

 private static final int DATABASE_VERSION =1;

private static final String Database_Name = "Login";

private static final String Table_login ="loginDetails";

private static final String key_Name ="name";
private static final String key_Age ="age";
private static final String key_Username ="username";
private static final String key_Password ="password";

public DBHandler (Context context){ super (context Database_Name null Database_version);}

@Override
public void onCreate(SQLite database db);

    private static final String LOGIN_DETAILED_TABLE = "login";

    {
    String create LOGIN_DETAILED_TABLE ="CREATE_TABLE"+ TABLE_LOGIN_DETAILS + "("
                + KEY_NAME + "TEXT,"
                +KEY_AGE + "TEXT,"
                +KEY_USERNAME +"TEXT,"
                +KEY_PASSWORD + "TEXT " + ")";
    db execSQLite (CREATE_LOGIN_DETAILED_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    db.execSQL("DROP TABLE IF EXISTS" + TABLE_LOGIN_DETAIL);

    onCreate (db);
    }











}


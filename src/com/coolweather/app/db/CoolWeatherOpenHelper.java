package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.DropBoxManager;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper{
	/**
	 * ʡ�������
	 * 
	 */
	public static final String CREATE_PROVINCE="create table province(" +
			"id integer primary key autoincrement," +
			"province_name text," +
			"province_code text)";
	/**
	 * ���н������
	 * 
	 */
	public static final String CREATE_CITY="create table city(" +
			"id integer primary key autoincrement," +
			"city_name text," +
			"city_code text," +
			"province_id integer)";
	/**
	 * �ؽ������
	 * 
	 */
	public static final String CREATE_COUNTY="create table county(" +
			"id integer primary key autoincrement," +
			"county_name text," +
			"county_code text," +
			"city_id integer)";

	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		//������
		arg0.execSQL(CREATE_PROVINCE);
		arg0.execSQL(CREATE_CITY);
		arg0.execSQL(CREATE_COUNTY);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int oldversion, int newversion) {
	
		
	}



	}

package nyc.c4q.mustafizurmatin.weatherapp.data_base;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by c4q on 2/3/18.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    private static final String TAG = DataBaseHelper.class.getSimpleName();
    private static final String DATABASE_NAME = "Weather.db";
    private static final String TABLE_NAME = "weather";
    private static final String COL1 = "ID";
    private static final String COL2 = "Zip_Code";

    public DataBaseHelper(Context context) {
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE" + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, " + COL2 + "TEXT)";
        db.execSQL(createTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //USE TO UPDATE MY LIST
        db.execSQL("DROP TABLE IF  EXISTS " + TABLE_NAME);
        onCreate(db);

    }

    public boolean addData(String zipCode) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, zipCode);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public Cursor getAllData() {
        return null;
    }
}

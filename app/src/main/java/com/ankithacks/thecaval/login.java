package com.ankithacks.thecaval;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myDBHelper mydbHelper=new myDBHelper(this);
        SQLiteDatabase db= mydbHelper.getReadableDatabase();

        String column[]={"email","password"};

        Cursor c=db.query("signup",column,null,null,null,null,null,null);
        c.moveToPosition(0);

        System.out.println("name is "+c.getString(0));

        EditText t1=(EditText)findViewById(R.id.editText);
        EditText t2=(EditText)findViewById(R.id.editText2);

        t1.setText(c.getString(0));
        t2.setText(c.getString(1));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void login(View view)
    {

    }
}

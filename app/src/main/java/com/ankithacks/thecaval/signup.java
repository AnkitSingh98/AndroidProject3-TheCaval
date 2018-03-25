package com.ankithacks.thecaval;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);





        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void next(View v)
    {

        EditText t1=(EditText)findViewById(R.id.editText2) ;
        EditText t2=(EditText)findViewById(R.id.editText3) ;
        EditText t3=(EditText)findViewById(R.id.editText4) ;
        EditText t4=(EditText)findViewById(R.id.editText5) ;

        myDBHelper mydbHelper=new myDBHelper(this);
        SQLiteDatabase db= mydbHelper.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put("Name",t1.getText().toString());
        values.put("email",t2.getText().toString());
        values.put("phone",t3.getText().toString());
        values.put("password",t4.getText().toString());

        long row=db.insert("signup",null,values);  //row contains the row number of nth row returned by this function

        System.out.println("Row no. is "+ row);
    }
}

package com.example.pharmaplus.assignmrnt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtUsername;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );

        txtUsername=(TextView)findViewById(R.id.txtUsername );

        Bundle extras=getIntent().getExtras();
        String username;

        if(extras != null)
        {

            username=extras.getString("username");
            txtUsername.setText("Welcome "+username);
        }
    }
}

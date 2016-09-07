package com.example.kaiso.arduinosimpleled;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity {


    String json_urld,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s2 = "192.168.240.1";
        json_urld = "http://"+ s2 +"/arduino/digital/13/0";

    }

    public void ledOne(View view){


    }
    public void ledTwo(View view){


    }
    public void ledThree(View view){


    }
    public void ledFour(View view){


    }
    public void ledFive(View view){


    }
    public void ledSix(View view){


    }
}

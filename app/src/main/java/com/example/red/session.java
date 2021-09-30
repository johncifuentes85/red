package com.example.red;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class session extends Activity {

    Button btnEntrar, btnRegistrese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);

        btnEntrar = findViewById(R.id.btnEntrar);
        btnRegistrese = findViewById(R.id.btnRegistrarse);
    }

    public void registrese(View view){
        Intent intent = new Intent(this,registrese.class);
        startActivity(intent);
        finish();
    }
}
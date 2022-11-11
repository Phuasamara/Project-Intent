package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Contact extends AppCompatActivity {

    public TextView c1, c2, c3, c4;

    public LinearLayout contact1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        c1 = findViewById(R.id.ContactName1);
        c2 = findViewById(R.id.ContactName2);
        c3 = findViewById(R.id.ContactName3);
        c4 = findViewById(R.id.ContactName4);

        contact1 = findViewById(R.id.contact1);
        contact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Contact.this, Send.class);
                intent.putExtra("namakontak", c1.getText().toString());
            }
        });
    }
}
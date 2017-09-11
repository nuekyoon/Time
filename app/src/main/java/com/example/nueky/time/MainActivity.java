package com.example.nueky.time;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import static android.R.id.message;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    /*public static boolean isIntentAvailable(Context ctx, Intent intent) {
        final PackageManager mgr = ctx.getPackageManager();
        List<ResolveInfo> list =
                mgr.queryIntentActivities(intent,
                        PackageManager.MATCH_DEFAULT_ONLY);
        return list.size() > 0;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnWeb = (Button) findViewById(R.id.button);
        Button btnMap = (Button) findViewById(R.id.button2);
        Button btnEmail = (Button) findViewById(R.id.button3);

        //Listening to button event
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.rmit.com"));

                startActivity(toWeb);
            }
        });

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMap = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.au/maps/"));

                startActivity(toMap);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toEmail = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/"));

                startActivity(toEmail);
            }
        });

    }

}























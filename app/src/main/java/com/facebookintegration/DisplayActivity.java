package com.facebookintegration;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by avinash
 */

public class DisplayActivity extends AppCompatActivity {

    public static final String FBOBJ = "Facebook Object";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        FacebookUser fbUser = getFbUser();
        ((TextView)findViewById(R.id.name)).setText(fbUser.getName());
        ((TextView)findViewById(R.id.email)).setText(fbUser.getEmail());
        ((TextView)findViewById(R.id.fbid)).setText(fbUser.getFbID());
        Glide.with(this).load(fbUser.getProfilePicUrl()).into((ImageView) findViewById(R.id.profile_pic));
    }

    private FacebookUser getFbUser() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        return (FacebookUser) bundle.getSerializable(FBOBJ);
    }
}

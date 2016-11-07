package com.android.amitrai.demomaterialanimations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivProfile = null;
    private String contact = "amit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }


    private void init(){

        ivProfile = (ImageView) findViewById(R.id.ivProfile);

        ivProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                // Pass data object in the bundle and populate details activity.
                intent.putExtra(DetailActivity.EXTRA_CONTACT, contact);
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this, (View)ivProfile, "profile");
                startActivity(intent, options.toBundle());
            }
        });



    }
}

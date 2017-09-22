package com.wwx.kotlin.test_kotlin.activity;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.view.SimpleDraweeView;
import com.wwx.kotlin.test_kotlin.R;

public class MainActivity extends AppCompatActivity {

    private String url = "https://f10.baidu.com/it/u=289940211,3155343846&fm=76";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImage();
    }

    private void initImage() {
        Uri uri = Uri.parse(url);
        SimpleDraweeView  image_view = (SimpleDraweeView) findViewById(R.id.image_view);
        image_view.setImageURI(uri);
    }
}

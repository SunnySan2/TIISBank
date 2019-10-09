package com.tiis.tiisbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.synnapps.carouselview.CarouselView;

public class MainActivity extends AppCompatActivity {
    //CarouselView圖片輪播，參考 https://github.com/sayyam/carouselview
    CarouselView carouselView;
    int[] bannerImages = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

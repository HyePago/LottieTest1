package com.example.hyejin.lottie_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

// 참고 :  http://airbnb.io/lottie/android/android.html#getting-started
public class MainActivity extends AppCompatActivity {
    LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 방법 2
        animationView = (LottieAnimationView)findViewById(R.id.animation_view2);
        animationView.setAnimation(R.raw.animation);
        animationView.playAnimation();
    }
}

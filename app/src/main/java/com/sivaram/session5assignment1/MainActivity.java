package com.sivaram.session5assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PerformBlinkingAnimation();

    }

    private void PerformBlinkingAnimation(){
        // Find TextView And Perform Animation
        TextView lblBlink = (TextView)findViewById(R.id.lblFadeInAnimation);
        animation = new AlphaAnimation(0.0f,1.0f);
        animation.setDuration(500);
        animation.setStartOffset(100);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setRepeatCount(Animation.INFINITE);
        lblBlink.startAnimation(animation);

    }
}

package com.sivaram.session5assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation animation;
    TextView lblBlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Button Click Listener

        final Button btnAnimate = (Button)findViewById(R.id.btnStartAnimation);

        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnAnimate.getText().toString().equalsIgnoreCase(getResources().getString(R.string.startanimation))) {
                    PerformBlinkingAnimation(btnAnimate.getText().toString());
                    btnAnimate.setText(R.string.stopanimation);
                }
                else {
                    PerformBlinkingAnimation(btnAnimate.getText().toString());
                    btnAnimate.setText(R.string.startanimation);
                }
            }
        });

    }

    private void PerformBlinkingAnimation(String type){
        // Find TextView And Perform Animation
        lblBlink = (TextView)findViewById(R.id.lblFadeInAnimation);
        if (type.equalsIgnoreCase("Start Animation")) {
            animation = new AlphaAnimation(0.0f, 1.0f);
            animation.setDuration(500);
            animation.setStartOffset(100);
            animation.setRepeatMode(Animation.REVERSE);
            animation.setRepeatCount(Animation.INFINITE);
            lblBlink.startAnimation(animation);
        }
        else
            lblBlink.clearAnimation();
    }
}

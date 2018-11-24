package app.example.app.androiodanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        image = (ImageView) findViewById(R.id.img);
        image.setImageResource(R.drawable.butterfly);
    }


    public void zoom(View v){
        Animation animaton = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        image.startAnimation(animaton);

    }

    public void move(View v){
        Animation animaton = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        image.startAnimation(animaton);
    }

    public void blink(View v){
        Animation animaton = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        image.startAnimation(animaton);
    }

    public void slideup(View v){
        Animation animaton = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        image.startAnimation(animaton);
    }

    public void fade(View v){
        Animation animaton = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        image.startAnimation(animaton);
    }

    public void slidedown(View v){
        Animation animaton = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        image.startAnimation(animaton);
    }
}

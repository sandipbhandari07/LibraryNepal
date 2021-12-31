package library.files.librarynepal;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.TextView;

import library.files.librarynepal.R;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_SCREEN = 3000;
    //variables
    Animation topAnim,bottomAnim;
    com.airbnb.lottie.LottieAnimationView anime;
    TextView logo;



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_main);

        //animation
       // topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
       // bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //hooks
        anime = findViewById(R.id.animation);
        logo = findViewById(R.id.lnsa);



//        anime.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,introactivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);



    }
}
















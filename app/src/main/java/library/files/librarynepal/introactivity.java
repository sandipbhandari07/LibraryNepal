package library.files.librarynepal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import library.files.librarynepal.IntroScreenItem;
import library.files.librarynepal.IntroViewPagerAdapter;
import library.files.librarynepal.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class introactivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;

    TabLayout tabIndicator;

    Button btnnext;
    int position = 0;
    Button btnGetStarted;

    Animation btnanim;

    TextView tvskip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //make the activity on full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //when this acitvity is about to be launch we need to check if its openened before or not
        if (restorePrefData()){
            Intent homepage = new Intent(getApplicationContext(),Homepage.class);
            startActivity(homepage);
            finish();
        }



        setContentView(R.layout.activity_introactivity);

        //hide the action bar
        //getSupportActionBar().hide();


        //ini views

       // btnnext = findViewById(R.id.introbtn_next);
        btnGetStarted = findViewById(R.id.btn_get_started);
        tabIndicator= findViewById(R.id.tab_indicator);
        btnanim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.intro_button_animation);
        tvskip = findViewById(R.id.tvskip);

        //fill list screen
        List<IntroScreenItem> mList = new ArrayList<>();

        mList.add(new IntroScreenItem("Learn","''Learning is not attained by chance. It must be sought for with ardour and attended with diligence.''",R.drawable.openbook));
        mList.add(new IntroScreenItem("Solutions","''Solution books are available from class 8 to class 12.''",R.drawable.opensolutions));
        mList.add(new IntroScreenItem("","''By clicking get started, you accept the Terms and Conditions of LibraryNepal.''",R.drawable.introcheckmark));
        // setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);


        //setup tablayout with viewpager

        tabIndicator.setupWithViewPager(screenPager);

        //next button click listner

       /* btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position = screenPager.getCurrentItem();
                if (position < mList.size()){
                    position++;
                    screenPager.setCurrentItem(position);
                }
                if (position == mList.size()-1){
                    //when we reach to the last screen
                    // TODO: show the GETSTARTED Button and hide the indicator and the next button
                    
                    loadLastScreen();
                }



            }
        }); */

        //tablayout and change listener
        tabIndicator.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition()==mList.size()-1){
                    loadLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //get started button click listener
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homepage = new Intent(getApplicationContext(),Homepage.class);
                startActivity(homepage);
                
                savePrefsData();
                finish();
            }
        });

        //skip button click listener
        tvskip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPager.setCurrentItem(mList.size());
            }
        });

    }

    private boolean restorePrefData() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
       Boolean isIntroActivityOpenedBefore = pref.getBoolean("isIntroOPened",false);
       return isIntroActivityOpenedBefore;



    }

    private void savePrefsData() {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isIntroOpened",true);
        editor.commit();

    }

    //show the GETSTARTED Button and hide the indicator and the next button
    private void loadLastScreen() {
       // btnnext.setVisibility(View.INVISIBLE);
        btnGetStarted.setVisibility(View.VISIBLE);
        tabIndicator.setVisibility(View.INVISIBLE);

        //TODO : ADD an animation the getstarted button

        //setup animation
        btnGetStarted.setAnimation(btnanim);



    }

}
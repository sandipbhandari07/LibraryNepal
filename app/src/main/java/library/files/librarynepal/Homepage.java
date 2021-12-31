package library.files.librarynepal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import library.files.librarynepal.Nepaledsystempdf;
import library.files.librarynepal.R;
import library.files.librarynepal.SliderAdapter;
import library.files.librarynepal.lowersecondary;
import library.files.librarynepal.primarylevel;
import library.files.librarynepal.secondary;
import library.files.librarynepal.solution;
import library.files.librarynepal.solutionbook_class10;
import library.files.librarynepal.solutionbook_class11;
import library.files.librarynepal.solutionbook_class12;
import library.files.librarynepal.terms_and_conditions;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.navigation.NavigationView;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import org.jetbrains.annotations.NotNull;


public class Homepage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private AdView mAdView;
    SliderView sliderView;
    int[] images = {R.drawable.math,
            R.drawable.enlish12,
            R.drawable.english,
            R.drawable.nepali,
            R.drawable.ney,

    };
    Button btn,btn1,btn2,btn3,btn4,btn5,btn6 ;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView txt1,txt2,txt3,txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //statusbar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar();

        setContentView(R.layout.activity_homepage);


        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        btn= findViewById(R.id.system);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=  new Intent(Homepage.this, Nepaledsystempdf.class);
                startActivity(intent);
            }
        });
      /*  btn1=findViewById(R.id.btnclass10_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this,modelquestion_class10.class);
                startActivity(intent);
            }
        });

        btn2=findViewById(R.id.btnclass11_1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this,modelquestion_class11.class);
                startActivity(intent);
            }
        });

        btn3=findViewById(R.id.btnclass12_1);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this,modelquestion_class12.class);
                startActivity(intent);
            }
        });
       */

        btn4=findViewById(R.id.btnclass12_1_2);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this, solutionbook_class12.class);
                startActivity(intent);
            }
        });

        btn5=findViewById(R.id.btnclass11_1_2);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this, solutionbook_class11.class);
                startActivity(intent);

            }
        });

        btn6=findViewById(R.id.btnclass10_1_2);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this, solutionbook_class10.class);
                startActivity(intent);
            }
        });

        Button button=findViewById(R.id.grdsystembtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Homepage.this,gradingsystempdf.class);
                startActivity(intent);
            }
        });

        txt1=findViewById(R.id.homepage_primarylevel);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this, primarylevel.class);
                startActivity(intent);
            }
        });

        txt2=findViewById(R.id.homepage_lowersecondary);
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this, lowersecondary.class);
                startActivity(intent);
            }
        });

        txt3=findViewById(R.id.homepage_secondary);
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this, secondary.class);
                startActivity(intent);
            }
        });
        txt4=findViewById(R.id.homepage_highersecondary);
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this,highersecondary.class);
                startActivity(intent);
            }
        });


        //navview

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.nav_drawer_open,R.string.nav_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //if you have navbtn
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.nav_home);


    }
    @Override
    public void onBackPressed(){
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem menuItem)
    {

        switch (menuItem.getItemId()){
            case R.id.nav_home:

               Intent intent= new Intent(Homepage.this,Homepage.class);
                startActivity(intent);
                break;

            case R.id.nav_solution:
                Intent intent2= new Intent(Homepage.this, solution.class);
                startActivity(intent2);
                break;
            case R.id.nav_share:
                Uri uri=Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                try {
                    startActivity(i);

                }catch (Exception e){
                    Toast.makeText(this,"Unable to open\n"+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.nav_rate:
                Uri uri1=Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                Intent i1=new Intent(Intent.ACTION_VIEW,uri1);
                try {
                    startActivity(i1);

                }catch (Exception e1){
                    Toast.makeText(this,"Unable to open\n"+e1.getMessage(),Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.nav_term_condtion:
                Intent intent3= new Intent(Homepage.this, terms_and_conditions.class);
                startActivity(intent3);
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
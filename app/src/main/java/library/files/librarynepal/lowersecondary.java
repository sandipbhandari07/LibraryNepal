package library.files.librarynepal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import library.files.librarynepal.R;
import library.files.librarynepal.Homepage;
import library.files.librarynepal.R;
import library.files.librarynepal.highersecondary;
import library.files.librarynepal.lowersecondary;
import library.files.librarynepal.primarylevel;
import library.files.librarynepal.secondary;
import library.files.librarynepal.solution;
import library.files.librarynepal.terms_and_conditions;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.navigation.NavigationView;

public class lowersecondary extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private AdView mAdView;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ImageView imgback;
    TextView tv1,tv2,tv3;
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar();
        setContentView(R.layout.activity_lowersecondary);
        drawerLayout = findViewById(R.id.drawer_layout_lowersec);
        navigationView = findViewById(R.id.nav_view_lowersec);
        toolbar=findViewById(R.id.toolbar_lowersec);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.nav_drawer_open,R.string.nav_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);






        //if you have navbtn
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_view_lowersec);

        imgback=findViewById(R.id.back_btn_lowersec);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lowersecondary.this,Homepage.class);
                startActivity(intent);
            }
        });

        btn1=findViewById(R.id.lowersec_grade6);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lowersecondary.this,grade6.class);
                startActivity(intent);
            }
        });
        btn2=findViewById(R.id.lowersec_grade7);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lowersecondary.this,grade7.class);
                startActivity(intent);
            }
        });
        btn3=findViewById(R.id.lowersec_grade8);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lowersecondary.this,grade8.class);
                startActivity(intent);
            }
        });


        tv1=findViewById(R.id.lowersec_primary);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lowersecondary.this, primarylevel.class);
                startActivity(intent);
            }
        });
        tv2=findViewById(R.id.lowersec_secondary);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lowersecondary.this, secondary.class);
                startActivity(intent);
            }
        });
        tv3=findViewById(R.id.lowersec_highersecondary);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lowersecondary.this,highersecondary.class);
                startActivity(intent);
            }
        });


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
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItemlowersec) {
        switch (menuItemlowersec.getItemId()){
            case R.id.nav_home:

                Intent intent= new Intent(lowersecondary.this,Homepage.class);
                startActivity(intent);
                break;

            case R.id.nav_solution:
                Intent intent2= new Intent(lowersecondary.this, solution.class);
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
                Intent intent3= new Intent(lowersecondary.this, terms_and_conditions.class);
                startActivity(intent3);
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}




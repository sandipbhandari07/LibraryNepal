package library.files.librarynepal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import library.files.librarynepal.Homepage;
import library.files.librarynepal.R;
import library.files.librarynepal.highersecondary;
import library.files.librarynepal.lowersecondary;
import library.files.librarynepal.primarylevel;
import library.files.librarynepal.secondary;
import library.files.librarynepal.solution;
import library.files.librarynepal.terms_and_conditions;
import com.google.android.material.navigation.NavigationView;

public class grade5 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ImageView imgback;
    TextView tv1, tv2, tv3;
    Button btn1, btn2, btn3, btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar();
        setContentView(R.layout.activity_grade5);
        drawerLayout = findViewById(R.id.drawer_layout_grade5);
        navigationView = findViewById(R.id.nav_view_grd5);
        toolbar = findViewById(R.id.toolbar_grd5);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_drawer_open, R.string.nav_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //if you have navbtn
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_view_grd5);

        imgback = findViewById(R.id.back_btn_grd5);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(grade5.this, primarylevel.class);
                startActivity(intent);
            }
        });
        btn1 = findViewById(R.id.class5english);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(grade5.this, class5english.class);
                startActivity(intent);
            }
        });
        btn2 = findViewById(R.id.class5math);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(grade5.this, class5math.class);
                startActivity(intent);
            }
        });
        btn3 = findViewById(R.id.class5ganit);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(grade5.this, class5ganit.class);
                startActivity(intent);
            }
        });
        btn4 = findViewById(R.id.class5science);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(grade5.this, class5science.class);
                startActivity(intent);
            }
        });
        btn5 = findViewById(R.id.class5socialss);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(grade5.this, class5social.class);
                startActivity(intent);
            }
        });


        tv1 = findViewById(R.id.grd5_lowersecondary);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(grade5.this, lowersecondary.class);
                startActivity(intent);
            }
        });
        tv2 = findViewById(R.id.grd5_secondary);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(grade5.this, secondary.class);
                startActivity(intent);
            }
        });
        tv3 = findViewById(R.id.grd5_highersecondary);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(grade5.this, highersecondary.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItemgrd5) {
        switch (menuItemgrd5.getItemId()) {
            case R.id.nav_home:

                Intent intent = new Intent(grade5.this, Homepage.class);
                startActivity(intent);
                break;

            case R.id.nav_solution:
                Intent intent2 = new Intent(grade5.this, solution.class);
                startActivity(intent2);
                break;
            case R.id.nav_share:
                Toast.makeText(this, "share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_rate:
                Toast.makeText(this, "rate us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_term_condtion:
                Intent intent3 = new Intent(grade5.this, terms_and_conditions.class);
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
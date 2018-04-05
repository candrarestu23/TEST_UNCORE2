package com.example.candr.test_uncore2;


import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;

import com.example.candr.test_uncore2.Login.Login;
import com.example.candr.test_uncore2.Login.LoginDataBaseAdapter;
import com.example.candr.test_uncore2.fragment.adminFragment;
import com.example.candr.test_uncore2.fragment.fifthFragment;
import com.example.candr.test_uncore2.fragment.firstFragment;
import com.example.candr.test_uncore2.fragment.fourthFragment;
import com.example.candr.test_uncore2.fragment.secondFragment;
import com.example.candr.test_uncore2.fragment.sixthFragment;
import com.example.candr.test_uncore2.fragment.thirdFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private String[] tabs;
    Context context;
    ImageView batagor,peuyeum,bandros,surabi,ampera,nasiBancakan,nasiTimbel,lotek;
    TextView navID,navEmail;
    ViewPager viewPager;
    TabLayout tabLayout;
    FragmentTabHost tabHost;
    private TabWidget tabWidget;
    private HorizontalScrollView horizontalScrollView;
    LoginDataBaseAdapter loginDataBaseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);



        Transition exit = new Explode();
        Transition enter = new Slide();
        getWindow().setEnterTransition(enter);
        getWindow().setExitTransition(exit);
        ((CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout)).setTitle("NetGate");

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Intent i = getIntent();
        final String intentID = i.getStringExtra("ID");
        final String intentEmail= i.getStringExtra("EMAIL");

        View headerView = navigationView.getHeaderView(0);
        navID = (TextView) headerView.findViewById(R.id.nav_id);
        navEmail = (TextView) headerView.findViewById(R.id.nav_email);
        navID.setText(intentID);
        navEmail.setText(intentEmail);




    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        int count = getFragmentManager().getBackStackEntryCount();

        if (count == 0) {
            super.onBackPressed();
            //additional code
        } else {
            //getFragmentManager().popBackStack();
            finish();
            startActivity(getIntent());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.Profile) {
            Toast.makeText(this,"Under Construction",Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.Logout){
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragment = getSupportFragmentManager();




        if (id == R.id.Guru) {
            // Handle the camera action
            fragment.beginTransaction().replace(R.id.content_navigation ,new firstFragment()).commit();
        } else if (id == R.id.Staff) {
            fragment.beginTransaction().replace(R.id.content_navigation ,new secondFragment()).commit();
        } else if (id == R.id.WaliMurid) {
            fragment.beginTransaction().replace(R.id.content_navigation ,new thirdFragment()).commit();
        } else if (id == R.id.Siswa) {
            fragment.beginTransaction().replace(R.id.content_navigation ,new fourthFragment()).commit();
        } else if (id == R.id.Kelas){
            fragment.beginTransaction().replace(R.id.content_navigation ,new fifthFragment()).commit();
        } else if (id == R.id.Partner){
            fragment.beginTransaction().replace(R.id.content_navigation ,new sixthFragment()).commit();
        } else if (id == R.id.listadmin){
            fragment.beginTransaction().replace(R.id.content_navigation ,new adminFragment()).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

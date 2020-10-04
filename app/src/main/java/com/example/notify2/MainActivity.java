package com.example.notify2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;



import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.navmenu);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawyer);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

         nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                 switch (item.getItemId())
                 {
                     case R.id.menu_home :
                         Toast.makeText(MainActivity.this, "home Panel is open", Toast.LENGTH_SHORT).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.menu_call :
                         Toast.makeText(MainActivity.this, "call Panel is open", Toast.LENGTH_SHORT).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.menu_settings :
                         Toast.makeText(MainActivity.this, "setting Panel is open", Toast.LENGTH_SHORT).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;
                 }
                 return true;
             }
         });
    }
}
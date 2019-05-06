package com.an.thelegendcarsstore;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.an.thelegendcarsstore.Adapters.Bottom_Nav_Behavior;
import com.an.thelegendcarsstore.Main_Fragments.Cart_Fragment;
import com.an.thelegendcarsstore.Main_Fragments.Categories_Fragment;
import com.an.thelegendcarsstore.Main_Fragments.Home_Fragment;
import com.an.thelegendcarsstore.Main_Fragments.Rent_Fragment;
import com.an.thelegendcarsstore.Main_Fragments.Setting_Fragment;
import com.an.thelegendcarsstore.Main_Fragments.TestDrive_Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = findViewById(R.id.bottom_nav_bar);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) navigation.getLayoutParams();
        layoutParams.setBehavior(new Bottom_Nav_Behavior());
    }

    @Override
    protected void onStart() {
        super.onStart();
        loadFragment(new Home_Fragment());
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        fragment = new Home_Fragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.nav_categories:
                        fragment = new Categories_Fragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.nav_cart:
                        fragment = new Cart_Fragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.nav_rent:
                        fragment = new Rent_Fragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.nav_drive:
                        fragment = new TestDrive_Fragment();
                        loadFragment(fragment);
                        return true;

                    case R.id.nav_setting:
                        fragment = new Setting_Fragment();
                        loadFragment(fragment);
                        return true;
                    default:
                        fragment = new Home_Fragment();
                        loadFragment(fragment);
                        return true;
                }
            }
    };
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}

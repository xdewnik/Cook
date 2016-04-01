package com.jdstudio.cookingup;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.jdstudio.cookingup.adapter.TabAdapter;

public class MainActivity extends AppCompatActivity {

    private static final int LAYOUT = R.layout.main_activity; //основной лейаут

    private DrawerLayout drawerLayout;


    private ViewPager viewPager;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //указываем основной layout
        setTheme(R.style.AppYellow);//указываем тему
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);

        initToolbar();
        initNavigationView();
        initTabs();




    }

    private void initToolbar() {   //находим и инициализируем наш тулбар
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { //слушатель на нажатие по тубаровскому итему
                                               @Override
                                               public boolean onMenuItemClick(MenuItem menuItem) {
                                                   return false;
                                               }
                                           }
        );
        toolbar.inflateMenu(R.menu.menu);
    }

    private void initNavigationView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
    }


    private void initTabs() {    //иницализация наших табов
        viewPager =(ViewPager) findViewById(R.id.viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager); //связываем табы с вьюпеджером

    }

}

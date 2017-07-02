package com.example.user.googlemanpower.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Switch;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.example.user.googlemanpower.R;
import com.example.user.googlemanpower.adapter.PictureAdapter;

public class MainActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener,ViewPager.OnPageChangeListener{
    SliderLayout mDemoSlider;
    private GridView gridView;
    ActionBarDrawerToggle toggle;
    ImageView img_drawer;
    private CollapsingToolbarLayout collapsingToolbar;
    ViewPager viewPager;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
   PictureAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setAdapter(new PictureAdapter(this));

        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mDemoSlider=(SliderLayout)findViewById(R.id.slider);
        int[] ress=new int[3];
        ress[0]=R.drawable.slide1;
        ress[1]=R.drawable.slide2;
        ress[2]=R.drawable.slide3;
        for (int i = 0; i < ress.length; i++) {
            TextSliderView textSliderView = new TextSliderView(getApplicationContext());
            String name = "";
            textSliderView
                    .description(name)
                    .image(ress[i])
//                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);
            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setDuration(3000);
        mDemoSlider.setPresetTransformer("Default");

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        img_drawer=(ImageView)drawerLayout.findViewById(R.id.image_view);
        navigationView = (NavigationView)findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);
                switch (menuItem.getItemId()){
                    case R.id.Home1:
                        Intent intent=new Intent((MainActivity.this),MainActivity.class);
                        startActivity(intent);
                        return true;
                    case R.id.messages:
                        Intent intent4=new Intent(MainActivity.this, Message.class);
                        startActivity(intent4);
                        return true;

                    case R.id.Services:

                        Intent intent3=new Intent(MainActivity.this, Services.class);
                        startActivity(intent3);
                        return true;
                    case R.id.Proceduer:

                        Intent intent2=new Intent(MainActivity.this, Procedure.class);
                        startActivity(intent2);
                        return true;
                    case R.id.RecentJobs:
                        Intent intent5=new Intent(MainActivity.this,RecentJobs.class);

                        startActivity(intent5);
                        return true;
                    case R.id.Gallery:
                        Intent intent1=new Intent(MainActivity.this,Gallery.class);
                        startActivity(intent1);
                        return true;
                    case R.id.ContactUs:
                        Intent intent6=new Intent(MainActivity.this,ContactUs.class);
                        startActivity(intent6);

                }

                return false;
            }
        });
        toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.drawer_open, R.string.drawer_close) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle("");
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getSupportActionBar().setTitle("");

            }
        };
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

    }
//    @SuppressLint({"InflateParams","SetTextI18n"})
//    private void setGridViewHeaderAndFooter() {
//        LayoutInflater layoutInflater = LayoutInflater.from(this);
//        View headerView = layoutInflater.inflate(R.layout.staggered_gridview,gridView, false);
//        gridView.addHeaderView(headerView);
//        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) headerView.findViewById(R.id.collapsingToolbar);
//
//
//
//
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }
}

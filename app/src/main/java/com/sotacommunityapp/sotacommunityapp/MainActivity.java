package com.sotacommunityapp.sotacommunityapp;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


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

    public void radioButtonClick(View view) {
        startActivity(new Intent(MainActivity.this, RadioActivity.class));
    }

    public void wikiButtonClick(View view) {
        startActivity(new Intent(MainActivity.this, WikiActivity.class));
    }

    public void ircButtonClick(View view) {
        startActivity(new Intent(MainActivity.this, IrcActivity.class));
    }

    public void eventsButtonClick(View view) {
        startActivity(new Intent(MainActivity.this, EventsActivity.class));
    }

    public void calendarButtonClick(View view) {
        startActivity(new Intent(MainActivity.this, CalendarActivity.class));
    }

    public void newsButtonClick(View view) {
        startActivity(new Intent(MainActivity.this, NewsActivity.class));
    }


}
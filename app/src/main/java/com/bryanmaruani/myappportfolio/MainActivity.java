package com.bryanmaruani.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

    private void createToast(String name) {
        Toast.makeText(MainActivity.this, String.format(getString(R.string.button_click_toast), name), Toast.LENGTH_LONG).show();
    }

    public void showToast(View v) {
        int buttonClicked = v.getId();
        switch (buttonClicked) {
            case (R.id.firstAppButton):
                createToast(getString(R.string.firstAppName));
                break;
            case (R.id.secondAppButton):
                createToast(getString(R.string.secondAppName));
                break;
            case (R.id.thirdAppButton):
                createToast(getString(R.string.thirdAppName));
                break;
            case (R.id.fourthAppButton):
                createToast(getString(R.string.fourthAppName));
                break;
            case (R.id.fifthAppButton):
                createToast(getString(R.string.fifthAppName));
                break;
            case (R.id.sixthAppButton):
                createToast("Capstone");
                break;
        }
    }
}

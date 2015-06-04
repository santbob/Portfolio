package com.santhoshn.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

    public void showToast(String displayText) {
        Context context = getApplicationContext();
        CharSequence text = displayText;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 10, 30);
        toast.show();
    }

    public void buttonClicked(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.spotify_btn:
                showToast(getResources().getString(R.string.toast_spotify));
                break;
            case R.id.scores_app_btn:
                showToast(getResources().getString(R.string.toast_scores_app));
                break;
            case R.id.library_app_btn:
                showToast(getResources().getString(R.string.toast_library_app));
                break;
            case R.id.build_it_bigger_btn:
                showToast(getResources().getString(R.string.toast_build_it_bigger));
                break;
            case R.id.bacon_reader_btn:
                showToast(getResources().getString(R.string.toast_bacon_reader));
                break;
            case R.id.capstone_btn:
                showToast(getResources().getString(R.string.toast_capstone));
                break;
        }
    }
}

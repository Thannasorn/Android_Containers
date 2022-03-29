package com.example.containers_6206021611125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch ( item.getItemId()) {
            case R.id.Listview:
                Intent launchList = new Intent(MainActivity.this, Listview.class);
                startActivity(launchList);
                return true;
            case R.id.CustomListview:
                Intent launchCus = new Intent(MainActivity.this, CustomListview.class);
                startActivity(launchCus);
                return true;
            case R.id.Gridview:
                Intent launchGrid = new Intent(MainActivity.this, Gridview.class);
                startActivity(launchGrid);
                return true;
            case R.id.Webview:
                Intent launchWeb = new Intent(MainActivity.this, Webview.class);
                startActivity(launchWeb);
                return true;
            case R.id.Searchview:
                Intent launchSearch = new Intent(MainActivity.this, Searchview.class);
                startActivity(launchSearch);
                return true;
            case R.id.Exit:
                Toast.makeText(MainActivity.this, "Exit Program", Toast.LENGTH_SHORT).show();
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
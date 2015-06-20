package com.example.yukikayashima.movers_test03;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    ArrayAdapter<String> adapter;
    List<String> dataList = new ArrayList<String>();
    ListView listview;
    EditText editText;
    //int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listView);
        //adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                dataList
        );
    }

    public void plus(View v) {
        addStringData();
        listview.setAdapter(adapter);
        //num = num + 1;/
        //addNum();
    }

    private void addStringData() {
        editText = (EditText) findViewById(R.id.editText);
        adapter.add(editText.getText().toString());
        //adapter.add(String.valueOf(num));
    }

    /*
    private void addNum() {
        adapter.add(String.valueOf(num));
    }
    */

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
}

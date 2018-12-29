package com.androidcodr.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listViewSocial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewSocial = (ListView) findViewById(R.id.listview);

        String[] companies = new String[]{"Facebook", "Whatsapp", "YouTube", "Instagram", "Twitter", "Google+", "LinkedIn", "Pinterest", "Tumblr", "Flickr"};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, companies);

        listViewSocial.setAdapter(adapter);

        listViewSocial.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> l, View v, int position, long id) {
                String selected = l.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, selected, Toast.LENGTH_SHORT).show();
            }
        });


    }
}

package com.minich.multipleactivitiesdemo;

import android.support.v7.app.AppCompatActivity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity
{

    static final String[] CONFERENCES = new String[]{"AFC", "NFC"};

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CONFERENCES));
    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);

        Intent intent = null;

        if (position == 0)
        {
            intent = new Intent(this, AFC.class);
        }
        else if (position == 1)
        {
            intent = new Intent(this, NFC.class);
        }

        if (intent != null)
        {
            startActivity(intent);
        }

    }
}

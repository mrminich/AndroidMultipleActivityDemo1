package com.minich.multipleactivitiesdemo;

import android.support.v7.app.AppCompatActivity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NFC extends ListActivity
{
    static final String[] DIVISIONS = new String[]{"East", "West", "North", "South"};

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DIVISIONS));
    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);

        Intent intent = null;

        if (position == 0)
        {
            //intent = new Intent(this, NFCEast.class);
        }
        // add more else if clauses here

        if (intent != null)
        {
            startActivity(intent);
        }

    }

}

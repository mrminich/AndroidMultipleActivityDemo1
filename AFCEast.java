package com.minich.multipleactivitiesdemo;

import android.support.v7.app.AppCompatActivity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AFCEast extends ListActivity
{
    static final String[] TEAMS = new String[]{"Dolphins", "Patriots", "Jets", "Bills"};
    static final String[] URLS = new String[]{"http://www.nfl.com/teams/miamidolphins/profile?team=MIA", "http://www.nfl.com/teams/miamidolphins/profile?team=NE", "http://www.nfl.com/teams/miamidolphins/profile?team=NYJ", "http://www.nfl.com/teams/miamidolphins/profile?team=BUF"};

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, TEAMS));
    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(URLS[position]));

        if (intent != null)
        {
            startActivity(intent);
        }

    }

}

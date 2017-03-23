package com.tehah.notebook;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityListFragment extends ListFragment {

    @Override
    // Define what happens the moment the activity is created
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        // Create an array of data for our list
        String[] values = new String[]{"Red","Blue","Green","Orange","Violet",
                "Yellow","Pink","Grey","Black","Red","Blue","Green","Orange","Violet",
                "Yellow","Pink","Grey","Magenta"};

        // Basic Array Adapter
        // Use Androids ArrayAdapter to store the list. Constructor takes the activity that uses the
        // data, the layout that shows the data just some <XML>, and the actual data.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, values);

        // Tell the ListFragment to use the ArrayAdapter
        setListAdapter(adapter);
    }

    @Override
    // Handle what happens when a list item is clicked
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
    }
}

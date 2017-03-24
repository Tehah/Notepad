package com.tehah.notebook;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityListFragment extends ListFragment {

    private ArrayList<Note> notes;
    private NoteAdapter noteAdapter;


    @Override
    // Define what happens the moment the activity is created
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        notes = new ArrayList<Note>();
        notes.add(new Note("This is the Title", "This is a personal note.", Note.Category.PERSONAL));
        notes.add(new Note("This is the Title", "This is a finance note.", Note.Category.FINANCE));
        notes.add(new Note("This is the Title", "This is a quote note.", Note.Category.QUOTE));
        notes.add(new Note("This is the Title", "This is a technical note.", Note.Category.TECHNICAL));
        notes.add(new Note("This is the Title", "This is a long finance note. This is a long finance note. This is a long finance note. This is a long finance note.", Note.Category.FINANCE));
        notes.add(new Note("This is the Title", "This is a personal note.", Note.Category.PERSONAL));
        notes.add(new Note("This is the Title", "This is a finance note.", Note.Category.FINANCE));
        notes.add(new Note("This is the Title", "This is a quote note.", Note.Category.QUOTE));
        notes.add(new Note("This is the Title", "This is a technical note.", Note.Category.TECHNICAL));

        noteAdapter = new NoteAdapter(getActivity(), notes);

        setListAdapter(noteAdapter);

        // (Optional) how to add a dark divider between list view items
        // getListView().setDivider(ContextCompat.getDrawable(getActivity(), android.R.color.black));
        // getListView().setDividerHeight(1);

//        // Create an array of data for our list
//        String[] values = new String[]{"Red","Blue","Green","Orange","Violet",
//                "Yellow","Pink","Grey","Black","Red","Blue","Green","Orange","Violet",
//                "Yellow","Pink","Grey","Magenta"};
//
//        // Basic Array Adapter
//        // Use Androids ArrayAdapter to store the list. Constructor takes the activity that uses the
//        // data, the layout that shows the data just some <XML>, and the actual data.
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
//                android.R.layout.simple_list_item_1, values);
//
//        // Tell the ListFragment to use the ArrayAdapter
//        setListAdapter(adapter);
    }

    @Override
    // Handle what happens when a list item is clicked
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
    }
}

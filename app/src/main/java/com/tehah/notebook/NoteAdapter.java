package com.tehah.notebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vanessa on 3/24/2017.
 */

public class NoteAdapter extends ArrayAdapter<Note>{

    // ArrayAdapter needs context (Activity) to have access on creation of global app info
    public NoteAdapter(Context context, ArrayList<Note> notes){
        super(context, 0, notes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        // Get the data item from ArrayAdapter for this position
        Note note = getItem(position);

        // Check if an existing view is being reused, otherwise inflate a new view from custom row layout.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_row, parent, false);
        }

        // Grab references of views so we can populate them with specific note row data
        TextView noteTitle = (TextView) convertView.findViewById(R.id.listItemNoteTitle);
        TextView noteText = (TextView) convertView.findViewById(R.id.listItemNoteBody);
        ImageView noteIcon = (ImageView) convertView.findViewById(R.id.listItemNoteImg);

        // Fill each new referenced view with data associated with note it is referencing
        noteTitle.setText(note.getTitle());
        noteText.setText(note.getMessage());
        noteIcon.setImageResource(note.getAssociatedDrawable());

        // Now that we modified the view to display appropriate data,
        // return it so it will be displayed.
        return convertView;
    }
}

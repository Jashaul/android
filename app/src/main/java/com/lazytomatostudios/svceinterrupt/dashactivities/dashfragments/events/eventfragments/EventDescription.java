package com.lazytomatostudios.svceinterrupt.dashactivities.dashfragments.events.eventfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lazytomatostudios.svceinterrupt.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventDescription extends Fragment {


    public EventDescription() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_description, container, false);
    }

}

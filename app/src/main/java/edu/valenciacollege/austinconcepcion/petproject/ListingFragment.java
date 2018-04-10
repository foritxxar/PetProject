package edu.valenciacollege.austinconcepcion.petproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.valenciacollege.austinconcepcion.petproject.dummy.DummyContent;
import edu.valenciacollege.austinconcepcion.petproject.dummy.DummyContent.DummyItem;

import java.util.List;

public class ListingFragment extends Fragment {

    private int mColumnCount = 1;

    public ListingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listing_list, container, false);

        return view;
    }

}

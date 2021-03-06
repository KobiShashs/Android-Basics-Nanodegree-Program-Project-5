package com.example.android.tourguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class AcademicFragment extends Fragment {

    public AcademicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_academic, container, false);

        final ArrayList<CellItem> items = new ArrayList<CellItem>();
        items.add(new CellItem(getString(R.string.academic_value_1), getString(R.string.academic_value), R.drawable.ic_school_black_24dp));
        items.add(new CellItem(getString(R.string.academic_value_2), getString(R.string.academic_value), R.drawable.ic_school_black_24dp));

        CellAdapter adapter = new CellAdapter(getActivity(), items, R.color.category_colors);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext().getApplicationContext(), String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

}

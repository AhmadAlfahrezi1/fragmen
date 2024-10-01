package com.example.tugasfragmen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView listView; // Declare the ListView
    private ArrayAdapter<CharSequence> adapter;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        listView = view.findViewById(R.id.List); // Initialize the ListView
        adapter = ArrayAdapter.createFromResource(getActivity(), R.array.nama_mhs, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter); // Set the adapter
        listView.setOnItemClickListener(this); // Set the item click listener

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // Handle item click event
        String selectedItem = (String) parent.getItemAtPosition(position);
        Toast.makeText(getActivity(), "Selected: " + selectedItem, Toast.LENGTH_SHORT).show();
        // You can also navigate to another activity or fragment here if needed
    }
}

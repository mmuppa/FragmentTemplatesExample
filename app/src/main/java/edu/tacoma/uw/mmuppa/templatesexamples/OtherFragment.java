package edu.tacoma.uw.mmuppa.templatesexamples;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass. Use the {@link } factory method to
 * create an instance of this fragment.
 */
public class OtherFragment extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public static final String ARG_NAME = "name";

    private String mName;

    public OtherFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mName = getArguments().getString(ARG_NAME);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_other, container, false);
        TextView nameTextView = v.findViewById(R.id.other_text_view_id);
        nameTextView.setText(mName);
        getActivity().setTitle("Display Name");

        return v;
    }
}
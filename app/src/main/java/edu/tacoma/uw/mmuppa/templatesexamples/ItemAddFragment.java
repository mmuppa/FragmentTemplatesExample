package edu.tacoma.uw.mmuppa.templatesexamples;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ItemAddFragment#} factory method to
 * create an instance of this fragment.
 */
public class ItemAddFragment extends Fragment {

    private ItemAddFragmentListener mListener;

    public interface ItemAddFragmentListener {
        void launchOtherFragment(String name);
    }
    public ItemAddFragment() {
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
        View v = inflater.inflate(R.layout.fragment_item_add, container, false);
        final EditText nameEditText = v.findViewById(R.id.name_edit_text_id);
        Button clickButton = v.findViewById(R.id.click_button_id);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mListener = (ItemAddFragmentListener) getActivity();
               mListener.launchOtherFragment(nameEditText.getText().toString());
            }
        });
        return v;
    }
}
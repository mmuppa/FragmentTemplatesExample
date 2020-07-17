package edu.tacoma.uw.mmuppa.templatesexamples;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class ItemAddActivity extends AppCompatActivity
                            implements ItemAddFragment.ItemAddFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_add);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_add_container, new ItemAddFragment())
                .commit();

    }

    @Override
    public void launchOtherFragment(String name) {
        OtherFragment otherFragment = new OtherFragment();
        Bundle args = new Bundle();
        args.putString(OtherFragment.ARG_NAME, name);
        otherFragment.setArguments(args);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_add_container, otherFragment)
                .addToBackStack(null)
                .commit();
    }
}
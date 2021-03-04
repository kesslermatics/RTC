package com.example.kurs1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.support.v4.app.*;

public class TestFragment extends Fragment {

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @org.jetbrains.annotations.NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_test, container, false);

        Spinner spinnerTime = (Spinner) v.findViewById(R.id.spinner_time);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapterTime = ArrayAdapter.createFromResource(getContext(),
                R.array.time_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapterTime.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerTime.setAdapter(adapterTime);

        Spinner spinnerCoffee = (Spinner) v.findViewById(R.id.spinner_coffee);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapterCoffee = ArrayAdapter.createFromResource(getContext(),
                R.array.coffee_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapterCoffee.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerCoffee.setAdapter(adapterCoffee);


        return v;
    }


}

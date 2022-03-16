package com.example.insense.ui.fragments.Main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.insense.R;
import com.example.insense.databinding.FragmentMainBinding;
/*import com.example.insense.databinding.FragmentMainBindingImpl;*/
import com.example.insense.ui.fragments.Binding.BindingFragment;

public class MainFragment extends Fragment {

    private FragmentMainBinding fragmentMainBinding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentMainBinding = FragmentMainBinding.inflate(inflater, container, false);
        fragmentMainBinding.buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(MainFragment.this).navigate(R.id.action_mainFragment_to_settingsFragment);
            }
        });
        return fragmentMainBinding.getRoot();
    }
}
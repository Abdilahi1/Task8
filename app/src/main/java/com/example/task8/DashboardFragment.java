package com.example.task8;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;



public class DashboardFragment extends Fragment {
    private SharedViewModel sharedViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        TextView sharedDataTextView = view.findViewById(R.id.text_shared_data);

        sharedViewModel.getData().observe(getViewLifecycleOwner(), sharedDataTextView::setText);
        return view;
    }
}

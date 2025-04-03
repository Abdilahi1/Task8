package com.example.task8;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class UserFragment extends Fragment {
    private SharedViewModel sharedViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        Button sendDataBtn = view.findViewById(R.id.btn_send_data);
        sendDataBtn.setOnClickListener(v -> sharedViewModel.setData("User data shared successfully!"));

        return view;
    }
}

package com.simplifiededtech.iplmatchlivescore.match;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.simplifiededtech.iplmatchlivescore.R;
import com.simplifiededtech.iplmatchlivescore.databinding.FragmentScheduleBinding;

import java.util.ArrayList;

public class ScheduleFragment extends Fragment {

    private FragmentScheduleBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentScheduleBinding.inflate(inflater, container, false);


        View root = binding.getRoot();
        RecyclerView recyclerView = root.findViewById(R.id.recyler_schedule);

        ArrayList<ScheduleModel> list = new ArrayList<>();

        ScheduleAdapter adapter = new ScheduleAdapter(list, getContext());
        recyclerView.setAdapter(adapter);


       LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        list.add(new ScheduleModel("https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png",
                "https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png","team1",
                "team2","September 19th 2021"));
        list.add(new ScheduleModel("https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png",
                "https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png","team1",
                "team2","September 19th 2021"));



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
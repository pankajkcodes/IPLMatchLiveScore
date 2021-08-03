package com.simplifiededtech.iplmatchlivescore.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.simplifiededtech.iplmatchlivescore.R;
import com.simplifiededtech.iplmatchlivescore.match.ScheduleAdapter;
import com.simplifiededtech.iplmatchlivescore.match.ScheduleModel;

import java.util.ArrayList;


public class NewsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_news);

        ArrayList<NewsModel> list = new ArrayList<>();

        NewsAdapter adapter = new NewsAdapter(list, getContext());
        recyclerView.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        list.add(new NewsModel("https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png","There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library.",
                "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library."));
   list.add(new NewsModel("https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png","There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library.",
                "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library."));
   list.add(new NewsModel("https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png","There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library.",
                "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library."));



        return view;
    }
}
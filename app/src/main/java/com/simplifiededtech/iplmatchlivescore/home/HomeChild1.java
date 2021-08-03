package com.simplifiededtech.iplmatchlivescore.home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.simplifiededtech.iplmatchlivescore.R;

import java.util.ArrayList;

public class HomeChild1 extends Fragment {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_child1, container, false);

        //<-------------------- For Live Score || WebView ----------------------->//
        WebView webView = view.findViewById(R.id.web_view1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.iplt20.com/");
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });


        // <-------------------- For News  || Recycler View----------------------->//
        RecyclerView recyclerView = view.findViewById(R.id.recycler_news1);
        ArrayList<NewsModel> list = new ArrayList<>();
        NewsAdapter adapter = new NewsAdapter(list, getContext());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        list.add(new NewsModel("https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png", "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library.",
                "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library."));
        list.add(new NewsModel("https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png", "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library.",
                "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library."));
        list.add(new NewsModel("https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png", "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library.",
                "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library."));
 list.add(new NewsModel("https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png", "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library.",
                "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library."));
        list.add(new NewsModel("https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png", "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library.",
                "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library."));
        list.add(new NewsModel("https://www.iplt20.com/resources/v4.24.0/i/sprites/tLogo158x-sprite.png", "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library.",
                "There are also some alternative libraries like Volley. I already a published a tutorial about Using Android Volley Library to Load Image From Internet. In this post we will learn about picasso android library."));


        return view;
    }
}
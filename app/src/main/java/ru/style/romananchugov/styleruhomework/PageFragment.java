package ru.style.romananchugov.styleruhomework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by romananchugov on 18.12.2017.
 */

public class PageFragment extends android.support.v4.app.Fragment {
    public static android.support.v4.app.Fragment newInstance(int page){
        Log.e("TAG", "newInstance");
        PageFragment pageFragment = new PageFragment();
        return pageFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e("TAG", "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.e("TAG", "onCreateView");
        View view = inflater.inflate(R.layout.fragment,container);
        TextView text = view.findViewById(R.id.page_content);
        text.setText("page whoaaaa");
        return view;
    }
}

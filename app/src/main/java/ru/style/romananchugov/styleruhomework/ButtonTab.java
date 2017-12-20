package ru.style.romananchugov.styleruhomework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by romananchugov on 20.12.2017.
 */

public class ButtonTab extends Fragment {
    private RecyclerView recyclerView;
    public static final int BUTTON_COUNT = 30;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_button_tab, container, false);

        recyclerView = view.findViewById(R.id.recycler_button_tab);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(new RecyclerAdapter());

        return view;
    }
    private class RecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter<RecyclerViewHolder>{

        @Override
        public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.button_layout, parent, false);
            return new RecyclerViewHolder(v);
        }

        @Override
        public void onBindViewHolder(RecyclerViewHolder holder, int position) {
            holder.button.setText(position + "");
        }

        @Override
        public int getItemCount() {
            return BUTTON_COUNT;
        }
    }
    private class RecyclerViewHolder extends RecyclerView.ViewHolder{

        private Button button;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            button = (Button)itemView;
        }

    }
}

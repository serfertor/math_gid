package com.example.math_gid.ui.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.math_gid.viewmodel.RVViewModel;
import com.example.math_gid.R;

public class ResultRecyclerFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result_recycler, container, false);
        RVViewModel lvViewModel = ViewModelProviders.of(getActivity()).get(RVViewModel.class);
        String answer = lvViewModel.getMove().getValue();
        ImageView image = (ImageView) view.findViewById(R.id.imageresult);
        TextView textView = (TextView) view.findViewById(R.id.recyclerInput);
        textView.setText(answer);
        image.setImageResource(getActivity().getResources().getIdentifier(lvViewModel.getMovePic().getValue(), "drawable", getActivity().getPackageName()));
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

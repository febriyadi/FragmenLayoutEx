package com.f55121082.fragmenlayoutex;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentHome extends Fragment {
    View view;
    public FragmentHome(){
    }

    @Nullable
    @Override
    public  View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle SavedinstantanceStates) {
        view = inflater.inflate(R.layout.home_fragment,container, false);
        return view;
    }
}

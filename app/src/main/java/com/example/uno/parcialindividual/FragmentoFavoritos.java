package com.example.uno.parcialindividual;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

public class FragmentoFavoritos extends Fragment{

    View v;

    public FragmentoFavoritos(){
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        v = inflater.inflate(R.layout.fragmento_favoritos, container, false);
        return v;
    }
}

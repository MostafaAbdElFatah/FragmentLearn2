package com.mostafaabdel_fatah.fragmentlearn2;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Mostafa AbdEl_Fatah on 9/4/2017.
 */

public class HeadlineFragment extends Fragment {


    ListView listView;
    String[] languages;
    ArrayAdapter<String> arrayAdapter;
    OnHeadlineClickedListener onHeadlineClickedListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.headline_fragment_layout,container , false );
        listView = (ListView) view.findViewById(R.id.headline);
        languages = getResources().getStringArray(R.array.languages);
        arrayAdapter = new ArrayAdapter<String>(getActivity(),R.layout.item_listview,R.id.headlineItem,languages);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String text = languages[i];
                onHeadlineClickedListener.onHeadlineClicked(text);
            }
        });
        return  view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        onHeadlineClickedListener = (OnHeadlineClickedListener) activity;
    }

    public  interface OnHeadlineClickedListener {
        void onHeadlineClicked(String text);
    }
}

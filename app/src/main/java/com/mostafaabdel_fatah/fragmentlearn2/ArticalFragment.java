package com.mostafaabdel_fatah.fragmentlearn2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Mostafa AbdEl_Fatah on 9/4/2017.
 */

public class ArticalFragment extends Fragment {

    TextView artical;
    TextView articalHeadline;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.artical_fragment,container , false );
        articalHeadline = (TextView) view.findViewById(R.id.articalHeadline);
        artical = (TextView) view.findViewById(R.id.artical);

        return  view;
    }


    public  void updateArtical(String text){
        artical.setText(text);
    }

    public  void updateArticalHeadline(String text){
        articalHeadline.setText(text);
    }

}


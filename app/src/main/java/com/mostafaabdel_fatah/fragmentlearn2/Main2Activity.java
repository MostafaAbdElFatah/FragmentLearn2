package com.mostafaabdel_fatah.fragmentlearn2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String text ;
        Intent intent = getIntent();
        text = intent.getStringExtra("headline");
        ArticalFragment articalFragment = (ArticalFragment) getFragmentManager().
                findFragmentById(R.id.activity2_artical_fragment);
        articalFragment.updateArticalHeadline(text);
        for (int i =0 ; i < 10 ; i++)
            text += text + "\n";
        articalFragment.updateArtical(text);
    }
}

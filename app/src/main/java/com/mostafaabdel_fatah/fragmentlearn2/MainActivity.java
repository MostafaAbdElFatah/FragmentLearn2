package com.mostafaabdel_fatah.fragmentlearn2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements HeadlineFragment.OnHeadlineClickedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onHeadlineClicked(String text) {
        ArticalFragment articalFragment = (ArticalFragment) getFragmentManager().
                findFragmentById(R.id.artical_fragment);
        if (articalFragment == null){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("headline",text);
            startActivity(intent);
        }else {
            articalFragment.updateArticalHeadline(text);
            for (int i = 0 ; i < 5 ; i++)
                text += text + "\n";
            articalFragment.updateArtical(text);
        }
    }
}

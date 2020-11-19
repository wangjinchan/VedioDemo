package com.example.vediodemo;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
//自定义标题栏
public class TittleLayout extends LinearLayout {
    Button mBack;
    Button mText;
    public TittleLayout(final Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        mBack=findViewById(R.id.titleBack);
        mText=findViewById(R.id.titleEdit);
        mBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        mText.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"haha",Toast.LENGTH_SHORT).show();
            }
        });

    }

}

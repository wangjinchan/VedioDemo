package com.example.vediodemo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.MediaController;

import java.util.Objects;

//播放网络视频
public class MainActivity extends AppCompatActivity {

    VideoView mVideoNet;
    Button mBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).hide();//隐藏标题栏
        }
        setContentView(R.layout.activity_main);
        mVideoNet=findViewById(R.id.video_net);
        mBack=findViewById(R.id.titleBack);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initNetVideo();
    }

    //播放网络视频
    private void initNetVideo() {
        //设置有进度条可以拖动快进
        MediaController localMediaController = new MediaController(this);
        mVideoNet.setMediaController(localMediaController);
        String url = "http://192.168.1.127:8083/PersonalHomePage/chat/20201119110109.mp4";/*这里是服务器的地址，前提是PersonalHomePage这个文件夹必须得通过
        URL访问得到，也就是说这个文件夹要挂在服务器上*/
        mVideoNet.setVideoPath(url);
        mVideoNet.start();
    }

}


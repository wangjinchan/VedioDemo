package com.example.vediodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;
//播放网络视频
public class MainActivity extends AppCompatActivity {

    VideoView mVideoNet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoNet=findViewById(R.id.video_net);
        initNetVideo();
    }

    //播放网络视频
    private void initNetVideo() {
        //设置有进度条可以拖动快进
        MediaController localMediaController = new MediaController(this);
        mVideoNet.setMediaController(localMediaController);
        String url = "http://192.168.1.127:8083/PersonalHomePage/20201119110109.mp4";/*这里是服务器的地址，前提是PersonalHomePage这个文件夹必须得通过
        URL访问得到，也就是说这个文件夹要挂在服务器上*/
        mVideoNet.setVideoPath(url);
        mVideoNet.start();
    }
}


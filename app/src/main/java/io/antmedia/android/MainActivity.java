package io.antmedia.android;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.antmedia.android.liveVideoBroadcaster.*;
import io.antmedia.android.liveVideoPlayer.LiveVideoPlayerActivity;

public class MainActivity extends AppCompatActivity {

    /**
     * PLEASE WRITE RTMP BASE URL of the your RTMP SERVER.
     */
    public static final String RTMP_BASE_URL = "rtmp://tv.qtune.io/live?e=YmxscFFqTmtabVJaUlRkWlkyMUdOMUZSYm5KcU55c3phaXRFUTFOSlMwOVBOM2RwTWxJeVdFVlpiVFJWVEdoRWEybFJXRnA0Wm5OR05GSjRablZrYmc9PQ&webSiteRootURL=aHR0cHM6Ly90di5xdHVuZS5pby8/61c51328de25a-1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(io.antmedia.android.liveVideoBroadcaster.R.layout.activity_main);
    }

    public void openVideoBroadcaster(View view) {
        Intent i = new Intent(this, LiveVideoBroadcasterActivity.class);
        startActivity(i);
    }

    public void openVideoPlayer(View view) {
        Intent i = new Intent(this, LiveVideoPlayerActivity.class);
        startActivity(i);
    }
}

package apprtc.nan.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bind widget
        bindWidget();
        //Button Controller
        buttonController();
        //LisView Controller
        ListViewController();


    } // Main Method

    private void ListViewController() {
        //For Icon
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05,R.drawable.traffic_06,
        R.drawable.traffic_07,R.drawable.traffic_08,
                R.drawable.traffic_09,R.drawable.traffic_10,
                R.drawable.traffic_11,R.drawable.traffic_12,
                R.drawable.traffic_13,R.drawable.traffic_14,
                R.drawable.traffic_15,R.drawable.traffic_16,
                R.drawable.traffic_17,R.drawable.traffic_18,
                R.drawable.traffic_19,R.drawable.traffic_20};
        //For Title
        String[] titleString = new String[20];
        titleString[0] = "หัวข้อที่ 1";
        titleString[1] = "หัวข้อที่ 2";
        titleString[2] = "หัวข้อที่ 3";
        titleString[3] = "หัวข้อที่ 4";
        titleString[4] = "หัวข้อที่ 5";
        titleString[5] = "หัวข้อที่ 6";
        titleString[6] = "หัวข้อที่ 7";
        titleString[7] = "หัวข้อที่ 8";
        titleString[8] = "หัวข้อที่ 9";
        titleString[9] = "หัวข้อที่ 10";
        titleString[10] = "หัวข้อที่ 11";
        titleString[11] = "หัวข้อที่ 12";
        titleString[12] = "หัวข้อที่ 13";
        titleString[13] = "หัวข้อที่ 14";
        titleString[14] = "หัวข้อที่ 15";
        titleString[15] = "หัวข้อที่ 16";
        titleString[16] = "หัวข้อที่ 17";
        titleString[17] = "หัวข้อที่ 18";
        titleString[18] = "หัวข้อที่ 19";
        titleString[19] = "หัวข้อที่ 20";
        //For Detail
        String[] detailString = getResources().getStringArray(R.array.detail_short);

        MyAdpter objMyAdpter = new MyAdpter(MainActivity.this, titleString, detailString, intIcon);
        trafficListView.setAdapter(objMyAdpter);
    }   //ListViewController

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.cat);
                buttonMediaPlayer.start();
                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/xLA-q_z14oA"));
                startActivity(objIntent);
            } // event
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }

} // Main Class นี่คือคลาสหลัก

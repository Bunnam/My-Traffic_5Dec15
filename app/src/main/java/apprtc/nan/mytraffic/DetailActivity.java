package apprtc.nan.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //Explict
    private TextView titleTextView, detailTextView;
    private ImageView trafImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Show View
        showView();


    } // Main Method

    private void showView() {
        //Receive Value From Intent
        String StrTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        int intIndex = getIntent().getIntExtra("Index", 0);

        titleTextView.setText(StrTitle);
        trafImageView.setImageResource(intIcon);

    }

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        trafImageView = (ImageView) findViewById(R.id.imageView2);
    }

}  // Main Class

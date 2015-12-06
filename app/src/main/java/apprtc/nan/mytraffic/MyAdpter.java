package apprtc.nan.mytraffic;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

/**
 * Created by com on 6/12/2558.
 */
public class MyAdpter extends BaseAdapter {

    //Explicit
    private Context objContext;
    private String[] titleStrings, detalStrings;
    private int[] iconInts;

    public MyAdpter(Context objContext, String[] titleStrings, String[] detalStrings, int[] iconInts) {
        this.objContext = objContext;
        this.titleStrings = titleStrings;
        this.detalStrings = detalStrings;
        this.iconInts = iconInts;
    } // Constructor


    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        //Open Service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.my_listview, viewGroup, false);
        //Setup TextView
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[1]);
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
        detailTextView.setText(detalStrings[i]);

        //Set Image
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);
        
        return view1;
    }
}   // Main Class

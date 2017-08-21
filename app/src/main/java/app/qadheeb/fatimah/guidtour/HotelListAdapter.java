package app.qadheeb.fatimah.guidtour;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by fatimah on 8/21/17.
 */
public class HotelListAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater = null;
    private ArrayList<HotelObjects> hotelObjects;

    public HotelListAdapter(Context context, ArrayList<HotelObjects> hotelObjects) {
        this.context = context;
        this.hotelObjects = hotelObjects;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return hotelObjects.size();
    }
    @Override
    public Object getItem(int position) {
        return hotelObjects.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View listView, ViewGroup parent) {
        View view = listView;
        if (view == null)
            view = inflater.inflate(R.layout.list_item_row_2, null);
        TextView title = (TextView) view.findViewById(R.id.hotel_name);
        TextView subTitle = (TextView) view.findViewById(R.id.sub_title_hotel);
        ImageView restaurantImg = (ImageView) view.findViewById(R.id.hotel_img);
        title.setText(hotelObjects.get(position).getHotelName());
        subTitle.setText(hotelObjects.get(position).getHotelStar());
        restaurantImg.setImageResource(hotelObjects.get(position).getHotelImg());
        return view;
    }
}

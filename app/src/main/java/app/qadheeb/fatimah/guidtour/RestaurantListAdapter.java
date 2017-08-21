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
 * Created by fatimah on 8/12/17.
 */
public class RestaurantListAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater = null;
    private ArrayList<RestaurantObjects> restaurantObjectses;

    public RestaurantListAdapter(Context context, ArrayList<RestaurantObjects> restaurantObjectses) {
        this.context = context;
        this.restaurantObjectses = restaurantObjectses;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return restaurantObjectses.size();
    }
    @Override
    public Object getItem(int position) {
        return restaurantObjectses.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View listView, ViewGroup parent) {
        View view = listView;
        if (view == null)
            view = inflater.inflate(R.layout.list_item_row, null);
        TextView title = (TextView) view.findViewById(R.id.title);
        TextView subTitle = (TextView) view.findViewById(R.id.sub_title);
        ImageView restaurantImg = (ImageView) view.findViewById(R.id.logo_image);
        title.setText(restaurantObjectses.get(position).getRestaurantName());
        subTitle.setText(restaurantObjectses.get(position).getRestaurantType());
        restaurantImg.setImageResource(restaurantObjectses.get(position).getRestaurantImg());
        return view;
    }
}

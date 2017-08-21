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
 * Created by fatimah on 8/19/17.
 */
public class ShoppingListAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater = null;
    private ArrayList<ShoppingObjects> shoppingObjects;

    public ShoppingListAdapter(Context context, ArrayList<ShoppingObjects> shoppingObjects) {
        this.context = context;
        this.shoppingObjects = shoppingObjects;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return shoppingObjects.size();
    }
    @Override
    public Object getItem(int position) {
        return shoppingObjects.get(position);
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
        ImageView shoppingImg = (ImageView) view.findViewById(R.id.logo_image);
        title.setText(shoppingObjects.get(position).getShoppingName());
        subTitle.setText(shoppingObjects.get(position).getShoppingLocation());
        shoppingImg.setImageResource(shoppingObjects.get(position).getShoppingImg());
        return view;
    }
}

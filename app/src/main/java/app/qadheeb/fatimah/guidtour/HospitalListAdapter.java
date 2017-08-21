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
public class HospitalListAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater = null;
    private ArrayList<HospitalObjects> hospitalObjects;
    public HospitalListAdapter(Context context, ArrayList<HospitalObjects> hospitalObjects) {
        this.context = context;
        this.hospitalObjects = hospitalObjects;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return hospitalObjects.size();
    }
    @Override
    public Object getItem(int position) {
        return hospitalObjects.get(position);
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
        ImageView hospitalImg = (ImageView) view.findViewById(R.id.logo_image);
        title.setText(hospitalObjects.get(position).getHospitalName());
        subTitle.setText(hospitalObjects.get(position).getHospitalType());
        hospitalImg.setImageResource(hospitalObjects.get(position).getHospitalImg());
        return view;
    }
}

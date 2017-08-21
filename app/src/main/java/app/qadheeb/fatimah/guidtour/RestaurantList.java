package app.qadheeb.fatimah.guidtour;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;
public class RestaurantList extends AppCompatActivity {
    private ArrayList<RestaurantObjects> restaurantList;
    private String name;
    private String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        restaurantList = new ArrayList<>();
        String[] sizeArray = getResources().getStringArray(R.array.restaurant_names);
        int[] restaurantImg = {R.drawable.britain, R.drawable.china, R.drawable.italy, R.drawable.gulf};
        for (int i = 0; i < sizeArray.length; i++) {
            name = getResources().getStringArray(R.array.restaurant_names)[i];
            type = getResources().getStringArray(R.array.restaurant_type)[i];
            restaurantList.add(new RestaurantObjects(restaurantImg[i], name, type));
        }
        ListView restaurantListView = (ListView) findViewById(R.id.list_view);
        restaurantListView.setAdapter(new RestaurantListAdapter(this, restaurantList));
    }
}

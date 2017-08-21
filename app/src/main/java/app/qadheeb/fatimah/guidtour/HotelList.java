package app.qadheeb.fatimah.guidtour;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;
/**
 * Created by fatimah on 8/21/17.
 */
public class HotelList extends AppCompatActivity {
    private ArrayList<HotelObjects> hotelList;
    private String hotelName;
    private String hotelStar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        hotelList = new ArrayList<>();
        String[] sizeArray = getResources().getStringArray(R.array.hotel_names);
        int[] hotelImg = {R.drawable.alahsa_intercontinental, R.drawable.coralalahsa_hotel, R.drawable.grand_lily_hotel_suites, R.drawable.garden_plaza_hotel};
        for (int i = 0; i < sizeArray.length; i++) {
            hotelName = getResources().getStringArray(R.array.hotel_names)[i];
            hotelStar = getResources().getStringArray(R.array.star_rating)[i];
            hotelList.add(new HotelObjects(hotelImg[i], hotelName, hotelStar));
        }
        ListView hotelListView = (ListView) findViewById(R.id.list_view);
        hotelListView.setAdapter(new HotelListAdapter(this, hotelList));
    }
}

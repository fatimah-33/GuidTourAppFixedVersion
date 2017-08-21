package app.qadheeb.fatimah.guidtour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;
/**
 * Created by fatimah on 8/21/17.
 */
public class HospitalList extends AppCompatActivity {
    private ArrayList<HospitalObjects> hospitalList;
    private String hospitalName;
    private String hospitalType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        hospitalList = new ArrayList<>();
        String[] sizeArray = getResources().getStringArray(R.array.hospital_names);
        int[] hospitalImg = {R.drawable.red_hospital, R.drawable.blue_hospital, R.drawable.green_hospital, R.drawable.purple_hospital};
        for (int i = 0; i < sizeArray.length; i++) {
            hospitalName = getResources().getStringArray(R.array.hospital_names)[i];
            hospitalType = getResources().getStringArray(R.array.hospital_type)[i];
            hospitalList.add(new HospitalObjects(hospitalImg[i], hospitalName, hospitalType));
        }
        ListView hospitalListView = (ListView) findViewById(R.id.list_view);
        hospitalListView.setAdapter(new HospitalListAdapter(this, hospitalList));
    }
}

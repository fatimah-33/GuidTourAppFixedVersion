package app.qadheeb.fatimah.guidtour;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
/**
 * Created by fatimah on 8/19/17.
 */
public class ShoppingList extends AppCompatActivity {
    private ArrayList<ShoppingObjects> shoppingList;
    private String shoppingName;
    private String shoppingLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        shoppingList = new ArrayList<>();
        String[] arraySize = getResources().getStringArray(R.array.shopping_names);
        int[] shoppingImg = {R.drawable.red_bag, R.drawable.blue_bag, R.drawable.green_bag, R.drawable.purple_bag};
        for (int i = 0; i < arraySize.length; i++) {
            shoppingName = getResources().getStringArray(R.array.shopping_names)[i];
            shoppingLocation = getResources().getStringArray(R.array.shopping_location)[i];
            shoppingList.add(new ShoppingObjects(shoppingImg[i], shoppingName, shoppingLocation));
        }
        ListView shoppingListView = (ListView) findViewById(R.id.list_view);
        shoppingListView.setAdapter(new ShoppingListAdapter(this, shoppingList));
    }
}

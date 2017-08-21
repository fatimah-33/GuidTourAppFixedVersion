package app.qadheeb.fatimah.guidtour;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void onClick(View view){
        switch(view.getId()){
            case R.id.hospital_btn:
                Intent hospitalIntent = new Intent(MainActivity.this, HospitalList.class);
                startActivity(hospitalIntent);
                break;
            case R.id.hotel_btn:
                Intent hoteIntent = new Intent(MainActivity.this, HotelList.class);
                startActivity(hoteIntent);
                break;case R.id.restaurant_btn:
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantList.class);
                startActivity(restaurantIntent);
                break;case R.id.shopping_btn:
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingList.class);
                startActivity(shoppingIntent);
                break;
        }
    }
}

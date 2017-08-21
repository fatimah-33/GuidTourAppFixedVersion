package app.qadheeb.fatimah.guidtour;
/**
 * Created by fatimah on 8/18/17.
 */
public class RestaurantObjects {
    private String restaurantName;
    private String restaurantType;
    private int restaurantImg;
    public RestaurantObjects(int restaurantImg, String restaurantName, String restaurantType) {
        this.restaurantName = restaurantName;
        this.restaurantType = restaurantType;
        this.restaurantImg = restaurantImg;
    }
    public String getRestaurantName() {
        return restaurantName;
    }
    public String getRestaurantType() {
        return restaurantType;
    }
    public int getRestaurantImg() {
        return restaurantImg;
    }
}

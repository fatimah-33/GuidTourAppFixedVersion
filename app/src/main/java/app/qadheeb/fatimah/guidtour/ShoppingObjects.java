package app.qadheeb.fatimah.guidtour;
/**
 * Created by fatimah on 8/19/17.
 */
public class ShoppingObjects {
    private String shoppingName;
    private String shoppingLocation;
    private int shoppingImg;
    public ShoppingObjects(int shoppingImg, String shoppingName, String shoppingLocation) {
        this.shoppingName = shoppingName;
        this.shoppingLocation = shoppingLocation;
        this.shoppingImg = shoppingImg;
    }
    public String getShoppingName() {
        return shoppingName;
    }
    public String getShoppingLocation() {
        return shoppingLocation;
    }
    public int getShoppingImg() {
        return shoppingImg;
    }
}

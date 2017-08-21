package app.qadheeb.fatimah.guidtour;
/**
 * Created by fatimah on 8/20/17.
 */
public class HotelObjects {
    private String hotelName;
    private String hotelStar;
    private int hotelImg;
    public HotelObjects(int hotelImg, String hotelName, String hotelStar) {
        this.hotelName = hotelName;
        this.hotelStar = hotelStar;
        this.hotelImg = hotelImg;
    }
    public String getHotelName() {
        return hotelName;
    }

    public String getHotelStar() {
        return hotelStar;
    }

    public int getHotelImg() {
        return hotelImg;
    }
}

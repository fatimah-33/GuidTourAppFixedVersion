package app.qadheeb.fatimah.guidtour;
/**
 * Created by fatimah on 8/20/17.
 */
public class HospitalObjects {
    private String hospitalName;
    private String hospitalType;
    private int hospitalImg;
    public HospitalObjects(int hospitalImg, String hospitalName, String hospitalType) {
        this.hospitalName = hospitalName;
        this.hospitalType = hospitalType;
        this.hospitalImg = hospitalImg;
    }
    public String getHospitalName() {
        return hospitalName;
    }
    public String getHospitalType() {
        return hospitalType;
    }
    public int getHospitalImg() {
        return hospitalImg;
    }
}

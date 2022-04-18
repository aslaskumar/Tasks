package services;

public class L_std {




    int std_id;
    String std_Name;
    String city;
    String std_status;


    public int getstd_id(int anInt) {
        return std_id;
    }

    public void setstd_id(int std_id) {
        this.std_id = std_id;
    }

    public String getstd_Name() {
        return std_Name;
    }

    public void setstd_Name(String std_Name) {
        this.std_Name = std_Name;
    }

    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public String getstd_status() {
        return std_status;
    }

    public void setstd_status(String std_status) {
        this.std_status = std_status;
    }
}

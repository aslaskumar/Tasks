package services;

public class L_suplier_dtls {

    int sup_id;
    String sup_Name;
    String address;
    int phone;
    String mail;


    public int getsup_id(int anInt) {
        return sup_id;
    }

    public void setsup_id(int sup_id) {
        this.sup_id = sup_id;
    }

    public String getsup_Name() {
        return sup_Name;
    }

    public void setsup_Name(String sup_Name) {
        this.sup_Name = sup_Name;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public int getphone(int anInt) {
        return phone;
    }

    public void setphone(int phone) {
        this.phone = phone;
    }

    public String getmail() {
        return mail;
    }

    public void setmail(String mail) {
        this.mail = mail;
    }
}
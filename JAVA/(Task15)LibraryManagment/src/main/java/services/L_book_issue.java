package services;

public class L_book_issue {


    int issue_no;
    int std_id;
    String code;
    String fine_range;


    public int getissue_no(int anInt) {
        return issue_no;
    }

    public void setissue_no(int issue_no) {
        this.issue_no = issue_no;
    }

    public int getstd_id(int anInt) {
        return std_id;
    }

    public void setstd_id(int std_id) {
        this.std_id = std_id;
    }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public String getfine_range() {
        return fine_range;
    }

    public void setfine_range(String fine_range) {
        this.fine_range = fine_range;
    }



}

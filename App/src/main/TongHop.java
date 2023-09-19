public class TongHop {
    private String loaiTu;
    private String yNghia;
    private String cauViDuTiengViet;
    private String cauViDuTiengAnh;
    
    public String getLoaiTu() {return loaiTu;}

    public String getYNghia() {return yNghia;}

    public String getCauViDuTiengViet() {return cauViDuTiengViet;}

    public String getCauViDuTiengAnh() {return cauViDuTiengAnh;}
    
    public TongHop() {
        loaiTu = "" ; yNghia = "" ; cauViDuTiengAnh = "" ; cauViDuTiengViet = "" ;
    }

    public TongHop(String loaiTu, String cauViDuTiengViet, String cauViDuTiengAnh, String yNghia) {
        this.loaiTu = loaiTu;
        this.cauViDuTiengViet = cauViDuTiengViet;
        this.cauViDuTiengAnh = cauViDuTiengAnh;
        this.yNghia = yNghia;
    }

    public void print(){
        System.out.println("Loại từ: " + loaiTu);
        System.out.println("Ý nghĩa: " + yNghia);
        System.out.println("Ví dụ: " + cauViDuTiengViet + "---" + cauViDuTiengAnh);
    }
}
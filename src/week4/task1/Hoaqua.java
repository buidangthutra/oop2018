
package week4.task1;

/**
 *class HoaQua 
 * @author Bui Dang Thu Tra
 */
public class Hoaqua {
    private int giaban, soluong;
    private String nguongoc;
    
 /**
 *Ham lay gia tri cho Giaban
 * @param giaban gia tri gia ban
 */
    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }
 /**
 *Ham tra ve gia tri cho giaban
 * @return tra ve gia tri gia ban
 */   
    public int getGiaban(){
        return giaban;
    }
 /**
 *Ham lay gia tri cho Soluong
 * @param soluong gia tri gia ban
 */    
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
 /**
 *Ham tra ve gia tri cho Soluong
 * @return tra ve gia tri soluong
 */   
    public int getSoluong() {
         return soluong;
    }
 /**
 *Ham lay gia tri cho Nguon goc
 * @param xuat gia tri gia ban
 */    
    public void setNguongoc(String xuat) {
        this.nguongoc = xuat;
    }
 
 /**
 *Ham tra ve gia tri cho Nguongoc
 * @return tra ve gia tri nguon goc
 */     
    public String getNguongoc() {
        return nguongoc;
    }
 /**
 *ham khoi tao Hoaqua cua class Hoaqua
 * @param soluong la gia tri soluong
 * @param  gia la gia tri giaban
 * @param  nguongoc la gia tri nguongoc
 */     
    public  Hoaqua(int soluong, int gia, String nguongoc) {
        this.giaban = gia;
        this.soluong = soluong;
        this.nguongoc = nguongoc;
    }
 /**
 *Ham khoi tao mac dinh Hoaqua
 */ 
    public Hoaqua(){
        
    }       
  /**
 * phuong thuc TongGiaDauTu
 * @return tinh va tra ve so tien dau tu
 */            
    
    public int TongGiaDauTu(){
        return giaban*soluong;
    }
  /**
 *Tong qua nhap
 */    
    void TongQuaNhap() {
        System.out.println("Da nhap vao kho " + soluong + " qua." );
    }
    
}

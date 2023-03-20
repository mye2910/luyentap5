/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuyenxe;


public class ChuyenXe {


    private String Mscx, Hotentaixe, Soxe;
    private double Doanhthu;
    
    /**
     *
     * @param Mscx
     * @param Hotentaixe
     * @param Soxe
     * @param Doanhthu
     */
    public ChuyenXe( String Mscx, String Hotentaixe, String Soxe, double Doanhthu)
    {
        this.Mscx = Mscx;
        this.Hotentaixe = Hotentaixe;
        this.Soxe = Soxe;
        this.Doanhthu = Doanhthu;
    }
public String getMscx(){
    return Mscx;
}
public void setMscx(String Mscx){
    this.Mscx = Mscx;
}
public String getHotentaixe(){
    return Hotentaixe;
}
public void setHotentaixe(String Hotentaixe){
    this.Hotentaixe = Hotentaixe;
}
public String getSoxe(){
    return Soxe;
}
public void setSoxe(String Soxe)
{
    this.Soxe = Soxe;
}
public double getDoanhthu()
{
    return Doanhthu;
}
public void setDoanhthu(double Doanhthu)
{
    this.Doanhthu = Doanhthu;
}
public string tostring() {
    return "ChuyenXe [Mscx=" +Mscx +", Hotentaixe=" + Hotentaixe+", Doanhthu="+ Doanhthu+ "]";
}

public class Chuyenxenoithanh extends ChuyenXe
{
    private int Sotuyen;
    private int Sokmdidc;

        public Chuyenxenoithanh(String Mscx, String Hotentaixe, String Soxe, double Doanhthu) {
            super(Mscx, Hotentaixe, Soxe, Doanhthu);
            this.Sotuyen = Sotuyen;
            this.Sokmdidc = Sokmdidc;
        }    
public String getSotuyen(){
    return Sotuyen;
}
public void setSotuyen(String Sotuyen){
    this.Sotuyen = Sotuyen;
}
public int getSokmdidc() {
    return Sokm;
}
public void setSokmdidc(int Sokmdidc) {
    this.Sokmdidc = Sokmdidc;
}
public string tostring () {
    return super.tostring() + "Chuyenxenoithanh [Sotuyen=" + Sotuyen +", Sokmdidc=" +Sokmdidc + "]";
}
}
public class Chuyenxengoaithanh extends ChuyenXe
{
    private String songaydidc;
    private String noiden;
    
        public Chuyenxengoaithanh(String Mscx, String Hotentaixe, String Soxe, double Doanhthu) {
            super(Mscx, Hotentaixe, Soxe, Doanhthu);
            this.noiden = noiden;
            this.songaydidc = songaydidc;
        }
        public string getnoiden(){
            return noiden;
        }
        public void setnoiden (string noiden) {
            this.noiden=noiden;
        }
        public int getsongaydidc(){
            return songaydidc;
        }
        public void setsongaydidc(int songaydidc){
            this.songaydidc=songaydidc;
        }
    @Override
        public string tostring(){
            return super.tostring()+ "Chuyenxengoaithanh [noiden=" + noiden+ ",songaydidc="+ songaydidc +"]";
        }
        public class qlchuyenxe {
            arraylist<ChuyenXe> listChuyenXe;
            scanner sc;
            ChuyenXe cx;
            int chon;
            public qlchuyenxe(){
                super();
                listChuyenXe=new arraylist<ChuyenXe>();
                sc = new scanner (system.in);
            }
            public void nhap (int n) {
                for(int i=0; i<n; i++) {
                    system.out.println ("1:chuyen xe noi thanh");
                    system.out.println ("1:chuyen xe ngoai thanh");
                    system.out.println ("0:thoat");
                    chon = sc.nextint();sc.nextline();
                    switch (chon) {
                        case 1:
                        {
                            string Mscx;
                            string Hotentaixe;
                            double Doanhthu;
                            int Sotuyen;
                            int Sokmdidc;
                            system.out.println ("nhap mscx :"); Mscx = sc.nextline();
                            system.out.println ("nhap Hotentaixe :"); Hotentaixe = sc.nextline();
                            system.out.println ("nhap Sotuyen :"); Sotuyen = sc.nextline();
                            system.out.println ("nhap Sokmdidc :"); Sokmdidc = sc.nextline();
                            system.out.prinln("Doanhthu :"); doanhthu = sc.nextdouble(); sc.nextline();
                            cx = new Chuyenxenoithanh (Mscx, Hotentaixe, Doanhthu, Sotuyen, Sokmdidc);
                            listChuyễn.add(cx);
                            system.out.println("add thanh cong tuyen noi thanh");
                        }
                        break;
                        case 2:
                        {
                            string Mscx;
                            string Hotentaixe;
                            double Doanhthu;
                            int noiden;
                            int songaydidc;
                            system.out.println ("nhap mscx :"); Mscx = sc.nextline();
                            system.out.println ("nhap Hotentaixe :"); Hotentaixe = sc.nextline();
                            system.out.println ("nhap noiden :"); noiden = sc.nextline();
                            system.out.println ("nhap songaydidc :"); songaydidc = sc.nextline();
                            system.out.prinln("Doanhthu :"); Doanhthu = sc.nextdouble(); sc.nextline();
                            cx = new Chuyenxengoaithanh (Mscx, Hotentaixe, Doanhthu, noiden, songaydidc);
                            listChuyễn.add(cx);
                            system.out.println("add thanh cong tuyen ngoai thanh");
                        }
                        break;
                        default;
                        break;
                    }
                }
            }
            public void xuat()
            {
                for (Chuyenxe cx : listChuyenxe)
                {
                    system.out.println(cx.tostring());
                }
            }
            public void tongdoanhthu()
            {
                double doanhthunoithanh = 0,doanhthungoaithanh = 0;
                for (Chuyenxe cx : listChuyenxe)
                {
                    ìf(cx instanceof Chuyenxenoithanh)
                            {
                                doanhthunoithanh+=cx.getdoanhthu();
                            }
                    if(cx instanceof Chuyenxengoaithanh) 
                    {
                        doanhthungoaithanh+=cx.getdoanhthu();
                    }
                }
                system.out.println("\ntong doanh thu noi thanh : " + doanhthunoithanh);
                system.out.println("\ntong doanh thu ngoai thanh : " + doanhthungoaithanh);
                
            }
                      }
        public class test
        {
            public static void main(string[] args) {
                quanlychuyenxe qlcx = new quanlychuyenxe();
                qlcx.nhap(3);
                qlcx.xuat();
                qlcx.tongdoanhthu();
            }
        }
        
    

package Bai01;

public class Main {
    public static void main(String[] args) {
        Studentclass sv = new Studentclass();
        sv.khaiBaoThongTin();
        DSSV(sv);
    }

        public static void DSSV(Studentclass sv) {
            System.out.println("--------------------------THÔNG TIN SINH VIÊN------------------------------\n");
            System.out.printf("%-20s", "MÃ SINH VIÊN");
            System.out.printf("%-30s", "TÊN SINH VIÊN");
            System.out.printf("%-15s", "LỚP");
            System.out.printf("%-10s\n", "KHOÁ");
            System.out.println("---------------------------------------------------------------------------");
            sv.inThongTin();
            System.out.println("---------------------------------------------------------------------------");
        }
    }

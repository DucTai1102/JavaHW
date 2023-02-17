package bai02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = new Scanner(System.in).nextInt();
        Student[] sv = new Student[n];
        nhapThongTin(sv, n);
        DsSinhVien(sv, n);
        System.out.println("------------------ Danh sách sinh viên được sắp xếp theo tên ------------------ ");
        Arrange(sv, n);
        DsSinhVien(sv, n);
        System.out.print("Điền 1 để in danh sách theo lớp , 2 để dừng chương trình: ");
        int aks;
        do {
            aks = new Scanner(System.in).nextInt();
            for (int i = 1; i < 2; i++) {
                if (aks == 1) {
                    inDSTheoLop(sv, n);
                }
                if (aks == 2) {
                    break;
                } else {
                    System.out.print(" Lựa chọn không hợp lệ, vui lọng chọn lại: ");
                }
            }
        }
        while (aks != 1 && aks != 2);
    }

    public static void nhapThongTin(Student[] sv, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("----------------" + "Nhập thông tin cho sinh viên thứ " + (i + 1) + "---------------");
            sv[i] = new Student();
            sv[i].khaiBaoThongTin();
        }
    }

    public static void DsSinhVien(Student[] sv, int n) {
        System.out.println("-----------------------------------DS SINH VIÊN--------------------------------------\n");
        System.out.printf("%-10s", "STT");
        System.out.printf("%-20s", "MÃ SINH VIÊN");
        System.out.printf("%-30s", "TÊN SINH VIÊN");
        System.out.printf("%-15s", "LỚP");
        System.out.printf("%-10s\n", "KHOÁ");
        System.out.println("-------------------------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d", (i + 1));
            sv[i].inThongTin();
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }

    public static void Arrange(Student[] sv, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sv[i].name.compareToIgnoreCase(sv[j].name) > 0) {
                    Student temp;
                    temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
            }
        }
    }

    public static void inDSTheoLop(Student[] sv, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sv[i].Class.compareTo(sv[j].Class) > 0) {
                    Student temp;
                    temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
            }
        }
        System.out.println("************IN THEO LỚP************");
        DsSinhVien(sv, n);
    }
}


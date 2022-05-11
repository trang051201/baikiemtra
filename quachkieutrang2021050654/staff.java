package dinhphucson_2021050565;
import java.util.Scanner;
public class staff {
    private String Name;
    private int Salary,Bonus;
    public void getBonus(){
        Bonus = (Salary*20)/100;

    }
    void setStaff(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien: ");
        Name = sc.nextLine();
        System.out.println("Nhap luong cho nhan vien: ");
        Salary = sc.nextInt();
    }
    void  getStaff(){
        System.out.println("Ho va ten: "+Name+"\nLuong cung:"+Salary+"\nThuong them: "+Bonus+"\nTong luong: "+(Salary+Bonus));
    }
}

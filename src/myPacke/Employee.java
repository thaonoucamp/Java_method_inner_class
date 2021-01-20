package myPacke;

public class Employee {
    public void luong() {
        class Worker{
            private String ten;
            public void luong() {
                System.out.println("luong cong nhan");
            }
        }
        Worker worker = new Worker();
        worker.luong();
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.luong();
    }
}
// chi ton tai ben trong class
// chi ke thua trong cung phuong thuc
// ko truy xuat duoc be ngoai
// it su dung
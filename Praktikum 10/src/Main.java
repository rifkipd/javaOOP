import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static ArrayList<Member> data =  new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    private static Scanner input2 = new Scanner(System.in);

    private static void inputanDriver(){
        System.out.println("nik : ");
        String nik  = input.nextLine();
        System.out.println("nama : ");
        String nama = input.nextLine();
        System.out.println("No.Telp : ");
        String notelp = input.nextLine();
        System.out.println("no plat : ");
        String noplat = input.nextLine();
        System.out.println("jenis : ");
        String jenis = input.nextLine();
        System.out.println("saldo : ");
        double saldo = input2.nextDouble();

        Member addsDr = new Driver(nik,notelp,nama,noplat,jenis,saldo);
        data.add(addsDr);

    }

    private static void inputanCust(){
        System.out.println("nik : ");
        String nik  = input.nextLine();
        System.out.println("nama : ");
        String nama = input.nextLine();
        System.out.println("No.Telp : ");
        String notelp = input.nextLine();
        System.out.println("saldo : ");
        double saldo = input2.nextDouble();

        Member addsCust = new Customer(nik,notelp,nama,saldo);
        data.add(addsCust);
    }

    private static Member findMember(String nik){
        Member member = null;
        for (Member dataMembers :data){
            if (dataMembers.getNik().equalsIgnoreCase(nik)){
                member = dataMembers;
                break;
            }
        }
        return member;
    }

    private static void displayMember(){
        for (Member dataMember : data){
            dataMember.display();
        }
    }

    private static void transaksi(int tipe) {
        System.out.println("\nDetail Transaksi");
        System.out.print("ID Customer: ");
        String idCust = input.next();
        System.out.print("ID Driver: ");
        String idDriver = input.next();
        System.out.print("Biaya: ");
        double biaya = input.nextDouble();

        Member cust = findMember(idCust);
        Member driver = findMember(idDriver);

        if ((cust instanceof Customer) && (driver instanceof Driver)) {
            if (tipe == 0) {
                cust.transaksi(driver, biaya);
            } else {
                driver.transaksi(cust, biaya);
                driver.display();
            }
            cust.display();
        }
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        do {
            System.out.println("\nMenu Aplikasi");
            System.out.println("1. Input Customer");
            System.out.println("2. Input Driver");
            System.out.println("3. Data Member");
            System.out.println("4. Top Up");
            System.out.println("5. Jasa Antar");
            System.out.println("6. Keluar");
            System.out.println("Pilih Angka untuk Melanjutkan : ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    inputanCust();
                    break;
                case 2:
                    inputanDriver();
                    break;
                case 3:
                    displayMember();
                    break;
                case 4:
                    transaksi(0);
                    break;
                case 5:
                    transaksi(1);
                    break;
                case 6:
                    System.out.println("Aplikasi Berhenti");
                    break;
            }

        }while (menu < 6);
    }
}

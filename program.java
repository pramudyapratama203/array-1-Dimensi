import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        String belanja[] = new String[5];
        int pilih = 0, item = 0, jum = 0, totHarga = 0, grandTotal = 0; // Indeks array belanja
        int harga[] = new int[5];
        int jumlah[] = new int[5];
        int total[] = new int[5];
        int grdTot[] = new int[5];
        
        
        do{
            System.out.println("\nKasir Toko Kita");
            System.out.println("1. Tas [100.000]\n2. Sepatu [150.000]\n3. Sandal [50.000]\n4. Baju [75.000]\n5. Jaket [200.000]\n6. Selesai"); 
            System.out.print("Pilih = "); pilih = sc.nextInt();
            
            switch(pilih){
                case 1 :
                    if(item < belanja.length){
                       belanja [item] = "Tas";
                       harga [item] = 100000;
                       System.out.print("Jumlah = "); jum = sc.nextInt();
                       jumlah [item] = jum;
                       totHarga = harga [item] * jum;
                       total [item] = totHarga;
                       System.out.println("Harga yang didapat adalah " + totHarga);
                       grandTotal = grandTotal + totHarga;
                       grdTot [item] = grandTotal;
                    }else {
                        System.out.println("Keranjang Penuh!");
                    }
                    break;
                    
                case 2 :
                    if (item < belanja.length){
                        belanja [item] = "Sepatu";
                        harga [item] = 150000;
                        System.out.print("Jumlah = "); jum = sc.nextInt();
                        jumlah [item] = jum;
                        totHarga = harga [item] * jum;
                        total [item] = totHarga;
                        System.out.println("Harga yang didapat adalah " + totHarga);
                        grandTotal = grandTotal + totHarga;
                        grdTot [item] = grandTotal;
                    }else {
                        System.out.println("Keranjang Penuh!");
                    }
                    break;
                    
                case 3 :
                    if (item < belanja.length){
                        belanja [item] = "Sandal";
                        harga [item] = 50000;
                        System.out.print("Jumlah = "); jum = sc.nextInt();
                        jumlah [item] = jum;
                        totHarga = harga [item] * jum;
                        total [item] = totHarga;
                        System.out.println("Harga yang didapat adalah " + totHarga);
                        grandTotal = grandTotal + totHarga;
                        grdTot [item] = grandTotal;
                    }else {
                        System.out.println("Keranjang Penuh!");
                    }
                    break;
                    
                case 4 : 
                    if (item < belanja.length){
                        belanja [item] = "Baju";
                        harga [item] = 75000;
                        System.out.print("Jumlah = "); jum = sc.nextInt();
                        jumlah [item] = jum;
                        totHarga = harga [item] * jum;
                        total [item] = totHarga;
                        System.out.println("Harga yang didapat adalah " + totHarga);
                        grandTotal = grandTotal + totHarga;
                        grdTot [item] = grandTotal;
                    }else { 
                        System.out.println("Keranjang Penuh!");
                    }
                    break;
                    
                case 5 :
                    if (item < belanja.length){
                        belanja [item] = "Jaket";
                        harga [item] = 200000;
                        System.out.print("Jumlah = "); jum = sc.nextInt();
                        jumlah [item] = jum;
                        totHarga = harga [item] * jum;
                        total [item] = totHarga;
                        System.out.println("Harga yang didapat adalah " + totHarga);
                        grandTotal = grandTotal + totHarga;
                        grdTot [item] = grandTotal;
                    }else {
                        System.out.println("Keranjang Penuh!");
                    }
                    break;
                    
                case 6 :
                    System.out.println("\n========== STRUK BELANJA ==========");
                    System.out.printf("%-3s %-15s %-10s %-10s %-10s\n", "No", "Barang", "Harga", "Jumlah", "Total");
                    System.out.println("-----------------------------------------------------------------");
                    for (int i = 0; i < item; i++) {
                         System.out.printf("%-3d %-15s Rp%-9d %-10d Rp%-10d\n", (i + 1), belanja[i], harga[i], jumlah[i], total[i]);
                    }
                    break;
                    
            }
            item++;
            System.out.println("Jumlah Item : " + jum);
            System.out.println("GrandTotal : " + grandTotal);
            System.out.println("Terima kasih sudah berbelanja");
            
            
        }while (pilih != 6);
    }
}


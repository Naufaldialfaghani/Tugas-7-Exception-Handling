import java.util.Scanner;

public class GolfScore { 

    // Method untuk memvalidasi skor golf
    // throws IllegalArgumentException menunjukkan bahwa method ini bisa melempar exception tersebut
    public static void validateScore(int score) throws IllegalArgumentException {
        if (score < 50 || score > 150) {  // Jika skor di luar batas wajar dalam golf
            throw new IllegalArgumentException("Skor golf tidak valid! Skor harus antara 50 dan 150.");  
            // Melempar exception secara eksplisit
        }
    }

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);  // Membuat objek Scanner untuk membaca input dari user

        try {
            System.out.print("Masukkan nama pemain: ");  // Meminta user memasukkan nama
            String nama = scanner.nextLine();  // Membaca input nama golfer

            System.out.print("Masukkan skor golf (jumlah pukulan): ");  // Meminta user memasukkan skor
            int skor = scanner.nextInt();  // Membaca input skor golf

            validateScore(skor);  // Memanggil method untuk validasi skor, bisa melempar exception

            System.out.println("Skor " + nama + " tercatat: " + skor + " pukulan.");  
            // Jika skor valid, tampilkan hasilnya

        } catch (IllegalArgumentException e) {  // Menangkap exception jika skor tidak valid
            System.out.println("Terjadi kesalahan: " + e.getMessage());  // Menampilkan pesan error
        } catch (Exception e) {  // Menangkap exception lain yang tidak terduga
            System.out.println("Input tidak valid.");  // Menampilkan pesan error umum
        }

        System.out.println("Program selesai.");  // Menunjukkan bahwa program telah berakhir
        scanner.close();  // Menutup objek Scanner untuk mencegah memory leak
    }
}

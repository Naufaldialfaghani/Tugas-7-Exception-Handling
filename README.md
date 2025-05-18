# ⛳ Golf Score Validator (Java)
Merupakan program yang digunakan untuk **memvalidasi skor golf**. Skor dalam permainan golf yang terlalu kecil atau terlalu besar dianggap tidak realistis, sehingga program ini akan **menolak skor yang tidak valid** dengan menerapkan **exception handling** menggunakan `try`, `throw`, dan `throws`.



## 🧠 Tujuan Proyek

- Menyediakan validasi input dalam konteks permainan olahraga (golf).
- Menjalankan penerapan `IllegalArgumentException` (unchecked exception).
- Mengimplementasikan konsep exception handling (`try`, `throw`, `throws`) dalam Java.
- Meningkatkan keamanan dan ketahanan program terhadap input yang tidak valid.



## 🔧 Cara Kerja Program

1. Pengguna diminta memasukkan **nama pemain** dan **skor golf**.
2. Program memanggil method `validateScore()` untuk mengecek apakah skor berada di antara 50 dan 150.
3. Jika skor tidak valid, program akan **melempar exception** dengan pesan error yang sesuai.
4. Jika skor valid, maka akan ditampilkan ke layar.

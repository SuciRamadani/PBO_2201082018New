      1. Aritmatika

      public class Aritmatika {
          public int tambah(int a, int b){
              return a+b;
          }
          public boolean cekBilanganGanjil(int a){
              return (a % 2==1);
          }
          public static void main (String[] args){
              Aritmatika aritmatika = new Aritmatika();
              int c= aritmatika.tambah(5,6);
              System.out.println("Nilai c = " + c);
               System.out.println("Ganjil ?" + aritmatika.cekBilanganGanjil(c));

          }
      }

  Program ini adalah contoh sederhana dari penggunaan class dan method pada bahasa pemrograman Java. Program ini memiliki dua method yaitu tambah dan cekBilanganGanjil yang masing-masing berfungsi untuk melakukan operasi penjumlahan dan pengecekan bilangan ganjil.
Pertama, program mendefinisikan sebuah class bernama Aritmatika.
Di dalam class Aritmatika terdapat dua method yaitu tambah dan cekBilanganGanjil.
Method tambah memiliki dua parameter a dan b yang bertipe data integer. Method ini akan mengembalikan hasil penjumlahan dari kedua parameter tersebut.
Method cekBilanganGanjil memiliki satu parameter a yang bertipe data integer. Method ini akan mengembalikan nilai boolean true jika a adalah bilangan ganjil, dan false jika sebaliknya.
Pada method main, program membuat sebuah objek dari class Aritmatika dan memanggil method tambah dengan argumen 5 dan 6. Hasil dari method tambah akan disimpan pada variabel c.
Program mencetak nilai dari variabel c dan melakukan pemanggilan method cekBilanganGanjil dengan argumen c.

      2. Contoh Array

      public class ContohArray {
          public static void main(String[] args) {
              boolean hasil[] = { true, false };
              double grade[] = { 70, 80, 90 };

              String hari[] = { "senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu" };

              System.out.print(hasil[0]);
          }
      }


  Program ini adalah contoh sederhana dari penggunaan array pada bahasa pemrograman Java. Program ini menunjukkan bagaimana cara mendefinisikan array dengan tipe data yang berbeda-beda, yaitu boolean, double, dan String.
Program mendefinisikan tiga buah array dengan tipe data yang berbeda-beda, yaitu hasil dengan tipe data boolean, grade dengan tipe data double, dan hari dengan tipe data String.
Masing-masing array diisi dengan beberapa nilai yang sesuai dengan tipe datanya.
Pada baris terakhir program, dilakukan cetak elemen pertama dari array hasil.

       3.public class LatihanModul7_1ForLoop {
          public static void main(String[]args){
              String[] hari = { "Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};

              int i=0;
              do
                  {
                      System.out.println(hari[i]);
                      i++;
                  }while(i<hari.length);
          }
      }


  Program ini merupakan contoh implementasi penggunaan perulangan do-while pada bahasa pemrograman Java. Program akan menampilkan daftar hari dalam seminggu yang disimpan pada array dengan menggunakan perulangan do-while.
Program ini dibuat oleh [nama kontributor] pada tanggal [tanggal pembuatan]. Jika Anda ingin berkontribusi dalam pengembangan program ini, silakan lakukan fork pada repository ini dan kirimkan pull request Anda. Kami akan dengan senang hati mereview dan memasukkan perubahan Anda ke dalam program.
Program ini dilisensikan di bawah [jenis lisensi]. Silakan lihat file [nama file lisensi] untuk informasi lebih lanjut.


      4.public class LatihanModul7_1WhileDo {
          public static void main(String[]args)
          {
              String[] hari = { "Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};

              int i=0;
              while(i<hari.length)
                  {
                      System.out.println(hari[i]);
                     i++;
                  }
          }
      }

  Program ini merupakan contoh implementasi penggunaan perulangan do-while pada bahasa pemrograman Java. Program akan menampilkan daftar hari dalam seminggu yang disimpan pada array dengan menggunakan perulangan do-while.
Program ini dibuat oleh [nama kontributor] pada tanggal [tanggal pembuatan]. Jika Anda ingin berkontribusi dalam pengembangan program ini, silakan lakukan fork pada repository ini dan kirimkan pull request Anda. Kami akan dengan senang hati mereview dan memasukkan perubahan Anda ke dalam program.
Program ini dilisensikan di bawah [jenis lisensi]. Silakan lihat file [nama file lisensi] untuk informasi lebih lanjut.

      5.public class LatihanModul7_2NomorTerbesarBufferedReader {
          public static void main(String[] args) {
              BufferedReader masukan = new BufferedReader(new InputStreamReader(System.in));
              int[] a = new int[5];
              int terbesar = 0;
              for (int i = 1; i <= a.length; i++) {
                  System.out.println("Masukkan angka " + i + ":");
                  try {
                      a[i-1] = Integer.parseInt(masukan.readLine());
                      if (a[i-1] > terbesar) {
                          terbesar = a[i-1];
                      }
                  } catch (IOException e) {
                  }
              }
              String hasil = "Terbesar adalah " + terbesar;
              System.out.println(hasil);
          }
      }

  Program ini merupakan contoh implementasi penggunaan BufferedReader pada bahasa pemrograman Java untuk mencari nilai terbesar dari lima angka yang dimasukkan oleh pengguna. Program akan meminta pengguna memasukkan angka secara berurutan, kemudian mencari nilai terbesar dari kelima angka tersebut.
Program ini dibuat oleh [nama kontributor] pada tanggal [tanggal pembuatan]. Jika Anda ingin berkontribusi dalam pengembangan program ini, silakan lakukan fork pada repository ini dan kirimkan pull request Anda. Kami akan dengan senang hati mereview dan memasukkan perubahan Anda ke dalam program.
Program ini dilisensikan di bawah [jenis lisensi]. Silakan lihat file [nama file lisensi] untuk informasi lebih lanjut.

      6.public class LatihanModul7_2NomorTerbesarJoptionPane {
          public static void main(String[] args) {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          int[] angka = new int[10];

          try {
            for (int i = 0; i < 10; i++) {
              String input = JOptionPane.showInputDialog(null, "Masukkan nomor ke-" + (i+1));
              angka[i] = Integer.parseInt(input);
            }
          } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Input harus berupa angka");
            System.exit(1);
          }

          int maxAngka = angka[0];
          for (int i = 1; i < 10; i++) {
            if (angka[i] > maxAngka) {
              maxAngka = angka[i];
            }
          }

          JOptionPane.showMessageDialog(null, "Nomor terbesar yang Anda masukkan adalah " + maxAngka);
        }
      }

  Program ini merupakan contoh implementasi penggunaan JOptionPane pada bahasa pemrograman Java untuk mencari nilai terbesar dari sepuluh angka yang dimasukkan oleh pengguna. Program akan menampilkan dialog box untuk meminta pengguna memasukkan angka secara berurutan, kemudian mencari nilai terbesar dari sepuluh angka tersebut dan menampilkannya pada dialog box.
Program ini dibuat oleh [nama kontributor] pada tanggal [tanggal pembuatan]. Jika Anda ingin berkontribusi dalam pengembangan program ini, silakan lakukan fork pada repository ini dan kirimkan pull request Anda. Kami akan dengan senang hati mereview dan memasukkan perubahan Anda ke dalam program.
Program ini dilisensikan di bawah [jenis lisensi]. Silakan lihat file [nama file lisensi] untuk informasi lebih lanjut.

      7.public class LatihanModul7_3BukuAlamat {
          public static void main(String[] args){
              String[][] entry = {{"Florence", "735-1234", "Manila"},
                      {"Joyce", "983-3333", "Quezon City"},
                      {"Becca", "456-3322", "Manila"}};

              for (String[] data : entry) {
                  System.out.println("Name : " + data[0]);
                  System.out.println("Tel. # : " + data[1]);
                  System.out.println("Address : " + data[2]);
                  System.out.println();
              }
          }
      }

  Program ini adalah contoh sederhana dari bagaimana mengelola data buku alamat menggunakan array 2 dimensi. 
Pertama, program menentukan array 2 dimensi entry dengan tiga baris dan tiga kolom.
Array entry berisi tiga set data buku alamat, masing-masing terdiri dari nama, nomor telepon, dan alamat.
Program menggunakan loop for-each untuk mengakses setiap data buku alamat di dalam array entry.
Setiap set data buku alamat diprint ke layar dengan format tertentu.

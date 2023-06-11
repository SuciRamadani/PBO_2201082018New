
BAB 7 

Java Array

///Program Pertama

public class LatihanModul7_1ForLoop {


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

Program di atas merupakan contoh penggunaan do-while loop untuk mencetak isi dari array hari ke konsol. Berikut adalah penjelasan dari setiap baris kode:

1. public class LatihanModul7_1ForLoop {: Ini adalah deklarasi kelas Java dengan nama "LatihanModul7_1ForLoop". Nama kelas harus sesuai dengan nama file Java yang berisi kelas tersebut.

2. public static void main(String[]args){: Ini adalah method utama (main method) dari program Java. Setiap program Java harus memiliki method utama dan harus memiliki signature yang persis seperti ini. Method utama adalah tempat di mana program dimulai saat dieksekusi.

3. String[] hari = { "Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};: Ini adalah deklarasi variabel array hari dengan tipe data String dan menginisialisasi array dengan 7 elemen string hari dalam satu minggu.

4. int i=0;: Ini adalah deklarasi variabel i dengan tipe data int dan nilai awal 0.

5. do: Ini memulai sebuah do-while loop.

6. System.out.println(hari[i]);: Ini mencetak elemen array hari pada indeks ke-i ke konsol menggunakan perintah System.out.println().

7. i++;: Ini adalah perintah untuk menambah nilai variabel i sebanyak 1 setiap kali loop dieksekusi.

8. while(i<hari.length);: Ini adalah kondisi untuk melakukan loop selama nilai variabel i kurang dari panjang array hari.

9. }: Ini menutup method utama.

10. }: Ini menutup kelas.

Jadi, program ini akan mencetak elemen array hari satu per satu ke konsol dengan menggunakan loop do-while. Loop akan terus berlanjut sampai variabel i mencapai nilai panjang array hari.



///Program Kedua

public class LatihanModul7_1WhileDo {


    public static void main(String[]args){
        String[] hari = { "Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};

        int i=0;
        while(i<hari.length)
            {
                System.out.println(hari[i]);
               i++;
            }
    }
}


Program di atas adalah contoh penggunaan while loop dalam Java untuk mencetak isi dari array hari ke konsol. Berikut adalah penjelasan dari setiap baris kode:

1. public class LatihanModul7_1WhileDo {: Ini adalah deklarasi kelas Java dengan nama "LatihanModul7_1WhileDo". Nama kelas harus sesuai dengan nama file Java yang berisi kelas tersebut.

2. public static void main(String[]args){: Ini adalah method utama (main method) dari program Java. Setiap program Java harus memiliki method utama dan harus memiliki signature yang persis seperti ini. Method utama adalah tempat di mana program dimulai saat dieksekusi.

3. String[] hari = { "Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};: Ini adalah deklarasi variabel array hari dengan tipe data String dan menginisialisasi array dengan 7 elemen string hari dalam satu minggu.

4. int i=0;: Ini adalah deklarasi variabel i dengan tipe data int dan nilai awal 0.

5. while(i<hari.length): Ini memulai sebuah while loop, yang akan terus dilakukan selama nilai variabel i kurang dari panjang array hari.

6. System.out.println(hari[i]);: Ini mencetak elemen array hari pada indeks ke-i ke konsol menggunakan perintah System.out.println().

7. i++;: Ini adalah perintah untuk menambah nilai variabel i sebanyak 1 setiap kali loop dieksekusi.

8. }: Ini menutup while loop.

9. }: Ini menutup method utama.

10. }: Ini menutup kelas.

Jadi, program ini akan mencetak elemen array hari satu per satu ke konsol dengan menggunakan while loop. Loop akan terus berlanjut sampai variabel i mencapai nilai panjang array hari.



///Program Ketiga



import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

public class LatihanModul7_2NomorTerbesarBufferedReader {


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

Program di atas merupakan program untuk mencari nilai terbesar dari 5 angka yang dimasukkan oleh user menggunakan BufferedReader.

Pertama-tama, program mengimpor dua package yaitu BufferedReader dan IOException.

Kemudian, di dalam main method, array integer a dengan panjang 5 diinisialisasi. Variabel terbesar diinisialisasi dengan nilai awal 0.

Selanjutnya, program melakukan looping sebanyak 5 kali menggunakan for loop dan setiap kali melakukan looping, program akan meminta user untuk memasukkan angka dengan menggunakan BufferedReader. Angka yang dimasukkan oleh user kemudian di-parse ke dalam bentuk integer dan disimpan ke dalam array a. Jika angka yang dimasukkan lebih besar dari nilai terbesar sebelumnya, maka nilai terbesar akan di-update dengan angka tersebut.

Setelah looping selesai, program akan mencetak nilai terbesar yang berhasil ditemukan.



///program keempat

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class LatihanModul7_2NomorTerbesarJoptionPane {

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

Kode di atas merupakan implementasi program untuk menemukan nomor terbesar dari sepuluh angka yang dimasukkan oleh pengguna menggunakan JOptionPane dari package javax.swing. Program ini menggunakan array untuk menyimpan sepuluh angka yang dimasukkan dan kemudian mencari nomor terbesar dengan membandingkan angka-angka tersebut satu per satu.

Pertama, program meminta pengguna untuk memasukkan sepuluh angka menggunakan JOptionPane.showInputDialog. Kemudian, program mengecek apakah input yang dimasukkan oleh pengguna berupa angka atau tidak dengan menggunakan try-catch block. Jika input bukan berupa angka, program akan menampilkan pesan kesalahan dan keluar dari program. Jika input berupa angka, program akan menyimpan angka-angka tersebut ke dalam array.

Setelah angka-angka disimpan, program mencari nomor terbesar dengan melakukan perbandingan satu per satu menggunakan loop for. Variabel maxAngka diinisialisasi dengan nilai pertama dalam array, dan kemudian setiap angka dalam array dibandingkan dengan maxAngka. Jika angka tersebut lebih besar dari maxAngka, maka maxAngka diperbarui dengan angka tersebut. Setelah loop selesai, program menampilkan nomor terbesar yang ditemukan menggunakan JOptionPane.showMessageDialog.


///Program kelima

public class LatihanModul7_3BukuAlamat {

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


Program di atas merupakan contoh penggunaan array multidimensi untuk menyimpan dan menampilkan informasi buku alamat. Terdapat sebuah array 2 dimensi yang berisi informasi nama, nomor telepon, dan alamat dari beberapa orang.

Kemudian dilakukan perulangan menggunakan for-each loop untuk mengakses setiap elemen array dan menampilkan informasi yang ada pada setiap elemennya menggunakan perintah print.

Output program tersebut akan menampilkan informasi nama, nomor telepon, dan alamat setiap orang pada array. Program kemudian menggunakan loop for-each untuk menampilkan setiap data buku alamat. Pada setiap iterasi loop, program akan menampilkan nama, nomor telepon, dan alamat yang tersimpan pada array. Selain itu, setelah menampilkan setiap data, program juga menampilkan baris kosong sebagai separator sebelum melanjutkan ke data berikutnya.

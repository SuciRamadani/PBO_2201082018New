
 PENJELASAN LATIHAN MODUL 8
 
 SOAL 1
 
 public class Latihan8_soal1 {
 
     public static void main ( String[] args){
     
        for(int i=0; i<=4; i++)
        System.out.println("\n" +args[i]);
         
    }
}


Kode di atas adalah program Java yang mencetak nilai yang diinputkan ke dalam array args. Program tersebut memiliki satu method, yaitu main, yang berisi perulangan for dengan penghitung i yang dimulai dari 0 dan berakhir pada 4. Setiap kali perulangan dijalankan, program akan mencetak elemen array args dengan indeks i dan mengakhiri baris dengan memanggil System.out.println(). Dalam hal ini, karakter \n digunakan untuk membuat baris baru sebelum mencetak nilai dari elemen array.

Sebagai contoh, jika kita menjalankan program tersebut dengan argumen "hello", "world", "java", "programming", "is", maka program akan mencetak nilai argumen tersebut dalam baris baru, yaitu:

hello
world
java
programming
is


Namun, perlu diingat bahwa program akan menghasilkan error jika kita tidak memberikan cukup argumen saat menjalankan program atau jika memberikan terlalu banyak argumen. Sehingga sebaiknya memperhatikan jumlah argumen yang diberikan saat menjalankan program.


SOAL 2


import java.util.Scanner;

public class Latihan8_soal2 {

    public static void main(String[] args) {
    int a=Integer.parseInt(args[0]);
    int b= Integer.parseInt(args[1]);

    Scanner in=new Scanner(System.in);

    //aritmatika tambah
    int sum;
    sum= a + b;

    //aritmatika kurang
    int difference;
    difference = a - b;

    //aritmatika kali
    int product;
    product = a * b;

    //aritmatika bagi
    int quotient;
    quotient = a / b;

    //output
    System.out.println("Sum       ="+sum);
    System.out.println("Different ="+difference);
    System.out.println("Product   ="+product);
    System.out.println("Quotient  ="+quotient);
    }
}


Kode di atas adalah program Java yang melakukan operasi aritmatika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian antara dua bilangan yang diinputkan melalui argumen program.

Pada baris ke-3 dan ke-4, program mengambil nilai dari argumen args[0] dan args[1], kemudian mengkonversinya menjadi bilangan bulat dengan menggunakan Integer.parseInt(). Kemudian, program membuat sebuah objek Scanner untuk membaca masukan pengguna melalui keyboard.

Kemudian, program melakukan empat operasi aritmatika dasar pada variabel a dan b dengan menambahkannya, mengurangkannya, mengalikannya, dan membaginya. Hasil dari setiap operasi tersebut disimpan dalam variabel sum, difference, product, dan quotient, masing-masing.

Terakhir, program mencetak keluaran ke layar dengan menggunakan System.out.println(). Setiap keluaran menampilkan jenis operasi dan hasilnya dengan format yang sesuai. Sebagai contoh, jika kita menjalankan program dengan memberikan argumen 10 dan 5, maka program akan mencetak keluaran seperti berikut:

makefile
Copy code
Sum       =15
Different =5
Product   =50
Quotient  =2
Namun, seperti program sebelumnya, program ini juga akan menghasilkan error jika jumlah argumen yang diberikan tidak sesuai atau argumen yang diberikan tidak dapat dikonversi menjadi bilangan bulat. Oleh karena itu, perlu untuk memastikan argumen yang diberikan pada saat menjalankan program adalah bilangan bulat dan jumlahnya harus tepat dua.

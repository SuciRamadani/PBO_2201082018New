BAB 1 
Pengenalan Pemrograman Komputer 

///
public class ContohIncrement {

    public static void main (String[] args ){
        int i = 10;
        int j = 3;
        int k;
        
        k = j++ + i;
        
        System.out.println("i : "+i);
        System.out.println("j : "+j);
        System.out.println("k : "+k);
    }
}

Program di atas merupakan contoh penggunaan operator increment pada bahasa pemrograman Java. Operator increment digunakan untuk menambah nilai suatu variabel dengan 1.

Pada program di atas, terdapat tiga variabel yaitu i, j, dan k yang memiliki tipe data integer. Kemudian, nilai i diinisialisasi dengan 10 dan nilai j diinisialisasi dengan 3.

Variabel k kemudian diinisialisasi dengan operasi j++ + i. Operasi ini terdiri dari dua operan, yaitu j++ dan i.

Operator ++ disebut operator increment, yang artinya variabel j akan ditambahkan nilai 1 setelah nilai j digunakan pada operasi tersebut. Sehingga, nilai yang digunakan pada operasi tersebut adalah nilai awal variabel j yaitu 3.

Setelah itu, hasil dari penjumlahan j++ + i yaitu 13 akan disimpan ke variabel k.

Kemudian, program mencetak nilai dari variabel i, j, dan k menggunakan metode System.out.println(). Hasil output program adalah sebagai berikut:

i : 10
j : 4
k : 13

Dapat dilihat bahwa nilai variabel j telah bertambah 1 setelah operasi increment dilakukan.

///
public class KondisiOperator {

    public static void main (String[] args ){
       String status = "";
       int grade = 80;
       
       //mendapatkan status pelajar
       status = (grade >= 60)?"Passed":"Fail";
       
       //print status
       System.out.println(status);
    }
}

Kodingan di atas menggunakan operator kondisional ternary ? yang memiliki struktur condition ? value_if_true : value_if_false.

Pada kasus di atas, terdapat variabel status yang akan diisi dengan nilai "Passed" jika nilai dari variabel grade lebih besar atau sama dengan 60, dan akan diisi dengan nilai "Fail" jika nilai dari variabel grade kurang dari 60. Ini ditentukan oleh operator kondisional ternary yang berada di dalam tanda kurung (grade >= 60)?"Passed":"Fail";.

Setelah itu, nilai dari variabel status akan dicetak menggunakan perintah System.out.println(status);. Jika nilai dari variabel grade adalah 80, maka output yang dihasilkan adalah "Passed".

///
penjelasan kodingan dibawah ini

public class Latihan1 {

    public static void main (String[] args ){
        int number = 10;
        char letter = 'a';
        boolean result = true;
        String str = "hello";
        
        System.out.println(number);
        System.out.println(letter);
        System.out.println(result);
        System.out.println(str);
        
    }
}

Program di atas adalah contoh program Java sederhana yang menunjukkan bagaimana mendeklarasikan dan menampilkan beberapa jenis variabel dalam Java, seperti int untuk bilangan bulat, char untuk karakter, boolean untuk tipe data boolean, dan String untuk teks.

Pada program ini, terdapat empat variabel yang dideklarasikan dan kemudian dicetak menggunakan System.out.println(). Variabel number bertipe int diberi nilai 10. Variabel letter bertipe char diberi nilai 'a'. Variabel result bertipe boolean diberi nilai true. Variabel str bertipe String diberi nilai "hello".

Kemudian, dengan menggunakan perintah System.out.println(), keempat variabel tersebut dicetak ke layar,

///

penjelasan kodingan dibawah ini

public class Latihan2 {

    public static void main (String[] args ){
        int number1 = 10;
        int number2 = 20;
        int number3 = 45;
        int average;
        
        average = (number1+number2+number3)/3;
        
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(average);
    }
}

Kodingan di atas merupakan program sederhana untuk menghitung rata-rata dari 3 bilangan bulat (number1, number2, dan number3).

Pertama-tama, tiga variabel number1, number2, dan number3 diinisialisasi dengan nilai 10, 20, dan 45. Kemudian, nilai rata-rata dihitung dengan cara menambahkan ketiga bilangan tersebut, dan hasilnya dibagi dengan jumlah bilangan yang dijumlahkan (yaitu 3), dan disimpan ke dalam variabel average.

Terakhir, hasil dari ketiga bilangan dan nilai rata-rata ditampilkan ke layar menggunakan perintah println().

///
penjelasan kodingan dibawah ini

public class Latihan3 {

     public static void main (String[] args ){
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int score = 0;
        
        score = (number2 > number3)?(number2>number1)?number2:number1:number3;
        
        System.out.println("number 1 = "+number1);
        System.out.println("number 2 = "+number2);
        System.out.println("number 3 = "+number3);
        System.out.println("nilai tertingginya = "+score);
    }
}

Program di atas adalah contoh penggunaan operator ternary dalam Java untuk mencari nilai tertinggi di antara tiga variabel integer. Operator ternary digunakan untuk mengevaluasi suatu kondisi dan mengembalikan nilai berdasarkan kondisi tersebut.

Pada program ini, nilai variabel number2 dibandingkan dengan nilai variabel number3. Jika nilai number2 lebih besar dari number3, maka nilai variabel score akan sama dengan number2 jika nilai number2 lebih besar dari number1, dan akan sama dengan number1 jika tidak. Jika nilai number2 tidak lebih besar dari number3, maka nilai variabel score akan sama dengan number3. Variabel score akhirnya berisi nilai tertinggi di antara ketiga variabel.

Hasilnya dicetak menggunakan metode System.out.println().

///

public class TesAND {
    public static void main (String[] args ){
        int i = 0;
        int j = 10;
        boolean test= false;
        
        //demosntrasi &&
        test = (i > 10) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demonstrasi &
        test = (i > 10) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
       
    }
}


Program di atas adalah contoh penggunaan operator logika AND (&&) dan AND bit-wise (&) dalam bahasa pemrograman Java.

Pada operator logika AND (&&), operator ini akan menghasilkan nilai true jika semua kondisi yang diberikan juga bernilai true. Sedangkan jika ada salah satu kondisi yang bernilai false, maka hasil dari operator ini juga akan false.

Sedangkan pada operator AND bit-wise (&), operator ini melakukan operasi bitwise AND pada setiap bit pada kedua operand yang diberikan. Hasil dari operator ini adalah nilai biner baru yang terbentuk dari operasi bitwise AND.

Pada program di atas, terdapat dua variabel integer, i dan j, dan sebuah variabel boolean test. Pertama-tama, variabel test diinisialisasi dengan false. Kemudian pada baris 8-10, kondisi pada operator && adalah false, sehingga nilai variabel test tetap false, dan variabel j tidak bertambah nilai karena operasi pada sisi kanan operator tidak dijalankan.

Kemudian, pada baris 14-16, pada operator &, hasilnya juga false karena kondisi pada sisi kiri adalah false, sehingga nilai variabel test tetap false. Namun, pada sisi kanan operator &, variabel j bertambah nilai menjadi 11 karena operasi pada sisi kanan tetap dijalankan meskipun hasil akhirnya false.


penjelasan dari kodingan dibawah ini
public class Hello {
    public static void main (String[] args ){
        System.out.println("Selamat Datang");
    }
}
Kodingan di atas adalah contoh sederhana dari sebuah program Java yang mencetak "Selamat Datang" ke konsol. Berikut adalah penjelasan dari setiap baris kode:

1. public class Hello {: Ini adalah deklarasi kelas Java dengan nama "Hello". Nama kelas harus sesuai dengan nama file Java yang berisi kelas tersebut.

2. public static void main (String[] args ){: Ini adalah method utama (main method) dari program Java. Setiap program Java harus memiliki method utama dan harus memiliki signature yang persis seperti ini. Method utama adalah tempat di mana program dimulai saat dieksekusi.

3. System.out.println("Selamat Datang");: Ini adalah perintah untuk mencetak teks "Selamat Datang" ke konsol. Method println adalah method yang didefinisikan dalam kelas System.out, yang digunakan untuk mencetak teks ke konsol.

}: Ini menutup method utama.

}: Ini menutup kelas.

Jadi, program ini akan mencetak teks "Selamat Datang" ke konsol saat dijalankan.


public class KondisiOperator {
    public static void main (String[] args ){
       String status = "";
       int grade = 80;
       
       //mendapatkan status pelajar
       status = (grade >= 60)?"Passed":"Fail";
       
       //print status
       System.out.println(status);
    }
}
Program di atas merupakan contoh penggunaan operator kondisi (ternary operator) dalam bahasa pemrograman Java. Berikut adalah penjelasan dari setiap baris kode:

public class KondisiOperator {: Ini adalah deklarasi kelas Java dengan nama "KondisiOperator". Nama kelas harus sesuai dengan nama file Java yang berisi kelas tersebut.

public static void main (String[] args ){: Ini adalah method utama (main method) dari program Java. Setiap program Java harus memiliki method utama dan harus memiliki signature yang persis seperti ini. Method utama adalah tempat di mana program dimulai saat dieksekusi.

String status = "";: Ini adalah deklarasi variabel status dengan tipe data String dan nilai awal kosong ("").

int grade = 80;: Ini adalah deklarasi variabel grade dengan tipe data int dan nilai awal 80.

status = (grade >= 60)?"Passed":"Fail";: Ini adalah contoh penggunaan operator kondisi (ternary operator) dalam Java. Jika nilai dari variabel grade lebih besar atau sama dengan 60, variabel status akan diisi dengan string "Passed", jika tidak, variabel status akan diisi dengan string "Fail".

System.out.println(status);: Ini adalah perintah untuk mencetak nilai dari variabel status ke konsol.

}: Ini menutup method utama.

}: Ini menutup kelas.

Jadi, program ini akan mencetak nilai "Passed" ke konsol karena nilai dari variabel grade (80) lebih besar dari atau sama dengan 60. Jika nilai variabel grade diubah menjadi 50, maka nilai dari variabel status akan menjadi "Fail" karena nilai grade tidak mencukupi untuk lulus.


///Apa yang Disebut Bahasa Pemrograman?
Bahasa pemrograman adalah teknik komunikasi standar untuk mengekspresikan 
instruksi kepada komputer. Layaknya bahasa manusia, setiap bahasa memiliki tata tulis 
dan aturan tertentu. 
Bahasa pemrograman memfasilitasi seorang programmer untuk secara spesifik apa yang 
akan dilakukan oleh komputer selanjutnya, bagaimana data tersebut disimpan dan 
dikirim, dan apa yang akan dilakukan apabila terjadi kondisi yang variatif. 
Bahasa pemrograman dapat diklasifikasikan menjadi tingkat rendah, menengah, dan 
tingkat tinggi. Pergeseran tingkat dari rendah menuju tinggi menunjukkan kedekatan 
terhadap ”bahasa manusia”. 

///Alur Pembuatan Program 
1 Definisi Permasalahan
2 Analisa Permasalahan 
3 Desain Algoritma dan Representasi 
4 Pengkodean, Uji Coba dan Pembuatan Dokumentasi


BAB 2 
Pengenalan Bahasa JAVA


///Sejarah Singkat JAVA
Pada 1991, sekelompok insinyur Sun dipimpin oleh Patrick Naughton dan James 
Gosling ingin merancang bahasa komputer untuk perangkat konsumer seperti cable 
TV Box. Karena perangkat tersebut tidak memiliki banyak memori, bahasa harus 
berukuran kecil dan mengandung kode yang liat. Juga karena manufaktur – 
manufaktur berbeda memilih processor yang berbeda pula, maka bahasa harus 
bebas dari manufaktur manapun. Proyek diberi nama kode ”Green”. 
Kebutuhan untuk fleksibilitas, kecil, liat dan kode yang netral terhadap platform 
mengantar tim mempelajari implementasi Pascal yang pernah dicoba. Niklaus Wirth, 
pencipta bahasa Pascal telah merancang bahasa portabel yang menghasilkan 
intermediate code untuk mesin hipotesis. Mesin ini sering disebut dengan mesin 
maya (virtual machine). Kode ini kemudian dapat digunakan di sembarang mesin 
yang memiliki interpreter. Proyek Green menggunakan mesin maya untuk mengatasi 
isu utama tentang netral terhadap arsitektur mesin. 
Karena orang – orang di proyek Green berbasis C++ dan bukan Pascal maka 
kebanyakan sintaks diambil dari C++, serta mengadopsi orientasi objek dan bukan 
prosedural. Mulanya bahasa yang diciptakan diberi nama ”Oak” oleh James Gosling 
yang mendapat inspirasi dari sebuah pohon yang berada pada seberang kantornya, 
namun dikarenakan nama Oak sendiri merupakan nama bahasa pemrograman yang 
telah ada sebelumnya, kemudian SUN menggantinya dengan JAVA. Nama JAVA 
sendiri terinspirasi pada saat mereka sedang menikmati secangkir kopi di sebuah 
kedai kopi yang kemudian dengan tidak sengaja salah satu dari mereka 
menyebutkan kata JAVA yang mengandung arti asal bijih kopi. Akhirnya mereka 
sepakat untuk memberikan nama bahasa pemrograman tersebut dengan nama Java. 
Produk pertama proyek Green adalah Star 7 (*7), sebuah kendali jarak jauh yang 
sangat cerdas. Dikarenakan pasar masih belum tertarik dengan produk konsumer 
cerdas maka proyek Green harus menemukan pasar lain dari teknologi yang 
diciptakan. Pada saat yang sama, implementasi WWW dan Internet sedang 
mengalami perkembangan pesat. Di lain pihak, anggota dari proyek Green juga 
menyadari bahwa Java dapat digunakan pada pemrograman internet, sehingga 
penerapan selanjutnya mengarah menjadi teknologi yang berperan di web.


///Apa itu Teknologi JAVA?
1 Sebuah Bahasa Pemrograman
Sebagai sebuah bahasa pemrograman, Java dapat membuat seluruh bentuk aplikasi, 
desktop, web dan lainnya, sebagaimana dibuat dengan menggunakan bahasa 
pemrograman konvensional yang lain. 
Java adalah bahasa pemrograman yang berorientasi objek (OOP) dan dapat 
dijalankan pada berbagai platform sistem operasi. Perkembangan Java tidak hanya 
terfokus oada satu sistem operasi, tetapi dikembangkan untuk berbagai sistem 
operasi dan bersifat open source. 

2 Sebuah Development Environment
Sebagai sebuah peralatan pembangun, teknologi Java menyediakan banyak tools : 
compiler, interpreter, penyusun dokumentasi, paket kelas dan sebagainya. 

3 Sebuah Aplikasi 
Aplikasi dengan teknologi Java secara umum adalah aplikasi serbt a guna yang dapat 
dijalankan pada seluruh mesin yang memiliki Java Runtime Environment (JRE). 

4 Sebuah Deployment Environment 
Terdapat dua komponen utama dari Deployment Environment. Yang pertama adalah 
JRE, yang terdapat pada paket J2SDK, mengandung kelas – kelas untuk semua 
paket teknologi Java yang meliputi kelas dasar dari Java, komponen GUI dan 
sebagainya. Komponen yang lain terdapat pada Web Browser. Hampir seluruh Web 
Browser komersial menyediakan interpreter dan runtime environment dari teknologi 
Java.


///Mengapa Mempelajari JAVA?
Berdasarkan white paper resmi dari SUN, Java memiliki karakteristik berikut : 
1. Sederhana (Simple) 
Bahasa pemrograman Java menggunakan Sintaks mirip dengan C++ namun 
sintaks pada Java telah banyak diperbaiki terutama menghilangkan 
penggunaan pointer yang rumit dan multiple inheritance. Java juga 
menggunakan automatic memory allocation dan memory garbage collection. 
2. Berorientasi objek (Object Oriented) 
Java mengunakan pemrograman berorientasi objek yang membuat program 
dapat dibuat secara modular dan dapat dipergunakan kembali. Pemrograman 
berorientasi objek memodelkan dunia nyata kedalam objek dan melakukan 
interaksi antar objek-objek tersebut. 
3. Terdistribusi (Distributed) 
Java dibuat untuk membuat aplikasi terdistribusi secara mudah dengan adanya 
libraries networking yang terintegrasi pada Java. 
4. Interpreted 
Program Java dijalankan menggunakan interpreter yaitu Java Virtual Machine 
(JVM). Hal ini menyebabkan source code Java yang telah dikompilasi menjadi
Java bytecodes dapat dijalankan pada platform yang berbeda-beda. 
5. Robust 
Java mempuyai reliabilitas yang tinggi. Compiler pada Java mempunyai 
kemampuan mendeteksi error secara lebih teliti dibandingkan bahasa 
pemrograman lain. Java mempunyai runtime-Exception handling untuk 
membantu mengatasi error pada pemrograman. 
6. Secure 
Sebagai bahasa pemrograman untuk aplikasi internet dan terdistribusi, Java 
memiliki beberapa mekanisme keamanan untuk menjaga aplikasi tidak 
digunakan untuk merusak sistem komputer yang menjalankan aplikasi 
tersebut. 
7. Architecture Neutral 
Program Java merupakan platform independent. Program cukup mempunyai 
satu buah versi yang dapat dijalankan pada platform berbeda dengan Java 
Virtual Machine. 
8. Portable 
Source code maupun program Java dapat dengan mudah dibawa ke platform 
yang berbeda-beda tanpa harus dikompilasi ulang. 
9. Performance 
Performance pada Java sering dikatakan kurang tinggi. Namun performance 
Java dapat ditingkatkan menggunakan kompilasi Java lain seperti buatan Inprise, Microsoft ataupun Symantec yang menggunakan Just In Time 
Compilers (JIT). 
10. Multithreaded 
Java mempunyai kemampuan untuk membuat suatu program yang dapat 
melakukan beberapa pekerjaan secara sekaligus dan simultan. 
11. Dynamic 
Java didesain untuk dapat dijalankan pada lingkungan yang dinamis. Perubahan 
pada suatu class dengan menambahkan properties ataupun method dapat 
dilakukan tanpa menggangu program yang menggunakan class tersebut.



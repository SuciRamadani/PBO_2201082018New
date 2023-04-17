
      1. LatihanModul4_1
      public class LatihamModul4_1 {
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
  Program ini adalah program sederhana yang mencetak beberapa tipe data variabel ke dalam console menggunakan bahasa pemrograman Java.
Output dari program ini adalah:
10
a
true
hello
Penjelasan Kode Program:
public class LatihanModul4_1 adalah sebuah kelas Java yang dibuat dengan nama "LatihanModul4_1".
public static void main(String[] args) adalah sebuah method Java yang digunakan sebagai entry point dari program.
int number = 10 adalah sebuah variabel bertipe data integer dengan nama "number" dan diinisialisasi dengan nilai 10.
char letter = 'a' adalah sebuah variabel bertipe data char dengan nama "letter" dan diinisialisasi dengan karakter 'a'.
boolean result = true adalah sebuah variabel bertipe data boolean dengan nama "result" dan diinisialisasi dengan nilai true.
String str = "hello" adalah sebuah variabel bertipe data string dengan nama "str" dan diinisialisasi dengan nilai "hello".
Empat variabel yang telah diinisialisasi kemudian dicetak ke dalam console menggunakan empat perintah System.out.println().2.LatihanModul4_2

    2.LatihanModul4_2
    public class LatihanModul4_2 {
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

  Program ini adalah program sederhana yang mencetak tiga variabel integer dan rata-ratanya ke dalam console menggunakan bahasa pemrograman Java.
Output dari program ini adalah:
10
20
45
25
Penjelasan Kode Program:
public class LatihanModul4_2 adalah sebuah kelas Java yang dibuat dengan nama "LatihanModul4_2".
public static void main(String[] args) adalah sebuah method Java yang digunakan sebagai entry point dari program.
int number1 = 10, int number2 = 20, dan int number3 = 45 adalah tiga variabel bertipe data integer dengan masing-masing diinisialisasi dengan nilai 10, 20, dan 45.
int average adalah sebuah variabel bertipe data integer yang akan digunakan untuk menyimpan nilai rata-rata dari ketiga variabel di atas.
average = (number1+number2+number3)/3 adalah sebuah perintah untuk menghitung rata-rata dari ketiga variabel tersebut dan menyimpan hasilnya ke dalam variabel "average".
Empat variabel tersebut kemudian dicetak ke dalam console menggunakan empat perintah System.out.println().

    3.LatihanModul4_3
    public class LatihanModul4_3 {
        public static void main (String[] args ){
            int number1 = 10;
            int number2 = 23;
            int number3 = 5;
            int score = 0;

            score = (number2 > number3)?(number2>number1)?number2:number1:number3;

            System.out.println("number 1 = "+number1);
            System.out.println("number 2 = "+number2);
            System.out.println("number 3 = "+number3);
            System.out.println("nilai Tertingginya = "+score);
        }
    }

  Program ini adalah program sederhana yang mencari nilai tertinggi dari tiga variabel integer dan mencetak nilai tertinggi tersebut ke dalam console menggunakan bahasa pemrograman Java.
Output dari program ini adalah:
number 1 = 10
number 2 = 23
number 3 = 5
nilai Tertingginya = 23
Penjelasan Kode Program:
public class LatihanModul4_3 adalah sebuah kelas Java yang dibuat dengan nama "LatihanModul4_3".
public static void main(String[] args) adalah sebuah method Java yang digunakan sebagai entry point dari program.
int number1 = 10, int number2 = 23, dan int number3 = 5 adalah tiga variabel bertipe data integer dengan masing-masing diinisialisasi dengan nilai 10, 23, dan 5.
int score = 0 adalah sebuah variabel bertipe data integer yang akan digunakan untuk menyimpan nilai tertinggi dari ketiga variabel di atas.
score = (number2 > number3)?(number2>number1)?number2:number1:number3 adalah sebuah perintah untuk mencari nilai tertinggi dari ketiga variabel tersebut. Pada perintah ini, terdapat operator ternary yang mengecek apakah nilai number2 lebih besar dari number3. Jika iya, maka program akan mengecek apakah nilai number2 lebih besar dari number1. Jika iya, maka score akan diisi dengan nilai number2. Jika tidak, maka score akan diisi dengan nilai number1. Jika tidak, maka score akan diisi dengan nilai number3.
Empat variabel tersebut kemudian dicetak ke dalam console menggunakan empat perintah System.out.println().

      4.LatihanModul4_4
      public class LatihanModul4_4 {
          public static void main (String[] args ){
              String a = "((a/((b*c)*d)-c+f-(g-h)+i";
              int b = (((3*10)*2)/15)-2+((4*2)*2);
              String c ="((r*s)*t/u)-v+(w*x)-y++";
              System.out.println("Hasil = "+b);
          }
      }


  Program ini adalah program sederhana yang mendefinisikan tiga variabel, yaitu variabel a, b, dan c, dan mencetak nilai variabel b ke dalam console menggunakan bahasa pemrograman Java.
Output dari program ini adalah:
Hasil = 8
Penjelasan Kode Program:
public class LatihanModul4_4 adalah sebuah kelas Java yang dibuat dengan nama "LatihanModul4_4".
public static void main(String[] args) adalah sebuah method Java yang digunakan sebagai entry point dari program.
String a = "((a/((b*c)*d)-c+f-(g-h)+i"; adalah sebuah variabel bertipe data String yang diinisialisasi dengan nilai string "((a/((b*c)*d)-c+f-(g-h)+i".
int b = (((3*10)*2)/15)-2+((4*2)*2); adalah sebuah variabel bertipe data integer yang diinisialisasi dengan nilai hasil dari operasi matematika yang terdiri dari perkalian, pembagian, dan penjumlahan.
String c ="((r*s)*t/u)-v+(w*x)-y++"; adalah sebuah variabel bertipe data String yang diinisialisasi dengan nilai string "((r*s)t/u)-v+(wx)-y++".
System.out.println("Hasil = "+b); adalah sebuah perintah untuk mencetak nilai variabel b ke dalam console dengan menambahkan string "Hasil = " sebelum nilai variabel b.





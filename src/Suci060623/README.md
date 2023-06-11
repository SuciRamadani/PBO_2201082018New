

README MODUL 11

SOAL 1


11.6.1 Extend StudentRecord
Dalam latihan ini, kita ingin untuk membuat catatan siswa yang lebih khusus yang berisi
informasi tambahan tentang pengetahuan komputer siswa. Tugasnya adalah meng-extend
class StudentRecord yang mengimplementasikan pelajaran sebelumnya. Cobalah untuk
meng-override beberapa method yang ada dalam superclass StudentRecord, jika Anda
benar-benar membutuhkannya. 

DISINI KITA MEMBUTUHKAN 3 JAVACLASS, YAITU :

Ada tiga kelas yang diberikan: Student, StudentComputer, dan StudentRecord.
StudentComputer merupakan subkelas dari StudentRecord, 

yang berarti StudentComputer mewarisi properti dan metode dari StudentRecord.

Student juga merupakan subkelas dari Person, tetapi definisi kelas Person tidak diberikan dalam kodingan yang Anda berikan.

CLASS Student

public class Student extends Person{

    public Student(){
        super("Anna","Padang");
        System.out.println("Inside student:Constructor");
       //beberapa kode di sini
    } 

    @Override
    public String getName(){
        System.out.println("Student:getname");
        return name;
    }

    public static void main( String[] args ){
    Student anna = new Student();
    System.out.println("Nama "+anna.name);
    System.out.println("Alamat "+anna.address);
    } 
}

Kelas Student:

Kelas Student meng-extend kelas Person, tetapi definisi kelas Person tidak diberikan dalam kodingan yang diberikan.

Terdapat konstruktor public Student() yang memanggil konstruktor superclass Person dengan menggunakan super("Anna", "Padang"). Ini berarti konstruktor Student akan mengeset nama menjadi "Anna" dan alamat menjadi "Padang" saat sebuah objek Student dibuat.

Ada juga metode getName() yang di-override dari superclass Person. Metode ini mencetak "Student:getname" ke konsol dan mengembalikan nilai dari variabel name.

Di dalam metode main, sebuah objek Student dengan nama anna dibuat, dan kemudian atribut name dan address dicetak ke konsol.

CLASS StudentComputer

public class StudentComputer extends StudentRecord {

   double network;

   double pbo;

   double web;

   double average;


   //***NETWORK***//
   public double getNetwork (){

        return network;

    }

    public void setNetwork (double network){
        this.network = network;
    }

    //***PBO***//
     public double getPbo (){
        return pbo;
    }
    public void setPbo (double pbo){
        this.pbo = pbo;
    }

     //***WEB***//
    public double getWeb (){
        return web;
    }
    public void setWeb (double web){
        this.web = web;
    }


     public double getAverage (){
         average = (web + pbo + network)/3;
        return average;
    }
    public void setAverage (double average){
        this.average = average;
    }

    @Override
    public String getName(){
        System.out.println("StudentComputer = " + name);
        return name;
    }

    public static void main(String[] args){
        StudentComputer siswa1 = new StudentComputer();
            siswa1.setNetwork(90);
            siswa1.setPbo(80);
            siswa1.setWeb(70);

            StudentRecord ref;
            ref = siswa1;
            ref.setName("ALI");
            ref.setAddress("Padang");
            ref.setAge("19 Tahun");

            System.out.println("Nama      = " + ref.getName());
            System.out.println("Alamat    = " + ref.getAddress());
            System.out.println("Umur      = " + ref.getAge());
            System.out.println("\nNilai Kompetisi Komputer");
            System.out.println("PBO       = " + siswa1.getPbo());
            System.out.println("NETWORK   = " + siswa1.getNetwork());
            System.out.println("WEB       = " + siswa1.getWeb());
            System.out.println("Rata-rata = " + siswa1.getAverage());    
    }

}

Kelas StudentComputer:

Kelas StudentComputer merupakan subkelas dari StudentRecord.
Terdapat beberapa variabel seperti network, pbo, web, dan average yang digunakan untuk menyimpan nilai-nilai kompetisi komputer.

Setiap variabel memiliki metode getter (getNetwork(), getPbo(), getWeb(), getAverage()) dan setter (setNetwork(), setPbo(), setWeb(), setAverage()).

Ada juga metode getName() yang di-override dari superclass StudentRecord. Metode ini mencetak "StudentComputer = " diikuti dengan nilai dari variabel name ke konsol, dan mengembalikan nilai dari variabel name.

Di dalam metode main, sebuah objek StudentComputer dengan nama siswa1 dibuat.

Nilai-nilai kompetisi komputer seperti network, pbo, dan web diatur menggunakan metode setter.

Kemudian, objek siswa1 disimpan dalam variabel ref yang bertipe StudentRecord.

Variabel ref digunakan untuk mengakses dan mengubah properti name, address, dan age melalui metode setter.
Terakhir, properti dan nilai-nilai kompetisi komputer dicetak ke konsol menggunakan metode getter.

CLASS StudentRecord

public class StudentRecord {

    protected String name;
    protected String address;
    protected String age;

    public StudentRecord(){
        System.out.println("SuperClass");
    }

    public StudentRecord(String name, String address, String age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public StudentRecord(String name){
        this.name = name;
        this.address = "";
        this.age ="";
    }

    public String getName(){
        System.out.println("StudentRecord name:" + name);
        return name;
    }
    public String getAddress(){
        return address;
    }
     public String getAge(){
        return age;
    }


    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(String age){
        this.age= age;
    }
}


Kelas StudentRecord:

Kelas StudentRecord adalah superclass dari StudentComputer.

Terdapat beberapa konstruktor yang didefinisikan dalam kelas ini. Konstruktor default public StudentRecord() mencetak "SuperClass" ke konsol.

Terdapat juga metode getter (getName(), getAddress(), getAge()) dan setter (setName(), setAddress(), setAge()) untuk mengakses dan mengubah properti name, address, dan age.



SOAL 2


11.6.2 Bentuk Abstract Class

Cobalah untuk membuat class abstract yang dinamai Shape dengan method abstract
getArea() dan getName(). Tulis dua subclasses-nya yaitu Circle dan Square. Anda dapat
menambahkan method tambahan ke dalam subclasses jika diinginkan. 


DISINI KITA MEMBUTUHKAN 4 JAVACLASS, YAITU :

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public String getName() {
        return "Circle";
    }
}


Kelas Circle:

Kelas ini memiliki satu atribut radius yang bertipe double dan dijadikan sebagai private untuk membatasi akses langsung dari luar kelas.

Terdapat konstruktor Circle(double radius) yang menerima parameter radius dan menginisialisasi atribut radius dengan nilai yang diberikan.

Metode getArea() digunakan untuk menghitung luas lingkaran dengan rumus 3.14 * radius * radius dan mengembalikan hasilnya.

Metode getName() mengembalikan nilai string "Circle".


public class Square 

     private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String getName() {
        return "Square";
    }
}


Kelas Square:

Kelas ini memiliki satu atribut side yang bertipe double dan dijadikan sebagai private untuk membatasi akses langsung dari luar kelas.

Terdapat konstruktor Square(double side) yang menerima parameter side dan menginisialisasi atribut side dengan nilai yang diberikan.

Metode getArea() digunakan untuk menghitung luas persegi dengan rumus side * side dan mengembalikan hasilnya.

Metode getName() mengembalikan nilai string "Square".


class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String getName() {
        return "Square";
    }
}

penjelasan mengenai kelas Square:

Atribut side adalah sebuah variabel bertipe double yang digunakan untuk menyimpan panjang sisi persegi. Atribut ini dijadikan sebagai private, sehingga hanya dapat diakses di dalam kelas Square sendiri.

Terdapat sebuah konstruktor Square(double side) yang menerima parameter side dan menginisialisasi atribut side dengan nilai yang diberikan saat objek Square dibuat.

Metode getArea() digunakan untuk menghitung luas persegi dengan rumus side * side. Metode ini mengembalikan hasil perhitungan luas persegi sebagai nilai double.

Metode getName() mengembalikan nilai string "Square". Metode ini digunakan untuk mendapatkan nama bentuk geometri, dalam hal ini persegi.


public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Area of " + circle.getName() + ": " + circle.getArea());

        Square square = new Square(5);
        System.out.println("Area of " + square.getName() + ": " + square.getArea());
    }
}


Kelas Main:

Kelas ini memiliki metode main yang merupakan entry point untuk menjalankan program.
Di dalam metode main, sebuah objek circle dari kelas Circle dibuat dengan menggunakan konstruktor Circle(10). Kemudian, luas lingkaran dihitung menggunakan metode getArea() dan dicetak ke konsol beserta dengan nama objek menggunakan metode getName().
Selanjutnya, objek square dari kelas Square dibuat dengan menggunakan konstruktor Square(5). Luas persegi dihitung menggunakan metode getArea() dan dicetak ke konsol beserta dengan nama objek menggunakan metode getName().




BERIKUTNYA INI PENJELASAN TENTANG MATERI PRAKTEK PADA TANGGAL 26-05-2023

beberapa kelas yang saling berhubungan, yaitu Employee, PolimorfisExample, dan Person.

public class Employee extends Person{

    @Override
    public String getName(){
        System.out.println("Employee Name: "+name);
        return name;
    } 
}


Kelas Employee:

Kelas ini meng-extend kelas Person, yang berarti Employee merupakan subkelas dari Person.

Terdapat metode getName() yang di-override dari superclass Person. Metode ini mencetak "Employee Name: " diikuti dengan nilai dari variabel name ke konsol, dan mengembalikan nilai dari variabel name.



public class PolimorfisExample {

    public static void main(String[] args){
        Person ref;
        Student studentObject = new Student();
        Employee employeeObject = new Employee();

        studentObject.setName("Anna");
        employeeObject.setName("Budi");

        ref = studentObject;
        System.out.println("Nama : "+ref.getName());

        ref = employeeObject;
        System.out.println("Nama : "+ref.getName());
    }
    public static void printInformation(Person ref){
        if(ref instanceof Student){
            System.out.println("Nama Student : "+ref.getName());
            System.out.println("Alamat Student : "+ref.getAddress());
        } else if (ref instanceof Employee){
            System.out.println("Nama Employee : "+ref.getName());
            System.out.println("Alamat Employee : "+ref.getAddress());
        }
    }
}

Kelas PolimorfisExample:

Kelas ini memiliki metode main yang merupakan entry point untuk menjalankan program.

Di dalam metode main, objek studentObject dari kelas Student dan objek employeeObject dari kelas Employee dibuat.

Metode setName() dipanggil untuk mengatur nama objek studentObject menjadi "Anna" dan nama objek employeeObject menjadi "Budi".

Variabel ref dengan tipe Person dideklarasikan. Kemudian, objek studentObject di-assign ke variabel ref.

Kemudian, nilai yang dihasilkan dari pemanggilan metode getName() pada objek ref dicetak ke konsol.

Selanjutnya, objek employeeObject di-assign ke variabel ref, dan lagi-lagi, nilai yang dihasilkan dari pemanggilan metode getName() pada objek ref dicetak ke konsol.

Metode printInformation() juga didefinisikan, yang menerima parameter ref dengan tipe Person. Metode ini menggunakan instanceof untuk memeriksa apakah objek yang diterima adalah objek Student atau Employee, kemudian mencetak nama dan alamat sesuai dengan jenis objek yang diterima.


public class Person {

    protected String name;
    protected String address;

    /**
    * Default constructor
    */
    public Person(){
        System.out.println("Inside person:Constructor");
        name = "";
        address = "";
    }
    /**
    * Constructor dengan dua parameter
    */
    public Person( String name, String address ){
        this.name = name;
        this.address = address;
    }
    /**
    * Method accessor
    */
    public String getName(){
        System.out.println("Parent:getname");
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setName( String name ){
        this.name = name;
    }
    public void setAddress( String add ){
        this.address = add;
    }  
}


Kelas Person:

Kelas ini adalah superclass dari Employee dan Student.

Terdapat beberapa konstruktor yang didefinisikan dalam kelas ini, termasuk konstruktor default dan konstruktor dengan dua parameter name dan address.

Terdapat juga metode getter (getName(), getAddress()) dan setter (setName(), setAddress()) untuk mengakses dan mengubah properti name dan address.

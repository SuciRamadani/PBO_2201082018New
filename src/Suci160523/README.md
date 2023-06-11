
PENJELASAN LATIHAN MODUL 10

//PERTAMA

public class BukuAlamat {

private String nama;
private String alamat;
private String notelp;
private String email;

public BukuAlamat(){
    
}

public BukuAlamat(String nama, String alamat, String notelp, String email){
    this.nama = nama;
    this.alamat = alamat;
    this.notelp = notelp;
    this.email = email;
}

public String getNama(){
    return nama;
}

public void setNama(String nama){
    this.nama = nama;
}

public String getAlamat(){
    return alamat;
}

public void setAlamat(String alamat){
    this.alamat = alamat;
}

public String getNotelp(){
    return notelp;
}

public void setNotelp(String notelp){
    this.notelp = notelp;
}

public String getEmail(){
    return email;
}

public void setEmail(String email){
    this.email = email;
}

}

Kelas BukuAlamat adalah kelas yang merepresentasikan informasi buku alamat. Terdapat beberapa variabel instance (atau atribut) yang digunakan untuk menyimpan informasi tentang nama, alamat, nomor telepon, dan email. Terdapat juga beberapa metode yang digunakan untuk mengambil (getter) dan mengubah (setter) nilai-nilai tersebut.

//KEDUA

public class DataBukuAlamat {

private BukuAlamat[] data = new BukuAlamat[100];
private int index;

public void insert(BukuAlamat bukuAlamat){
    data[index] = bukuAlamat;
    index++;
}

public void update(int index, BukuAlamat bukuAlamat){
    data[index] = bukuAlamat;
}

public BukuAlamat[] getAll(){
    BukuAlamat[] temp = new BukuAlamat[index];
    for(int i=0;i<index;i++){
        temp[i]=data[i];
    }
    return temp;
}

public void delete(int index){
    data[index].setNama("");
    data[index].setAlamat("");
    data[index].setNotelp("");
    data[index].setEmail("");
}

public static void main(String[] args){
    DataBukuAlamat data = new DataBukuAlamat();
    BukuAlamat temp = new BukuAlamat();
    temp.setNama("Ali");
    temp.setAlamat("Padang");
    temp.setNotelp("1111");
    temp.setEmail("trisucir97@gmail.com");
    data.insert(temp);
    BukuAlamat temp1 = new BukuAlamat();
    temp1.setNama("Ani");
    temp1.setAlamat("Padang");
    temp1.setNotelp("1111");
    temp1.setEmail("trisucir97@gmail.com");
    data.insert(temp1); 
    //tampilkan
    BukuAlamat[] list = data.getAll();
    for(int i=0;i<list.length;i++){
        System.out.println("Buku Alamat ke--->"+(i+1));
        System.out.println("Nama    :"+list[i].getNama());
        System.out.println("Alamat  :"+list[i].getAlamat());
        System.out.println("No Telp :"+list[i].getNotelp());
        System.out.println("Email   :"+list[i].getEmail());
    }
}

}

Kodingan tersebut merupakan implementasi dari kelas DataBukuAlamat, yang memiliki atribut data bertipe array BukuAlamat dan index bertipe integer.

Method insert digunakan untuk memasukkan objek BukuAlamat ke dalam array data. Setiap objek yang dimasukkan akan disimpan pada indeks index dan index akan dinaikkan satu persatu setiap kali ada data yang dimasukkan.

Method update digunakan untuk mengubah data pada indeks tertentu dari array data dengan data baru yang diberikan.

Method getAll digunakan untuk mengambil semua data BukuAlamat yang telah dimasukkan ke dalam array data. Method ini akan mengembalikan array temp yang menyimpan semua data yang dimasukkan ke dalam array data.

Method delete digunakan untuk menghapus data pada indeks tertentu dari array data dengan mengosongkan semua atribut objek pada indeks tersebut.

Kemudian, terdapat method main yang digunakan untuk melakukan pengujian pada kelas DataBukuAlamat. Pada bagian ini, dibuat objek DataBukuAlamat dan dua objek BukuAlamat yaitu temp dan temp1 yang kemudian dimasukkan ke dalam data menggunakan method insert. Setelah itu, semua data yang telah dimasukkan akan ditampilkan menggunakan loop dan method getAll.

//KETIGA

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class MenuBukuAlamat {

public static void main(String[] args) {
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    DataBukuAlamat data = new DataBukuAlamat();
    int pil=0;
    try {
        
        while(pil!=5){
            System.out.println("1.Input Data");
            System.out.println("2.Hapus Data");
            System.out.println("3.Update Data");
            System.out.println("4.Tampilkan");
            System.out.println("5.Keluar");
            System.out.print("Pilihan Anda ?");
            pil =Integer.parseInt(dataIn.readLine());
            switch(pil){
                case 1:
                    BukuAlamat temp = new BukuAlamat();
                    System.out.print("Nama      :");
                    temp.setNama(dataIn.readLine());
                    System.out.print("Alamat    :");
                    temp.setAlamat(dataIn.readLine());
                    System.out.print("No Telp   :");
                    temp.setNotelp(dataIn.readLine());
                    System.out.print("Email     :");
                    temp.setEmail(dataIn.readLine());
                    data.insert(temp); 
                    break;
                case 4:
                    BukuAlamat[] list = data.getAll();
                    for(int i=0;i<list.length;i++){
                        System.out.println("Buku Alamat ke--->"+(i+1));
                        System.out.println("Nama    :"+list[i].getNama());
                        System.out.println("Alamat  :"+list[i].getAlamat());
                        System.out.println("No Telp :"+list[i].getNotelp());
                        System.out.println("Email   :"+list[i].getEmail());
                    }
                    break;
            }
        }

    } catch (Exception ex) {

    }
}

}

Kode di atas merupakan program Java yang berisi sebuah menu sederhana untuk mengelola data buku alamat. Program ini memanfaatkan kelas BukuAlamat dan DataBukuAlamat yang telah dibuat sebelumnya.

Program ini menggunakan BufferedReader untuk membaca input dari pengguna, kemudian menampilkan menu dengan opsi untuk input data, hapus data, update data, tampilkan semua data, atau keluar dari program.

Apabila pengguna memilih opsi untuk memasukkan data, program akan meminta pengguna untuk memasukkan nama, alamat, nomor telepon, dan email dari buku alamat baru, kemudian memasukkan data tersebut ke dalam objek DataBukuAlamat menggunakan metode insert.

Sementara itu, jika pengguna memilih opsi untuk menampilkan semua data, program akan memanggil metode getAll dari objek DataBukuAlamat, kemudian menampilkan semua data yang tersimpan dengan menggunakan perulangan for.

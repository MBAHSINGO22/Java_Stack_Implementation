package PERTEMUAN7;

public class Stack {
    // Atribut untuk menyimpan elemen-elemen dalam stack
    private int[] elemen;
    // Atribut untuk menunjukkan posisi elemen terdepan dalam stack
    private int front;
    // Atribut untuk menyimpan ukuran stack saat ini
    private int size;

    // Konstruktor default yang membuat stack dengan ukuran default 10
    public Stack() {
        this(10); // Memanggil konstruktor dengan parameter ukuran
    }

    // Konstruktor yang memungkinkan pembuatan stack dengan ukuran tertentu
    public Stack(int ukuran) {
        elemen = new int[ukuran]; // Membuat array dengan ukuran yang ditentukan
        front = 0; // Menetapkan posisi awal elemen terdepan
        size = 0; // Menetapkan ukuran awal stack
    }

    // Metode untuk menambahkan elemen ke stack
    public boolean push(int data) {
        if (size == elemen.length) { // Jika stack sudah penuh
            return false; // Mengembalikan false
        }
        elemen[front] = data; // Menambahkan data ke posisi front
        front = (front + 1) % elemen.length; // Mengupdate posisi front
        size++; // Mengupdate ukuran stack
        return true; // Mengembalikan true jika berhasil menambahkan
    }

    // Metode untuk menghapus elemen terdepan dari stack
    public int pop() {
        if (isEmpty()) { // Jika stack kosong
            return -1; // Mengembalikan -1
        }
        front = (front - 1 + elemen.length) % elemen.length; // Mengupdate posisi front
        size--; // Mengupdate ukuran stack
        return elemen[front]; // Mengembalikan elemen yang dihapus
    }

    // Metode untuk mendapatkan ukuran stack saat ini
    public int size() {
        return size; // Mengembalikan ukuran stack
    }

    // Metode untuk mengecek apakah stack kosong
    public boolean isEmpty() {
        return size == 0; // Mengembalikan true jika stack kosong
    }

    // Metode untuk mencetak elemen-elemen dalam stack
    public String cetak() {
        StringBuilder sb = new StringBuilder(); // Membuat StringBuilder untuk menyimpan string
        for (int i = 0; i < size; i++) { // Iterasi sebanyak ukuran stack
            int index = (front + i) % elemen.length; // Menghitung index elemen
            sb.append(elemen[index]).append(" "); // Menambahkan elemen ke StringBuilder
        }
        return sb.toString(); // Mengembalikan string yang berisi elemen-elemen stack
    }
}

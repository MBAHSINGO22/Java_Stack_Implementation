package PERTEMUAN7;

public class Main {
    public static void main(String[] args) {
        // Membuat objek stack dengan ukuran default
        Stack s = new Stack(); 
        // Menambahkan elemen ke stack
        s.push(23); 
        s.push(45); 
        s.push(56); 
        // Mencetak ukuran stack dan elemen-elemen dalam stack
        System.out.println("ukuran: " + s.size()+ "=>"+ s.cetak());

        // Menghapus elemen terdepan dari stack
        if (s.pop() == -1) 
            System.out.println("data sudah habis");
        else
            System.out.println("Ukuran : " + s.size() + " => " + s.cetak());

        // Menghapus elemen terdepan dari stack dan menyimpan ke variabel e
        int e = s.pop(); 
        // Mengecek apakah stack kosong
        if (s.isEmpty())
            System.out.println("data sudah habis");
        else
            System.out.println("Ukuran : " + s.size() + " => " + s.cetak());

        // Menambahkan elemen ke stack
        s.push(56); 
        // Menghapus elemen terdepan dari stack
        if (s.pop() == -1)
            System.out.println("data sudah habis");
        else
            System.out.println("Ukuran : " + s.size() + " => " + s.cetak());

        // Menghapus elemen terdepan dari stack
        if (s.pop() == -1) 
            System.out.println("data sudah habis");
        else
            System.out.println("Ukuran : " + s.size() + " => " + s.cetak());
    }
}

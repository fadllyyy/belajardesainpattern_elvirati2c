public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Mallard-------------");
        MallardDuck mallard = new MallardDuck();
        mallard.quack();
        mallard.swim();
        mallard.display();
        mallard.fly();

        System.out.println("-----------RedHead-------------");
        MallardDuck redhead = new MallardDuck();
        redhead.quack();
        redhead.swim();
        redhead.display();
        redhead.fly();

        System.out.println("-----------Rubber-------------");
        RubberDuck rubber = new RubberDuck();
        rubber.quack();
        rubber.swim();
        rubber.display();
        rubber.fly();

        System.out.println("-----------Wooden-------------");
        WoodenDuck wood = new WoodenDuck();
        wood.quack();
        wood.swim();
        wood.display();
        wood.fly();
    }
    class Mainn {
        public static void main(String[] args) {
            // Inisialisasi contoh concrete strategy
            StrategiHarga strategiElektronik = new StrategiElektronik();
            StrategiHarga strategiMakanan = new StrategiMakanan();

            // Inisialisasi context dengan strategi default
            PenentuHargaProduk penentuHargaProduk = new PenentuHargaProduk(strategiMakanan);

            // Penggunaan strategy
            double hargaProdukElektronik = 100;
            System.out.println("Harga Akhir Produk Elektronik: " + penentuHargaProduk.hitungHargaAkhir(hargaProdukElektronik));

            // Mengganti strategi saat runtime
            penentuHargaProduk.setStrategiHarga(strategiElektronik);
            System.out.println("Harga Akhir Produk Elektronik dengan Pajak: " + penentuHargaProduk.hitungHargaAkhir(hargaProdukElektronik));
        }
    }
}
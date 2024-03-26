// Interface Strategy
interface StrategiHarga {
    double hitungHarga(double harga);
}

// Concrete Strategy: Elektronik
class StrategiElektronik implements StrategiHarga {
    @Override
    public double hitungHarga(double harga) {
        return harga * 1.1; // Harga produk elektronik dikenakan pajak 10%
    }
}

// Concrete Strategy: Makanan
class StrategiMakanan implements StrategiHarga {
    @Override
    public double hitungHarga(double harga) {
        return harga; // Harga produk makanan tidak dikenakan pajak
    }
}

// Context
class PenentuHargaProduk {
    private StrategiHarga strategiHarga;

    public PenentuHargaProduk(StrategiHarga strategiHarga) {
        this.strategiHarga = strategiHarga;
    }

    public void setStrategiHarga(StrategiHarga strategiHarga) {
        this.strategiHarga = strategiHarga;
    }

    public double hitungHargaAkhir(double harga) {
        return strategiHarga.hitungHarga(harga);
    }
}
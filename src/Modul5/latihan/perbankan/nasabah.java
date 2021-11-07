package Modul5.latihan.perbankan;

public class nasabah {
        private String namaAwal;
        private String namaAkhir;
        private tabungan tabungan;

        public nasabah(String namaAwal, String namaAkhir){
            this.namaAwal = namaAwal;
            this.namaAkhir = namaAkhir;
        }

        public String getNamaAwal(){
            return namaAwal;
        }

        public String getNamaAkhir(){
            return namaAkhir;
        }

        public tabungan getTabungan(){
            return tabungan;
        }

        public void setTabungan(tabungan tabungan) {
            this.tabungan = tabungan;
        }
}

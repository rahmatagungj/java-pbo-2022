class bulan {
    public static void namabulan(String[] datar_nama_bulan) {
      for (int i = 0; i < datar_nama_bulan.length; i++) {
            System.out.println("Bulan " + datar_nama_bulan[i] + " 2022");
        }
    }

    public static void main(String[] args) {
        String[] datar_nama_bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        
        namabulan(datar_nama_bulan);
    }
}
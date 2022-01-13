class penjualan {
  public static void main(String[] args) {
    double harga = 2200.0; // harga ini bisa diganti untuk menentukan output
    double total = harga;
    double diskon = 0;
    double totalDiskon = 0;
    
    if (harga >= 2000) {
      diskon = 20;
      totalDiskon = harga * diskon / 100;
      total = harga - totalDiskon;
    } else if (harga >= 1000) {
      diskon = 10;
      totalDiskon = harga * diskon / 100;
      total = harga - totalDiskon;
    } else {
      total = harga;
    }

    System.out.println("Harga : " + harga);
    System.out.println("Discount : " + diskon + "% (" + totalDiskon + ")");
    System.out.println("Total : " + total);
  }
}
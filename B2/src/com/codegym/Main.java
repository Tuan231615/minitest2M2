package com.codegym;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(1, "oppo", 100000, 2, 10);
        products[1] = new Product(2, "asus", 90000, 1, 30);
        products[2] = new Product(3, "acer", 80000, 6, 40);
        products[3] = new Product(4, "alien", 30000, 3, 10);
        products[4] = new Product(5, "nice", 20000, 5, 70);
        System.out.println("Danh sach san pham la: ");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Tong tien san pham la: " + tongTienSanPham(products));
        System.out.println("Sau khi tru khuyen mai: " + TongTienSauSale(products));
        System.out.println("So tien duoc khuyen mai la: " + tongTienSale(products));
    }

    public static double tongTienSanPham(Product[] products) {
        double tongTienSanPham = 0;
        for (Product i : products) {
            tongTienSanPham += i.getTong();
        }
        return Math.round(tongTienSanPham);
    }

    public static double TongTienSauSale(Product[] products) {
        double TongTienSauSale = 0;
        for (Product i : products) {
            TongTienSauSale += i.getTienSale();
        }
        return Math.round(TongTienSauSale);
    }

    public static double tongTienSale(Product[] products) {
        double tongTienSale = 0;
        for (Product i : products) {
            tongTienSale += i.getTong() - i.getTienSale();
        }
        return Math.round(tongTienSale);

    }
}
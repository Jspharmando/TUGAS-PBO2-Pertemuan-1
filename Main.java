package com.company;

/**
 * @author
 * Nama : Joseph Armando Carvallo
 * NIM  : 10117077
 *
 **/

public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
            mhs1.nim = "10110269";
            mhs1.nama = "Rizky Adam Kurniawan";
            mhs1.perkenalanDiri(mhs1.nim, mhs1.nama);

        Mahasiswa mhs2 = new Mahasiswa();
            mhs2.nim = "10110270";
            mhs2.nama = "Indra Tiola";
            mhs2.perkenalanDiri(mhs2.nim, mhs2.nama);

        Mahasiswa mhs3 = new Mahasiswa();
            mhs3.nim = "10110269";
            mhs3.nama = "Muhammad Nur Awaludin";
            mhs3.perkenalanDiri(mhs3.nim, mhs3.nama);
    }
}

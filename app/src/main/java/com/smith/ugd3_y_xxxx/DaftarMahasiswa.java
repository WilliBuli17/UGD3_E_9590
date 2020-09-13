package com.smith.ugd3_y_xxxx;

import java.util.ArrayList;

public class DaftarMahasiswa {
    public ArrayList<Mahasiswa> MAHASISWA;

    public DaftarMahasiswa(){
        MAHASISWA = new ArrayList();
        MAHASISWA.add(PANDE);
        MAHASISWA.add(NATTE);
        MAHASISWA.add(ANDRE);
        MAHASISWA.add(GEDE);
        MAHASISWA.add(JOHN);
    }

    public static final Mahasiswa PANDE = new Mahasiswa("170709153", "Pande Nyoman Pradnya Darsana",
            "FTI", "Informatika", 3.1, "Adventure",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/YellowLabradorLooking.jpg/250px-YellowLabradorLooking.jpg");

    public static final Mahasiswa NATTE = new Mahasiswa("170709186", "Natte Vagonting Omang",
            "FTI", "Teknik Industri", 3.3, "Hiking",
            "https://cdn1-www.cattime.com/assets/uploads/2011/12/file_2744_british-shorthair-460x290-460x290.jpg");

    public static final Mahasiswa ANDRE = new Mahasiswa("170709115", "Andre Rossi Mandiri",
            "FT", "Teknik Arsitektur", 3.2, "Desain",
            "https://anjingdijual.com/files/jenis-anjing/foto/golden-retriever/g1.jpg");

    public static final Mahasiswa GEDE = new Mahasiswa("170218283", "Gede Gunawan Cahyadi",
            "FISIP", "Ilmu Komunikasi", 4.0, "Travelling",
            "https://asset-a.grid.id//crop/0x0:0x0/360x240/photo/2019/10/31/71888328.jpg");

    public static final Mahasiswa JOHN = new Mahasiswa("170119273", "John Cena",
            "FBE", "Manajemen", 2.0, "Boxing",
            "https://hips.hearstapps.com/digitalspyuk.cdnds.net/18/09/1519714967-john-cena-raw.jpg?crop=0.566xw:1.00xh;0.225xw,0&resize=480:*");

}

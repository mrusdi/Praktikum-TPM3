package com.example.recycleview;

import java.util.ArrayList;

public class FootballData {
    private static String[] title = new String[]{"Arsenal", "Aston Villa", "Chelsea",
            "Everton", "Manchester City", "NewCastel United", "Real Madrid", "Tottenham Hotspur", "Manchester United", "Liverpool "};

    private static int[] thumbnail = new
            int[]{R.drawable.arsenal, R.drawable.aston,
            R.drawable.chelsea, R.drawable.everton, R.drawable.mc, R.drawable.newcastel,
            R.drawable.realmadrid, R.drawable.totenham, R.drawable.united, R.drawable.liverpool};

    public static ArrayList<FootballModel> getListData() {
        FootballModel footballModel = null;
        ArrayList<FootballModel> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            footballModel = new FootballModel();
            footballModel.setLambangTeam(thumbnail[i]);
            footballModel.setNamaTeam(title[i]);
            footballModel.setPrivew(preview[i]);
            list.add(footballModel);
        }
        return list;
    }


    private static String[] preview = new String[]{
            "Arsenal Football Club (dikenal pula sebagai Arsenal atau The Gunners) adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London.\n" +
                    "\n",
            "Aston Villa Football Club juga dikenal sebagai Villa, The Villa, The Villans dan The Lions adalah klub sepak bola profesional yang bermarkas di Villa Park, Birmingham, Inggris. Klub ini bermain di Liga Utama Inggris dan merupakan salah satu klub pendiri Liga Sepak Bola (Football League) pada tahun 1888 serta Liga Utama Inggris pada tahun 1992. Aston Villa merupakan salah satu klub tertua dan tersukses Inggris.",
            "\n" +
                    " chealse adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris.Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955. Beberapa gelar dari berbagai kompetisi juga berhasil diraih pada dekade 1960-an, 1970-an, 1990-an, dan 2000-an. Sepanjang sejarah penampilan dalam dunia sepak bola di Inggris dan Eropa, Chelsea telah meraih enam gelar juara Liga Utama Inggris, delapan Piala FA, lima Piala Liga, dua Liga Eropa UEFA, dua Piala Winners UEFA, satu Liga Champions UEFA, dan satu Piala Super UEFA.",
            "everton adalah sebuah klub sepak bola profesional yang bermarkas di Kota Liverpool, Inggris yang saat ini berkompetisi di Liga Premier, divisi teratas Liga Inggris. Klub ini merupakan rival dari klub sekota Liverpool",
            "Musim 2020 menjadi era baru untuk Yos Adi Wicaksono. Kiper legenda futsal Indonesia ini ditunjuk menjadi pelatih kepala baru skuat setelah Dadang Iskandar diangkat jadi direktur Teknik tim.\n" +
                    "\n" +
                    "Tak beda jauh dengan pendahulunya, Yaw kembali memberdayakan pemain-pemain senior dan pegawai di PT Pelabuhan Indonesia cabang Jakarta tersebut. Nama-nama senior seperti Socrates Matulessy, Caisar Silitonga, Jailani Ladjanibi dan Sandy Gempur kembali ke dalam skuat.\n" +
                    "\n" +
                    "Selain itu, Pelindo juga menambah skuat dengan memasukan paket timnas futsal U-20 ke dalam tim yaitu Firman Ardiansyah, Ramadhan Zidani, Agung Pandega dan juga Muhammad Wildan.\n" +
                    "\n" +
                    "Musim pertama Yaw sebagai pelatih kepala bakal penuh tantangan mengingat Pelindo berada di grup B yang merupakan grup berat ditambah catatan tiga kali juara liga ini yang belum pernah lolos ke final four lagi sejak 2016.",
                    "Pelatih Wahyudin Kocoy mengarungi musim ketiganya bersama Giga FC Kota Metro dengan kerangka skuat yang tak berbeda jauh dengan musim sebelumnya.\n" +
                    "\n" +
                    "Beberapa pemain asli Lampung seperti Refani putra, Gilang Tangguh hingga pivot muda Hady Pradana sudah lebih matang untuk mengarungi musim 2020. Mereka ditopang dengan beberapa penambahan pemain dari luar Lampung.\n" + "\n" +
                    "Beberapa pemain senior seperti Moses Kernel, Afif Tamimy dan Andriyana serta kiper Maegel Nustelu masuk ke dalam proyeksi Kocoy untuk musim 2020 ditambah penambahan beberapa pemain muda seperti Egi Desta asal Bandung dan Hasriyadi, eks Young Rior asal Makassar.\n" + "\n" +
                    "Meski dengan skuat yang tak berbeda jauh, konsistensi tiap pekannya menjadi hal yang harus diperhatikan Giga jika masih ingin bersaing merebut tiket ke Final Four.",
                    "Didirikan pada 6 Maret 1902 sebagai Klub Sepak Bola Madrid, klub ini secara tradisional mengenakan seragam kandang putih sejak awal. Kata real dalam bahasa Spanyol untuk  dan diberikan kepada klub oleh Raja Alfonso XIII pada tahun 1920 bersama dengan mahkota kerajaan di lambangnya. Tim ini telah memainkan pertandingan kandangnya di Stadion Santiago Bernabéu yang berkapasitas 81.044 di pusat kota Madrid sejak 1947",
                     "Meski Pelindo IV Permata Indah telah hilang, bakat-bakat futsal di Sulawesi Selatan masih tertolong dengan bertahannya Young Rior Luwu Utara sebagai panggung mereka di kancah Profesional pada musim Liga 2020.\n" + "\n" +
                    "Lolos dari zona degradasi musim lalu, Young Rior yang hampir menjual slotnya ini tertolong dengan masuknya PT. Menara Antam Sejahtera (MAS) sebagai sponsor utama tim. Ada andil mantan manajer timnas futsal putri dan ketua Asosiasi Futsal Provinsi Sulawesi Selatan, Abdul Sadat, dalam dukungan MAS karena dirinya merupakan Direktur Utama anak perusahaan PT. Antam tersebut.\n" + "\n" +
                    "Hadirnya Abdul Sadat juga membantu pembentukan tim di mana eks Antam FC Jakarta bergabung ke dalam tim. Sebut saja Rahmatullah, Revi Afrian, Arief Hagi hingga Gerry Ferdinandus.\n" + "\n" +
                    "Selain itu beberapa nama pemain senior Makassar juga hadir seperti Rahmat Arsyad dan Fhandy Permana. Nama senior ini disandingkan dengan beberapa pemain muda Sulawesi Selatan seperti Ramdhan Jamaludin, Sahir hingga Ariansyah.",
            "Madura United FC merupakan klub sepak bola asal Indonesia yang berbasis di Pamekasan, Madura. Klub ini sebelumnya bernama Pelita Bandung Raya yang pada waktu itu berlaga di Liga Super Indonesia. Pemilik Pelita Bandung Raya, Ari D. Sutedi akhirnya menjual klubnya ke Achsanul Qosasi, dan kemudian bertransformasi menjadi Madura United FC. Kini, Madura United menjelma menjadi salah satu klub terkuat di liga utama Indonesia.",
            "sabuah klub main bal pasarta Liga Utama Inggris. Liverpool adalah klub tasuksis dalam sajarah main bal Inggris nang bamarkas di kuta Liverpool. Liverpool sudah mamanangakan 5 piala Liga Champions (bahari Piala Campions), 18 galar Liga Inggris, 7 Piala FA, lawan, 7 kali juara Piala Liga. Stadiunnya baada di Anfield, nang talatak sakitar 4,8 km matan pusat kuta Liverpool.\n"
    };

}
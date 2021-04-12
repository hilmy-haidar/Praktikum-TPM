package com.example.recycleview;

import java.util.ArrayList;

public class FootballData {
    private static String[] title = new String[]{"Robert Downey Jr. (Iron Man)","Chris Hemsworth (Thor)"," Chris Evan (Captain America)",
            "Mark Ruffalo (Hulk)","Scarlett Johansson (Black Widow)","Jeremy Renner (Hawkeye)","Sebastian Stan (Winter Soldier)","Chris Pratt (Star Lord)"," Benedict Cumberbatch (Doctor Stephen Strange)","Tom Hiddleston (Loki) "};

    private static int[] thumbnail = new
            int[]{R.drawable.im,R.drawable.th,
            R.drawable.ca,R.drawable.hulk,R.drawable.bw,R.drawable.he,
            R.drawable.ws,R.drawable.sl,R.drawable.ds,R.drawable.lo};

    private static String[] preview = new String[]{
            "Peran Iron Man pada diri Downey pun sangat melekat dan sepertinya agak sulit membayangkan jika karakternya diperankan oleh pemain lain. Tetapi, pihak Marvel Studios sempat menolak aktor ikonik ini beberapa kali lho, Toppers.\n"
            ,
            "Chris memulai karirnya dari sebuah film seri Guineveer Jones pada tahun 2002 dan opera sabun di Australia dengan judul Home and Away.\n" +
                    "\n" +
                    "Sebelum memainkan perannya sebagai Thor, adiknya, Liam Hemsworth dan Alexander Skarsgard, aktor asal Swedia juga mengikuti audisi untuk memainkan karakternya.",
            "Aktor berkarisma, Chris Evan kabarnya pernah menolak peran Captain America beberapa kali. Menurutnya, keputusan menyetujui kontrak dalam jangka waktu panjang adalah sebuah keputusan besar.",
            "Mark Ruffalo adalah aktivis penentang ekploitasi sumber daya alam berlebihan. Bahkan, aktor berusia 49 tahun ini mendapat penghargaan Meera Gandhi Giving Back Foundation Award dan Global Green Millenium Award karena kepeduliannya terhadap lingkungan."
            ,
            "Tidak perlu diragukan lagi aura dan penampilan Scarlett Johansson mampu membuat orang-orang terpukau. Aktris kelahiran New York ini merupakan saudara kembar dari Hunter Johansson dan Forbes menyatakan ia memegang urutan nomor satu sebagai aktris Hollywood dengan bayaran tertinggi."
            ,
            "Untuk memainkan perannya sebagai Hawkeye, Jeremy Renner menerima pelatihan dari pemanah Olimpiade. Renner mempelajari dasar-dasar serta posisi yang tepat sebagai ahli pemanah."
            ,
            "Sebelum berperan sebagai Bucky, Sebastian Stan juga sempat mengikuti audisi peran Captain America. Pada film Captain America: Civil War, Stan harus menggunakan lengan metal baru untuk perannya."
            ,
            "Chris Pratt sangat luwes dalam berbahasa Jerman, sebelum kesuksesannya seperti sekarang, ia juga pernah menjadi tunawisma dan tinggal dalam mobil van. Aktor ini juga sebenarnya adalah seorang musisi yang menganggap Elvis Presley dan Johnny Cash sebagai pahlawan musiknya."
            ,
            "Aktor berkebangsaan Inggris, Benedict Cumberbatch pernah mengalami pengalaman tidak menyenangkan ketika dirinya sedang berada di Afrika Selatan. Ben serta beberapa orang lain yang sedang bersamanya mengalami pembajakan mobil lalu, menculiknya."
            ,
            "Ketika audisi, Tom Hiddleston sebenarnya mengambil peran Thor tetapi dinilai kurang cocok sehingga akhirnya ia memerankan peran adik angkatnya yaitu Loki."

    };

    public static ArrayList<FootballModel> getListData(){
        FootballModel footballModel = null;
        ArrayList<FootballModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            footballModel = new FootballModel();
            footballModel.setLambangTeam(thumbnail[i]);
            footballModel.setNamaTeam(title[i]);
            footballModel.setPrivew(preview[i]);
            list.add(footballModel);
        }
        return list;
    }
}

package com.siroj.trenkur.model

import com.siroj.trenkur.R

object ShavingStylesData {
    private val shavingStyleTitles = arrayOf(
        "Undercut",
        "Top knot",
        "Buzz cut",
        "Front puff",
        "Pompadour",
        "Quiff",
        "Caesar fade",
        "Slicked back undercut",
        "Disconnect undercut",
        "Comb over undercut",
        "Line up haircut",
        "Afro fade",
        "Puffy undercut",
        "Patterned fade"
    )

    private val shavingStyleDetails = arrayOf(
        "Di tahun 2019 ini banyak bermunculan model rambut pria pendek yang variatif, keren dan juga trendi. Pengembangan model rambut dengan potongan model undercut sempat populer beberapa waktu lalu, masih menjadi tampilan panutan dan primadona. Pria masa kini terbukti sangat memerhatikan penampilan dibanding beberapa dekade lalu.\nPria selalu berusaha untuk mengikuti tren yang sedang bergulir. Model rambut undercut memang masih menjadi yang paling banyak diminati saat ini dan menjadi salah satu tren gaya rambut ikonik di kalangan kaum pria. Hal ini dikarenakan potongan rambut undercut terbilang sederhana, simpel, segar, dan praktis.",
        "Model rambut pria top knot sering digunakan oleh masyarakat tradisional Jepang. Cara pemotongan model rambut pendek pria top knot yaitu rambut bagian samping kanan dan kiri dibuat tipis habis hingga plontos, begitu pula dengan rambut bagian belakang. Kemudian rambut bagian atas dibiarkan panjang agar bisa dikuncir. Gaya rambut top knot ini cocok untuk para pria berambut pendek dan berwarna hitam.",
        "Model rambut pria pendek rapi tipe buzz cut memiliki ciri khas rambut yang terbilang tipis. Biasanya model buzz-cut kerap digunakan oleh para anggota militer. Hindari memberi warna cerah. Warna hitam yang natural dan alami akan lebih disarankan. Pastinya, gaya rambut yang sesuai dengan bentuk wajah dan kepala, akan membuat penampilan kamu semakin menarik.\nCobalah untuk mengatur model rambutmu sedemikian rupa tanpa memperhatikan bentuk kepala, tentu penampilan akan menjadi kurang menarik dan tidak percaya diri dibuatnya. Benar, bukan?",
        "Gaya rambut pria satu ini merupakan perpaduan dari gaya rambut medium bangs (berponi) dan voluminous pompadour (pompadour yang bervolume). Kesan unik memang lebih ditonjolkan lewat potongan rambut ini.",
        "Gaya rambut pendek pria model pompadour ini sangat cocok buat kamu yang memiliki bentuk wajah oval. Walaupun ketenaran model rambut pompadour ini sudah mulai meredup, namun beberapa pria yang biasa menggunakan pomade masih menerapkan model rambut ini. Model rambut seperti ini akan memberikan kesan macho, trendi, dan kekinian. Cocok untuk wajah yang berjenggot ataupun tidak, kamu akan terlihat keren saat memakai model rambut pompadour.",
        "Bagi kamu yang mau terlihat lebih maskulin dan keren, potongan rambut pendek pria quiff ini bisa menyempurnakan pemilik wajah oval. Karena karakter wajah oval yang cenderung memanjang membuat model rambut quiff lebih terlihat. Model rambut ini membuat kamu mudah mengaturnya.\n\nUntuk penataannya, kamu bisa menggunakan pomade atau clay supaya bisa bertahan lama dan tidak merubah bentuknya. Kamu bisa menggunakan model rambut quiff pada acara formal maupun acara santai.",
        "Model potongan rambut pria caesar fade memiliki ciri khas bagian samping dan belakang yang sangat tipis, sedangkan pada bagian atas rambut dibiarkan sedikit panjang. Gaya rambut pria ini dibentuk dengan bagian atas panjang dan semakin menipis hingga hilang di bagian bawah.\n\nPenipisan ketebalan rambut tersebut dimulai dari bagian atas kepala hingga kebagian leher. Gaya rambut caesar fade ini memiliki kelebihan yaitu bagian atas rambut bisa disisir ke semua arah sesuai dengan selera kamu. Gaya rambut caesar fade ini cukup banyak digemari terutama bagi kamu yang memiliki selera rambut dengan ukuran sangat pendek.",
        "Style rambut pria gaya undercut yang akan membuat penampilan kamu menjadi klimis karena bagian rambut yang masih banyak akan disisir ke arah belakang. Setelah itu akan diberi gel rambut supaya nampak sleek, lebih gagah, dan maskulin.\n\nGaya rambut undercut ini terlihat klasik dan cool. Selain menyisir ke arah belakang dengan arah lurus, kamu bisa juga menyisir ke arah belakang menuju arah kanan, atau kiri.",
        "ika kamu sudah memiliki hairstyle pria seperti ini bukan berarti bisa dibiarkan begitu saja. Kamu harus bisa menatanya dengan baik agar bisa mendapatkan hasil menarik yang maksimal.\n\nMeski ada beberapa gaya yang sulit dibuat dan tidak bisa diaplikasikan ke dalam kegiatan sehari-hari karena akan menyita waktu yang lama, disconnect undercut ini juga merupakan jenis salah satu model potongan undercut yang terbilang tidak mudah sehingga yang melakukannya harus benar-benar handal.",
        "Comb over adalah cara menyisir rambut ke atas yang sudah lama sehingga menjadi gaya rambut yang paling kontemporer. Model rambut ini menyatukan gaya garis menyisir dengan gaya horizontal serta menyatukannya dengan undercut pada bagian bawahnya. Akan ada sisi kontras yang terlihat antara rambut yang paling bervolume pada bagian atas dengan sisi samping yang lebih pendek.\n\nMirip dengan gaya pompadour, sisirlah rambut ke atas dengan berbagai gaya. Gunakan pomade agar rambut bagian atas tetap melekat pada tempatnya. Kamu juga bisa menata gaya rambut ini adalah dengan teknik gradasi. Dari bagian leher rambut dibuat paling tipis. Semakin naik maka semakin tebal dan panjang. Namun pada bagian sampingnya rambut dibuat memudar. Kemudian rambut depannya disisir ke atas dan berakhir ke bagian belakang.",
        "Memasuki awal tahun 2019, model rambut pria pendek masih menjadi salah satu model rambut yang diminati dan banyak digemari para pria. Salah satunya line up haircut, model rambut pendek yang sangat simpel. Kamu tidak akan repot merawat rambut, karena potongan ini sangat tipis. Gaya rambut pendek Zayn Malik ini juga bisa banget ditiru pria Indonesia.",
        "Untuk teknik pemotongan rambut model afro fade ini pun memiliki teknik yang tidak sembarang. Efek gradasi dari tebal hingga tipis ini memerlukan ketelitian yang tajam. Gaya rambut ini cocok untuk pria yang tidak mau terlalu terlihat penuh gaya. Potongan simple dan stylish ini bisa menjadi inspirasi pengganti line up haircut.\n\nKamu hanya perlu memotong sisi samping kanan dan kiri bagian rambut. Dan mempertahankan panjang rambut bagian tengah. Ditambah dengan gaya rambut yang pas, aura manis pria berkulit gelap seakan terpancar dari gaya rambutnya.",
        "Puffy undercut memiliki ciri khas pada bagian atas yang disisir menggembung sehingga membentuk sebuah jambul. Rambut kamu harus disisir ke arah atas maka dari itu rambut bagian tengah harus sedikit panjang. Dibandingkan dengan gaya rambut slicked back, gaya rambut ini terbilang lebih sulit dibuat. Diperlukan trik khusus agar rambut tetap mengarah ke atas.\n\nKamu bisa menggunakan pomade yang bagus sehingga tatanan rambut tidak mudah rusak. Akan sangat baik jika rambutmu terbilang tebal Bisa juga dengan cara menggunakan mousse yang akan membuatnya menjadi lebih bervolume. Perpaduan antara mousse dan pomade akan semakin menambah keindahan dari model puff undercut ini.",
        "Berbicara soal gaya rambut patterned fade memang sangat unik, karena garisan pada rambut dapat menjadi suatu nilai maskulinitas. Seperti halnya pesepak bola yang tampil dengan gaya rambut patterned fade.\n\nModel rambut ini adalah fade yang membentuk pola. Kamu bisa minta sang kapster membuat pola sesuai referensi kamu. Lebih baik buatlah pola yang tidak terlalu rumit dan juga tidak terlalu sederhana. Karena jika terlalu sederhana, model rambut kamu akan terlihat seperti pitak."
    )

    private val shavingStylePhotos = intArrayOf(
        R.drawable.undercut,
        R.drawable.topknot,
        R.drawable.buzzcut,
        R.drawable.frontpuff,
        R.drawable.pompadour,
        R.drawable.quiff,
        R.drawable.caesarfade,
        R.drawable.slickedback,
        R.drawable.disconnect,
        R.drawable.combover,
        R.drawable.lineup,
        R.drawable.afrofade,
        R.drawable.puffy,
        R.drawable.patterned
    )

    val ListData: ArrayList<ShavingStyle>
        get() {
            val list = arrayListOf<ShavingStyle>()
            for (position in shavingStyleTitles.indices) {
                val shavingStyle = ShavingStyle()
                shavingStyle.title = shavingStyleTitles[position]
                shavingStyle.detail = shavingStyleDetails[position]
                shavingStyle.photo = shavingStylePhotos[position]

                list.add(shavingStyle)
            }
            return list
        }
}
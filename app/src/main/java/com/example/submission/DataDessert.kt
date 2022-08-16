package com.example.submission

object DataDessert {
    private val namaDessert = arrayOf(
        "MilkTea Boba",
        "Cheesy Milk",
        "Choco Lava",
        "Matcha",
        "Milo",
        "Oreo",
        "Red Velvet",
        "Regal",
        "Strawberry Youghurt",
        "Tiramisu"
    )

    private val detailDessert = arrayOf(
        "MilkTea Boba adalah perpaduan antara butter cake dengan thai tea flavor dilapis thai tea cream ditaburi biscuit crumb yang sangat lezat dan pastinya dengan topping boba yang melimpah diatasnya.",
        "Cheesy Milk adalah perpaduan antara milk, cheese dan juga cake yang lembut. Memiliki tekstur yang lumer di mulut dan cita rasa keju yang kuat. Dessert Box ini paling banyak diminati kaum milenial loh!",
        "Choco Lava adalah dessert box yang di dalamnya ada cheese, ada buttercake coklat dan belgium chocolate dan salted caramel juga. Dan yang pasti bikin nagih!",
        "Double cake matcha dan di filling dengan cream cheese lalu di siram dengan bubuk Matcha dan coklat greentea! cake dan creme cheese nya lembut, karna cake dan creme cheese mengandung butter jadi kalau dimasukkan kechiller bisa keras jadi lebih enak.",
        "Milo dessert box ini yaitu perpaduan antara Milo dan cake coklat yang lembut dilapis dengan cream kemudian ditaburi dengan bubuk milo yang banyak.",
        "Oreo dessert box adalah perpaduan antara Oreo dan cake coklat yang lembut dilapis dengan cream kemudian ditaburi dengan bubuk Oreo yang bikin nagih.",
        "Red Velvet yang memiliki rasa earthy dari buah bit memang paling nikmat saat dipadukan dengan rasa kacang karamel alias nougat.",
        "REGAL DESSERT BOX?! yang pakai coklat leleh tapi coklatnya engga berasa coklat! Coklatnya pake gold caramel yang rasanya manis tapi engga kemanisan! Apalagi ada REGAL CURD yang bikin candu banget",
        "Perpaduan antara Strawberry yang segar dengan cake yang lembut. Memiliki tekstur yang lumer di mulut dan cita rasa youghurt yang kuat membuat makanan ini menjadi sangat enak.",
        "Dessert Box tapi Rasa Kopi? Emang ada? Tiramisu Dessert Box jawabannya! Perpaduan Kopi dengan cake dan cream yang sangat enak, Rasanya Super Creammy!"
    )

    private val gambarDessert = intArrayOf(
        R.drawable.boba,
        R.drawable.cheese,
        R.drawable.chocolate,
        R.drawable.matcha,
        R.drawable.milo,
        R.drawable.oreo,
        R.drawable.redvelvet,
        R.drawable.regal,
        R.drawable.strawberry,
        R.drawable.tiramisu
    )

    private val harga = arrayOf(
        "Rp. 65.000",
        "Rp. 70.000",
        "Rp. 60.000",
        "Rp. 65.000",
        "Rp. 60.000",
        "Rp. 70.000",
        "Rp. 65.000",
        "Rp. 65.000",
        "Rp. 60.000",
        "Rp. 65.000"
    )

    private val stockDessert = intArrayOf(20, 25, 30, 22, 10, 20, 29, 18, 30, 25)

    private val expired = intArrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5, 5)

    private val note = arrayOf(
        " -Semua makanan yang kami kirim dalam keadaan fresh dan baru.\n -Customer diharapkan melakukan pemesanan satu hari sebelumnya.\n -Pengiriman dikirimkan setiap hari kecuali hari libur nasional.",
        " -Semua makanan yang kami kirim dalam keadaan fresh dan baru.\n -Customer diharapkan melakukan pemesanan satu hari sebelumnya.\n -Pengiriman dikirimkan setiap hari kecuali hari libur nasional.",
        " -Semua makanan yang kami kirim dalam keadaan fresh dan baru.\n -Customer diharapkan melakukan pemesanan satu hari sebelumnya.\n -Pengiriman dikirimkan setiap hari kecuali hari libur nasional.",
        " -Semua makanan yang kami kirim dalam keadaan fresh dan baru.\n -Customer diharapkan melakukan pemesanan satu hari sebelumnya.\n -Pengiriman dikirimkan setiap hari kecuali hari libur nasional.",
        " -Semua makanan yang kami kirim dalam keadaan fresh dan baru.\n -Customer diharapkan melakukan pemesanan satu hari sebelumnya.\n -Pengiriman dikirimkan setiap hari kecuali hari libur nasional.",
        " -Semua makanan yang kami kirim dalam keadaan fresh dan baru.\n -Customer diharapkan melakukan pemesanan satu hari sebelumnya.\n -Pengiriman dikirimkan setiap hari kecuali hari libur nasional.",
        " -Semua makanan yang kami kirim dalam keadaan fresh dan baru.\n -Customer diharapkan melakukan pemesanan satu hari sebelumnya.\n -Pengiriman dikirimkan setiap hari kecuali hari libur nasional.",
        " -Semua makanan yang kami kirim dalam keadaan fresh dan baru.\n -Customer diharapkan melakukan pemesanan satu hari sebelumnya.\n -Pengiriman dikirimkan setiap hari kecuali hari libur nasional.",
        " -Semua makanan yang kami kirim dalam keadaan fresh dan baru.\n -Customer diharapkan melakukan pemesanan satu hari sebelumnya.\n -Pengiriman dikirimkan setiap hari kecuali hari libur nasional.",
        " -Semua makanan yang kami kirim dalam keadaan fresh dan baru.\n -Customer diharapkan melakukan pemesanan satu hari sebelumnya.\n -Pengiriman dikirimkan setiap hari kecuali hari libur nasional."
    )


    val dataList: ArrayList<Dessert>
        get() {
            val list = arrayListOf<Dessert>()
            for (position in namaDessert.indices) {
                val dessert = Dessert()
                dessert.nama = namaDessert[position]
                dessert.detail = detailDessert[position]
                dessert.photo = gambarDessert[position]
                dessert.tvstock = stockDessert[position].toString()
                dessert.expired = expired[position].toString()
                dessert.tvharga = harga[position]
                dessert.tvnote = note[position]
                list.add(dessert)
            }
            return list
        }
}

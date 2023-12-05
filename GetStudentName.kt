package arrays


/**
 * Parameter [listSiswa] berisi:
 *
 * [[Mamang, Sumanggimang, Mafdhil, Joko, Sujoko, Sumamang, Sangmamang, Siamang]]
 *
 * Coba dapatkan "Sujoko" melalui parameter [listSiswa]
 *
 */
fun getStudentName(listSiswa: Array<String>): String {
    var namaSiswa = ""

    val listSiswa  = arrayOf(
        "Mamang",
        "Sumanggimang",
        "Mafdhil",
        "Joko",
        "Sujoko",
        "Sumamang",
        "Sangmamang",
        "Siamang"
    )

    namaSiswa = listSiswa[3]

    return namaSiswa
}
package ints

/**
 *
 * Logika:
 *
 * [nilaiA], [opsiMatematika], [nilaiB]
 *
 * Opsi Matematika tersedia:
 *
 * - tambah
 * - kurang
 * - kali
 * - bagi
 *
 * | Perhatikan huruf kapitalnya yak!
 *
 */

fun matematika(
    nilaiA: Int,
    nilaiB: Int,
    opsiMatematika: String
): Int {

    var hasil = 0

    if (opsiMatematika == "tambah") {
        hasil = nilaiA + nilaiB
    }else if(opsiMatematika == "kurang"){
        hasil = nilaiA - nilaiB
    }else if (opsiMatematika == "kali"){
        hasil = nilaiA * nilaiB
    }else if (opsiMatematika == "bagi"){
        hasil = nilaiA / nilaiB
    }



    return hasil
}
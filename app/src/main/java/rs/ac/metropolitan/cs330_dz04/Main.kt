package rs.ac.metropolitan.cs330_dz04

import kotlin.random.Random

fun main() {
    val predmeti = Predmeti()
    val predmet1 = Predmet("CS330", "Razvoj mobilnih aplikacija", 8, 4, true)
    val predmet2 = Predmet("CS101", "Uvod u programiranje", 6, 1, true)
    val predmet3 = Predmet("IT350", "Baze podataka", 7, 2, true)

    predmeti.dodajPredmet(predmet1)
    predmeti.dodajPredmet(predmet2)
    predmeti.dodajPredmet(predmet3)

    val student1 = Student(5000, "Atila", "Kujundzic", emptyList())
    val student2 = Student(4000, "Sinan", "Sakic", emptyList())
    val student3 = Student(3000, "Pera", "Detlic", emptyList())

    val studenti = listOf(student1, student2, student3)
    val predmetiList = listOf(predmet1, predmet2, predmet3)



    studenti.forEach { student ->
        val randomPredmet = predmetiList[Random.nextInt(predmetiList.size)]
        predmeti.registruj(student, randomPredmet)
    }


    studenti.forEach { student ->
        val randomPredmet = predmetiList[Random.nextInt(predmetiList.size)]
        predmeti.odjavi(student, randomPredmet)
    }

}






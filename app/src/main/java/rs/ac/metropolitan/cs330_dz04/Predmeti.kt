package rs.ac.metropolitan.cs330_dz04

class Predmeti:Interfejs {
val predmeti= mutableListOf<Predmet>()
    override fun registruj(s: Student, p: Predmet) {
        println("Student ${s.ime} ${s.prezime} je uspesno prijavljen na predmet ${p.naziv}")
        predmeti.add(p)
    }

    override fun odjavi(s: Student, p: Predmet) {
        println("Student ${s.ime} ${s.prezime} je uspesno odjavljen sa predmeta ${p.naziv}")
        predmeti.remove(p)
    }
    fun dodajPredmet(predmet: Predmet?) {
        if (predmet != null) {
            predmeti.add(predmet)
        }
    }

}
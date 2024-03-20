package rs.ac.metropolitan.cs330_dz04

data class Predmet(val sifra:String,val naziv:String,val espb:Int,val semestar:Int,val obavezan:Boolean) {
    override fun toString(): String {
        return "$sifra-$naziv ESP:$espb semestar:$semestar (${if(obavezan) "obavezan" else "izborni"})"
    }
}
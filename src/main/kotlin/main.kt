val fabryka = FabrykaRobotow;

fun main(args: Array<String>) {
    val tablicaRoboty: MutableList<RobotKuchenny> = ArrayList();


    for (i in 1..20) {
        tablicaRoboty.add(fabryka.stworzRobotaLosowo());



    }

    tablicaRoboty.forEach {
        println(it.pobierzNazwe())

    }




    println(Sortownik.grupuj(tablicaRoboty));



}

object Sortownik {//singleton
    fun grupuj(roboty: MutableList<RobotKuchenny>): Map<String, Int> {
        return roboty.groupingBy { it.pobierzNazwe() }.eachCount();

    }
}
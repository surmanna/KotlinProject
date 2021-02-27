class Bosch(val robot: Roboty): RobotKuchenny {
    val nazwa: String by Delegacja(robot);
    override fun ubijJajko() {
        println("Robot Bosch, ubija jajko")
    }

    override fun wyrobCiasto() {
        println("Robot Bosch, wyrabia ciasto")
    }

    override fun wyrobCiastonaNalesniki() {
        println("Robot Bosch, wyrabia ciasto na nalesniki")
    }

    override fun pobierzNazwe(): String {
        return nazwa;
    }
}
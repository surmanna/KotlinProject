class Philips(val robot: Roboty): RobotKuchenny {
    val nazwa: String by Delegacja(robot);

    override fun ubijJajko() {
        println("Robot Philips, ubija jajko")
    }

    override fun wyrobCiasto() {
        println("Robot Philips, wyrabia ciasto")
    }

    override fun wyrobCiastonaNalesniki() {
        println("Robot Philips, wyrabia ciasto na nalesniki")
    }

    override fun pobierzNazwe(): String {
        return nazwa;
    }
}
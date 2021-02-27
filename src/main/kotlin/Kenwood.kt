class Kenwood(val robot: Roboty): RobotKuchenny {
    val nazwa: String by Delegacja(robot);

    override fun ubijJajko() {
        println("Robot Kenwood, ubija jajko")
    }

    override fun wyrobCiasto() {
        println("Robot Kenwood, wyrabia ciasto")
    }

    override fun wyrobCiastonaNalesniki() {
        println("Robot Kenwood, wyrabia ciasto na nalesniki")
    }

    override fun pobierzNazwe(): String {
        return nazwa;
    }
}
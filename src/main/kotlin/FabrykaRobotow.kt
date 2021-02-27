import java.lang.Exception
import kotlin.random.Random

class FabrykaRobotow {
    companion object{
        fun stworzRobota(robotType: Roboty): RobotKuchenny {
            return when(robotType){
                Roboty.PHILLIPS->Philips(robotType);
                Roboty.BOSCH->Bosch(robotType);
                Roboty.KENWOOD->Kenwood(robotType)
                else -> throw Exception();
            }
        }

        fun stworzRobotaLosowo(): RobotKuchenny{
            val rand1 = Random.nextInt(0, Roboty.values().size);

            return stworzRobota(Roboty.values()[rand1])
        }
    }
}
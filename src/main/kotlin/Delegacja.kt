import kotlin.reflect.KProperty

class Delegacja(val robot: Roboty) {

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "Wartość po oddelegowaniu: ${robot.name}"


    }

}
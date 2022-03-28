package pattern


/**
 * Factory
 *
 * @author xujianbo
 * @date 2021/3/9 4:25 下午
 * @since 1.0.0
 */
interface Computer {
    val cpu: String

    companion object Factory {
        fun produce(type: ComputerType): Computer {
            return when (type) {
                ComputerType.PC -> Pc("lfk")
                ComputerType.Server -> Server("axon")
            }
        }
    }
}


class Pc(override val cpu: String) : Computer

class Server(override val cpu: String) : Computer

enum class ComputerType {
    PC,
    Server
}

class ComputerFactory {
    fun produce(type: ComputerType): Computer {

        return when (type) {
            ComputerType.PC -> Pc("lfk")
            ComputerType.Server -> Server("axon")
        }
    }

}

// 使用单例
object ComputerSingle {
    fun produce(type: ComputerType): Computer {

        return when (type) {
            ComputerType.Server -> Server("axon")
            ComputerType.PC -> Pc("lfk")
        }
    }

}

class CompanionComputer {
    companion object {
        fun produce(type: ComputerType): Computer {

            return when (type) {
                ComputerType.PC -> Pc("lfk")
                ComputerType.Server -> Server("axon")
            }
        }
    }
}


fun main() {
    val cpu = ComputerFactory().produce(ComputerType.PC).cpu
    println(cpu)

    val cpu1 = CompanionComputer.produce(ComputerType.Server).cpu

    println(cpu1)


    val cpu2 = ComputerSingle.produce(ComputerType.PC).cpu
    println(cpu2)

    val cpu3 = Computer.produce(ComputerType.Server).cpu
    println(cpu3)


}
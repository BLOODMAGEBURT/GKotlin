package learn

import java.util.*

/**
 * Repository
 *
 * @author xujianbo
 * @date 2021/8/3 11:01 下午
 * @since 1.0.0
 */
class Repository
// keeping the constructor private to enforce the usage of getInstance
constructor() {
    private val users = mutableListOf<User>(User("sd"), User("sdf", "fef"));
    fun getUsers(): List<User> {
        return users
    }

    val formattedUserNames: List<String>
        get() {
            return users.map {
                if (it.lastName != null) {
                    "${it.firstName} ${it.lastName}"
                } else {
                    it.firstName
                }

            }

        }

    companion object {
        private var INSTANCE: Repository? = null
        val instance: Repository?
            get() {
                if (INSTANCE == null) {
                    synchronized(Repository::class.java) {
                        if (INSTANCE == null) {
                            INSTANCE = Repository()
                        }
                    }
                }
                return INSTANCE
            }
    }

}

fun showName() {
    println(Repository().formattedUserNames)
}

fun main() {
    showName()
}
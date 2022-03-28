package learn

/**
 * learn.User
 *
 * @author xujianbo
 * @date 2021/8/3 10:59 下午
 * @since 1.0.0
 */
data class User(var firstName: String, var lastName: String? = null)

val jane = User("Jane", "austin")
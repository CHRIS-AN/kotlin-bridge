package bridge.domain

import java.lang.IllegalArgumentException

enum class Path(private val pathNumber: Int, private val path: String) {
    UP(1, "U"),
    DOWN(0, "D");

    companion object {
        fun valueOf(moveNumber: Int): String {
            return when (moveNumber) {
                UP.pathNumber -> UP.path
                DOWN.pathNumber -> DOWN.path
                else -> throw IllegalArgumentException("[ERROR] 유요한 값이 없습니다.")
            }
        }
    }
}

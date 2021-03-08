import net.mamoe.kjbb.JvmBlockingBridge

@JvmBlockingBridge
class SyntheticStaticInCompanion {

    @JvmBlockingBridge
    companion object {

        @JvmStatic
        suspend fun syn() {


        }
    }
}

object A {

    @JvmBlockingBridge
    @JvmStatic
    suspend fun syn() {
    }

    @JvmBlockingBridge
    suspend fun syn1() {
    }
}

class B {
    @JvmBlockingBridge
    suspend fun syn() {
    }
}
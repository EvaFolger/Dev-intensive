package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.Utils.Utils
import ru.skillbranch.devintensive.models.BaseMessage
import ru.skillbranch.devintensive.models.Chat
import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.extentions.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun create_user(){
        val user1=User.makeUser("Alex GLaDOS")
        println(Utils.parseFullName(null))
        val user3=User(lastVisit = Date().add(2,TimeUnit.HOUR),lastName = null,firstName = null,id="12")
println(user3.lastVisit)
    }
    @Test
    fun data_map(){
        val user3=User(lastVisit = Date().add(-30,TimeUnit.SECOND),lastName = null,firstName = null,id="12")
        val user2=User.makeUser("Gefest GL")
        val txt=BaseMessage.makeMessage(user2, Chat("1"), payload = "image",type = "image")
        println(user3.lastVisit?.humanizeDiff()!!.format("HH.MM"))
        println(Utils.toInitials("",""))

        println(Utils.toInitials("Al",""))
        println(Utils.toInitials(" ","Glados"))
        println(Utils.toInitials(null,"Glados"))
        println(truncate("   ", 18))
        println("<?/&fej^%>bjh".stripHtml())
    }
}

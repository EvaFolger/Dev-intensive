package ru.skillbranch.devintensive.models

import java.util.*

data class User(val id : String,
                var firstName : String?,
                var lastName : String?,
                var avatar : String?=null,
                var rating : Int = 0,
                var respect : Int = 0,
                var lastVisit : Date? = Date(),
                var isOnline : Boolean = false) {
   // constructor(id: String,firstName: String?,lastName: String?):this(id=id, firstName = "1",lastName = "2",avatar = "3")

    companion object Factory{
        private var lastId:Int=0
        fun makeUser(fullName:String?):User{
            lastId++
            var parts:List<String>? =fullName?.split(" ")
            val firstName=parts?.get(0)
            val lastName= parts?.get(1)

       return User(id="$lastId",firstName="$firstName",lastName="$lastName") }
    }


}
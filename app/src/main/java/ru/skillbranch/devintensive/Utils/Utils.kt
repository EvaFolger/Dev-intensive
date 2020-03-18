package ru.skillbranch.devintensive.Utils

object Utils {
    fun parseFullName(fullName: String?):Pair<String?,String?>{
        var parts:List<String>? =fullName?.split(" ")
        val firstName=parts?.getOrNull(0)
        val lastName= parts?.getOrNull(1)
      return  when {
         fullName ==" "->return Pair(null,null)
         fullName==null->return Pair(null,null)
          fullName ==""->return Pair(null,null)
         parts?.getOrNull(0) is String&&parts?.getOrNull(1) is String -> return Pair(firstName, lastName)
         parts?.getOrNull(0) is String ->return Pair(firstName,null)
        else->return Pair(null,null)
  }
    }
    fun toInitials(firstName:String?,lastName:String?):String?{
when{
    firstName == "" && lastName == "" ->return null
    firstName == "" ->return lastName?.toList()?.get(0)?.toUpperCase().toString()
    lastName == "" ->return firstName?.toList()?.get(0)?.toUpperCase().toString()
}
    var chars1 = firstName?.toList()
    var chars2 = lastName?.toList()
    var initials1 = chars1?.get(0)?.toUpperCase()
    var initials2 = chars2?.get(0)?.toUpperCase()
    var init = initials1?.toString() + initials2?.toString()
    when {
        initials1?.toString() == " " && initials2?.toString() == " " -> return null
        initials2?.toString() == " " -> return initials1.toString()
        initials1?.toString() == " " -> return initials2.toString()
        initials2?.toString() == "" || initials2?.toString() == null -> return initials1.toString()
        initials1?.toString() == "" || initials1?.toString() == null -> return initials2.toString()
        initials1 != null && initials2 != null -> return init
        else -> return null
    }}
    fun transliteration(payload: String, divider:String=" "): String?{
        var fullName:List<String> =payload.split(" ")
        var res = ""
        for(word: String in fullName) {
            var sub = ""
            val charArray = word.toCharArray()
            for(ch:Char in charArray.iterator()) {
                val char = when(ch) {
                    'а' -> "a";'б' -> "b";'в' -> "v";'г' -> "g";'д' -> "d";'е' -> "e"
                    'ё' -> "e"
                    'ж' -> "zh"
                    'з' -> "z"
                    'и' -> "i"
                    'й' -> "i"
                    'к' -> "k"
                    'л' -> "l"
                    'м' -> "m"
                    'н' -> "n"
                    'о' -> "o"
                    'п' -> "p"
                    'р' -> "r"
                    'с' -> "s"
                    'т' -> "t"
                    'у' -> "u"
                    'ф' -> "f"
                    'х' -> "h"
                    'ц' -> "c"
                    'ч' -> "ch"
                    'ш' -> "sh"
                    'щ' -> "sh'"
                    'ъ' -> ""
                    'ы' -> "i"
                    'ь' -> ""
                    'э' -> "e"
                    'ю' -> "yu"
                    'я' -> "ya"

                    'А' -> "A"
                    'Б' -> "B"
                    'В' -> "V"
                    'Г' -> "G"
                    'Д' -> "D"
                    'Е' -> "E"
                    'Ё' -> "E"
                    'Ж' -> "Zh"
                    'З' -> "Z"
                    'И' -> "I"
                    'Й' -> "I"
                    'К' -> "K"
                    'Л' -> "L"
                    'М' -> "M"
                    'Н' -> "N"
                    'О' -> "O"
                    'П' -> "P"
                    'Р' -> "R"
                    'С' -> "S"
                    'Т' -> "T"
                    'У' -> "U"
                    'Ф' -> "F"
                    'Х' -> "H"
                    'Ц' -> "C"
                    'Ч' -> "Ch"
                    'Ш' -> "Sh"
                    'Щ' -> "Sh'"
                    'Ъ' -> ""
                    'Ы' -> "I"
                    'Ь' -> ""
                    'Э' -> "E"
                    'Ю' -> "Yu"
                    'Я' -> "Ya"
                    else -> ch.toString()
                }
                sub = "$sub$char"
            }
            if(res.isNotEmpty()) res = "$res$divider$sub"
            else res = "$res$sub"
        }

        return res
    }

    }



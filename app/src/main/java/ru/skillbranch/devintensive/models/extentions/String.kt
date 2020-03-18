package ru.skillbranch.devintensive.models.extentions

fun truncate(str:String,quantity:Int=16):String{
    var arrayOfChar: List<Char> =str.toList()
   var total2=""
    for(charr:Char in arrayOfChar) {
        var i = 0
        var total = ""
        while (i <= quantity - 2 && i <= arrayOfChar.size-1) {
            total = "$total${arrayOfChar.get(i)}"
           i++
        }
       total2 = "$total"
    }
    return total2.trim()+"..."
}
fun String.stripHtml(): String {
  var str = this
    str = str.replace(Regex("<.*?>"), "")
    str = str.replace(Regex("&.*?;"), "")
    str = str.replace(Regex("\\s+"), " ")
    return str
}
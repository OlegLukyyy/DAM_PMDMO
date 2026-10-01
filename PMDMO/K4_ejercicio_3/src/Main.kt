fun name(a: Any?): String = when (a) {
    null -> "Nothing"
    1, 2, 3 -> "Small number"
    7, 13 -> "Magic number"
    in 4..100 -> "Big number"
    is String -> "String"
    is Int, is Long -> "Integer"
    else -> "No idea"
}

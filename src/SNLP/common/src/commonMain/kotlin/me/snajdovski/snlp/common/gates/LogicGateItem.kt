package me.snajdovski.snlp.common.gates


data class GateItem(val id: Int, val name: String, val a:Int,val b:Int )

val gates = listOf(
    GateItem(1, "AND", 1,1),
    GateItem(2, "OR", 1,0),
    GateItem(3, "NOT", 0,0),
)
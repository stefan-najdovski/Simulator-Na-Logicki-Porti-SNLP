package me.snajdovski.snlp.common

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun App() {
    val text = "Симулатор на Логички Порти"
    nameOfProgramtextWithSize(text,30.sp)
}


@Composable
fun nameOfProgramtextWithSize(label : String, size : TextUnit) {
    Text(label, fontSize = size)
}

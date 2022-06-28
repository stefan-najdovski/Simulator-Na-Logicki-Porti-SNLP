package me.snajdovski.snlp.common

import andGateLogic
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun appSNLP() {
    val text = "Симулатор на Логички Порти"
   // nameOfProgramtextWithSize(text,30.sp)
    //test and gate
    val inputsForGate: Pair<Int, Int> = Pair(1,1)
    val firstInputVal = inputsForGate.first
    val secndInputVal = inputsForGate.second
    val resultAndGateTest = andGateLogic(1,1)
    printTextInWindow(1, "$firstInputVal and $secndInputVal =$resultAndGateTest",30.sp)
}




@Composable
fun nameOfProgramtextWithSize(label : String, size : TextUnit) {
    Text(label, fontSize = size)
}
@Composable
fun printTextInWindow(id:Int, label: String, size: TextUnit){
    Row(modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement  =  Arrangement.SpaceEvenly) {
        Text(label, fontSize = size)
    }
}

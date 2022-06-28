fun andGateLogic(a:Int, b:Int): Boolean {
    return if((a<2 && a>-1)&&(b<2 && b>-1)){
        val result = a*b
        if(result == 1)
            return true
        else
            return false
    }else {
        println("WARNING Gates Logic can be 0 or 1 not other int")
       return false
    }
}
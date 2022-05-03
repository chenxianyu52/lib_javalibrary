package com.xianyu.javalibrary.utils

import org.junit.Assert.*
import org.junit.Test

class NumberUtilsTest{
    @Test
    fun `test keepPrecision string number precision 3`(){
        assertEquals(NumberUtils.keepPrecision("3.14159",3),"3.142")
    }
}
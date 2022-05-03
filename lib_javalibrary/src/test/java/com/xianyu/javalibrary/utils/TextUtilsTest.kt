package com.xianyu.javalibrary.utils

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class TextUtilsTest{
    @Test
    fun `test string is null`(){
        assertTrue(TextUtils.isEmpty(null))
    }

    @Test
    fun `test string is "" `(){
        assertTrue(TextUtils.isEmpty(""))
    }

    @Test
    fun `test string is not null `(){
        assertFalse(TextUtils.isEmpty("djfid"))
    }
}
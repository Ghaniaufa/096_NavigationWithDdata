package com.example.eslilin

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun HalamanForm(
    onSubmitButtonClick: (MutableList<String>) -> Unit
){
    var namaTxt by remember{
        mutableStateOf("")
    }
    var alamatTxt by remember{
        mutableStateOf("")
    }
    var telponTxt by remember{
        mutableStateOf("")
    }
}
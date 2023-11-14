package com.example.eslilin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eslilin.ui.theme.EsLilinTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(
    onSubmitButtonClick: (MutableList<String>) -> Unit,
    onBackButtonClick: (MutableList<String>) -> Unit,
) {
    var namaTxt by remember {
        mutableStateOf("")
    }
    var telponTxt by remember {
        mutableStateOf("")
    }
    var alamatTxt by remember {
        mutableStateOf("")
    }
    var listDataTxt: MutableList<String> = mutableListOf(namaTxt,alamatTxt,telponTxt)


    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ){
        OutlinedTextField(value = namaTxt, onValueChange = {
            namaTxt = it
        }, label = {
            Text(text = "Nama")
        })
        OutlinedTextField(value = alamatTxt, onValueChange = {
            alamatTxt = it
        }, label = {
            Text(text = "alamat")
        })
        OutlinedTextField(value = telponTxt, onValueChange = {
            telponTxt = it
        }, label = {
            Text(text = "No Telfon")
        })
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = {onSubmitButtonClick(listDataTxt)}) {
            Text(text = stringResource(id = R.string.btn_submit))
        }
        Button(onClick = {onBackButtonClick(listDataTxt)}) {
            Text(text = stringResource(id = R.string.btn_back))
        }
    }
}

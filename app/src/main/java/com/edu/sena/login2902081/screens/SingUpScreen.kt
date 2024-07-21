package com.edu.sena.login2902081.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.edu.sena.login2902081.R
import com.edu.sena.login2902081.componets.HeadingTextComponent
import com.edu.sena.login2902081.componets.MyTextField
import com.edu.sena.login2902081.componets.NormalTextComponent

@Composable
fun SingUpScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.Hello))
            HeadingTextComponent(value = stringResource(id = R.string.create))

            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(
                labelValue = stringResource(id = R.string.name),
                painterResource(id = R.drawable.person_24px)
            )
            MyTextField(
                labelValue = stringResource(id = R.string.lastName),
                painterResource(id = R.drawable.person_24px)
            )
            MyTextField(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.mail_24px)
            )
        }//Colum

    }//Surface
}//SingUpScreen

@Preview(showBackground = true)
@Composable
fun SignScreenPreview() {
    SingUpScreen()
}
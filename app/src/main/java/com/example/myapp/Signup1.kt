package com.example.myapp

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Create
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material.icons.sharp.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.MyAppTheme

class Signup1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Signupform1()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Signupform1() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xFFFBDEBC))) {


    }

    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val Firstname = remember { mutableStateOf(TextFieldValue()) }
        val Lastname = remember { mutableStateOf(TextFieldValue()) }
        val Email = remember { mutableStateOf(TextFieldValue()) }
        val Username = remember { mutableStateOf(TextFieldValue()) }
        val Password = remember { mutableStateOf(TextFieldValue()) }
        val Confirmpassword = remember { mutableStateOf(TextFieldValue()) }

        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "CREATE YOUR ACCOUNT",
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.ExtraBold)
        Spacer(modifier = Modifier.height(50.dp))


        OutlinedTextField(modifier = Modifier,
            shape = RoundedCornerShape(27.dp),
            label = { Text (text = "Firstname") },
            leadingIcon = { Icon(Icons.Filled.Face, contentDescription = null )},
            value = Firstname.value,
            onValueChange = { Firstname.value = it })

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            shape = RoundedCornerShape(27.dp),
            label = { Text(text = "Lastname") },
            leadingIcon = { Icon(Icons.Filled.Face, contentDescription = null )},
            value = Lastname.value,
            onValueChange = { Lastname.value = it })

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(modifier = Modifier,
            shape = RoundedCornerShape(27.dp),
            label = { Text (text = "Email") },
            leadingIcon = { Icon(Icons.Filled.Email, contentDescription = null )},
            value = Email.value,
            onValueChange = { Email.value = it })

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(modifier = Modifier,
            shape = RoundedCornerShape(27.dp),
            label = { Text (text = "Username") },
            leadingIcon = { Icon(Icons.Outlined.Face, contentDescription = null )},
            value = Username.value,
            onValueChange = { Username.value = it })
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            shape = RoundedCornerShape(27.dp),
            label = { Text(text = "Password") },
            value = Password.value,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            leadingIcon = { Icon(Icons.Filled.Info, contentDescription = null )},
            onValueChange = { Password.value = it })
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            shape = RoundedCornerShape(27.dp),
            label = { Text(text = "Confirm Password") },
            visualTransformation = PasswordVisualTransformation(),
            leadingIcon = { Icon(Icons.Filled.Info, contentDescription = null )},
            value = Confirmpassword.value,
            onValueChange = { Confirmpassword.value = it })

        Spacer(modifier = Modifier.height(60.dp))

        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
//                Text(text = "Submit")
                Icon(
                    painter = painterResource(id = R.drawable.save),
                    contentDescription = null
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

    }
}
@Preview(showBackground = true)
@Composable
fun Signupform1Preview() {

    Signupform1()

}
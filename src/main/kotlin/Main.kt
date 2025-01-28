import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun Login() {
    var user by remember { mutableStateOf("") }
    var passwd by remember { mutableStateOf("") }

    MaterialTheme {
        // Cuerpo principal
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFd3d3d3))
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Título
            Text(
                text = "Log in",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                color = Color(0xFF333333)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Caja del formulario
            Box(
                modifier = Modifier
                    .width(400.dp)
                    .padding(16.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.White)
                    .padding(24.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedTextField(
                        value = user,
                        onValueChange = { user = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text("Usuario") }
                    )
                    OutlinedTextField(
                        value = passwd,
                        onValueChange = { passwd = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text("Contraseña") }
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {

                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(text = "Iniciar sesión", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Login",
        state = rememberWindowState(width = 500.dp, height = 600.dp)
    ) {
        Login()
    }
}

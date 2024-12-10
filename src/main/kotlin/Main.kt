import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import kotlin.math.round

@Composable
fun App() {
    Column {
        // Titulo
        Row(modifier = Modifier.fillMaxWidth().padding(10.dp)){
            Text(
                text = "Pistagrom",
                modifier = Modifier,
                fontSize = 40.sp,
                fontWeight =  FontWeight.Bold,
                fontFamily = FontFamily.Cursive
            )
        }
        Divider(color = Color.Gray, thickness = 1.dp)
        // Historias
        Row(modifier = Modifier.fillMaxWidth().padding(10.dp)){
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Historias",
                        modifier = Modifier,
                        fontSize = 30.sp,
                        fontWeight =  FontWeight.Bold
                    )
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    users.forEach { user ->
                        Box(modifier = Modifier.padding(12.dp)){
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Image(painterResource(
                                    resourcePath = user.image),
                                    contentDescription = "Profile",
                                    modifier = Modifier.width(65.dp).clip(CircleShape)
                                )
                                Text(text = user.name)
                            }
                        }
                    }
                }
            }
        }
        // 2 Columnas
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            // Publicaciones
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),

            ) {
                Row(modifier = Modifier.padding(10.dp)) {
                    Text(
                        text = "Publicaciones",
                        modifier = Modifier,
                        fontSize = 30.sp,
                        fontWeight =  FontWeight.Bold
                    )
                }
                Row {
                    Box(modifier = Modifier.padding(20.dp).fillMaxSize()){
                        Column(verticalArrangement = Arrangement.Center,) {
                            publications.forEach{ publication ->
                                Box(modifier = Modifier
                                    .padding(bottom = 15.dp)
//                                    .shadow(
//                                        elevation = 2.dp,
//                                        shape = RoundedCornerShape(5.dp)
//                                    )
                                ){
                                    Column() {
                                        Row(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
                                            Image(painterResource(
                                                resourcePath = publication.image),
                                                contentDescription = "Profile",
                                                modifier = Modifier.width(45.dp).clip(CircleShape)
                                            )
                                            Text(publication.name, modifier = Modifier)
                                        }
                                        Row(modifier = Modifier.padding(10.dp)) {
                                            Image(painterResource(
                                                resourcePath = publication.imagePublication),
                                                contentDescription = "Publication",
                                                modifier = Modifier.width(350.dp)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            // Sugerencias
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {
                    Text(
                        text = "Historias",
                        modifier = Modifier.padding(10.dp),
                        fontSize = 30.sp,
                        fontWeight =  FontWeight.Bold
                    )
                }
                Row {

                }

            }
        }
    }
}
fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Pistagrom",
        state = rememberWindowState(width = 1000.dp, height = 1000.dp)
    ) {
        App()
    }
}
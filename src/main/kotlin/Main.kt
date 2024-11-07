import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun App() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(10.dp)
    ){
        Image(
            painter = painterResource(resourcePath = logo_title),
            modifier = Modifier.width(200.dp),
            contentDescription = "Logo"
        )
    }
}
fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Pistagrom",
        state = rememberWindowState(width = 800.dp, height = 800.dp)
    ) {
        App()
    }
}
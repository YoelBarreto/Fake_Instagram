//import androidx.compose.animation.core.animateDecay
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.Paint
//import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.unit.TextUnit
//import androidx.compose.ui.unit.TextUnitType
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.window.Window
//import androidx.compose.ui.window.application
//import androidx.compose.ui.window.rememberWindowState
//import kotlin.math.round
//
//
//@Composable
//fun App2() {
//    Row() {
//        NavigationRail {
//            items.forEach { item ->
//                NavigationRailItem(
//                    icon = {
//                        Icon(
//                            contentDescription = item.second.name,
//                            imageVector = item.second
//                        )
//                    },
//                    label = { Text(item.first) },
//                    selected = false,
//                    onClick = {  }
//                )
//            }
//        }
//        Column(
//            modifier = Modifier.padding(start = 15.dp, end = 15.dp)
//        ) {
//            message.forEach { message ->
//                Card(
//                    modifier = Modifier.size(width = 400.dp, height = 120.dp).padding(top = 15.dp),
//                    backgroundColor = Color.DarkGray,
//                    elevation = 10.dp,
//                    contentColor = Color.White
//                ){
//                    Row (
//                        modifier = Modifier.padding(10.dp)
//                    ) {
//                        Image(
//                            painter = painterResource(resourcePath = message.image),
//                            contentDescription = "Foto",
//                            modifier = Modifier.clip(CircleShape)
//                        )
//                        Column (
//                            modifier = Modifier.padding(start = 10.dp)
//                        ) {
//                            Text(message.name)
//                            Text(modifier = Modifier.padding(top = 5.dp), text = message.message)
//                        }
//                    }
//                }
////                Text(message.message)
//            }
//        }
//        Column(
//            modifier = Modifier.padding(10.dp).fillMaxSize()
//        ) {
//            Text(
//                text = "Form",
//                modifier = Modifier.padding(top = 10.dp),
//                fontSize = TextUnit(value = 20f, type = TextUnitType.Sp),
//            )
//            OutlinedTextField(
//                value = "Tu mama",
//                onValueChange = { },
//                placeholder = {Text("Type name")},
//                label = { Text("name")},
//                modifier = Modifier.padding(top = 10.dp).fillMaxWidth()
//            )
//            OutlinedTextField(
//                value = body,
//                onValueChange = { },
//                placeholder = {Text("Type body")},
//                label = { Text("text")},
//                modifier = Modifier.padding(top = 10.dp).fillMaxSize().weight(1f)
//            )
//            Button(onClick = {  }, modifier = Modifier.padding(top = 10.dp).fillMaxWidth()){
//                Text("Send")
//            }
//        }
//    }
//
//    NavigationRail {
//        items.forEachIndexed { index, item ->
//            NavigationRailItem(
//                icon = {
//                    Icon(
//                        contentDescription = item.second.name,
//                        imageVector = item.second
//                    )
//                },
//                label = { Text(item.first) },
//                selected = false,
//                onClick = {  }
//            )
//        }
//    }
//}
//
//fun main2() = application {
//    Window(
//        onCloseRequest = ::exitApplication,
//        title = "Tarea 1",
//        state = rememberWindowState(width = 1000.dp, height = 800.dp)
//    ) {
//        App()
//    }
//}

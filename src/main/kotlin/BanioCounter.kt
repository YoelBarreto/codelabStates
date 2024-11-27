import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BanioCounter() {
    var baniosContador by rememberSaveable() { mutableStateOf(0) }
    Column {
        if (baniosContador > 0){
            val baniosTexto = if (baniosContador == 1 ) "vez" else "veces"
            Text("Has ido al baño ${baniosContador} ${baniosTexto}")
        }
        Row {
            Button(
                onClick = {
                    baniosContador++
                },
                modifier = Modifier.padding(start = 5.dp, end = 5.dp)
            ) {
                Text("Ir al baño")
            }
            Button(
                onClick = {
                    baniosContador = 0
                }
            ) {
                Text("Reiniciar contador")
            }
        }
    }
}
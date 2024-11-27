import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable

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
                }
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
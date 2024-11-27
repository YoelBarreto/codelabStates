import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier


data class WellnessTask(val id: Int, val label: String)

fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $1")}


@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    listaItems: List<WellnessTask> = remember { getWellnessTasks() }
) {
    LazyColumn(
        state = rememberLazyListState()
    ) {
        items(listaItems) {
            WellnessTaskItem(it.label, {})
        }
    }
}
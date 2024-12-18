import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: EjemploViewModel = viewModel()
) {
    WellnessTaskList(
        list = wellnessViewModel.tasks,
        onCheckedTask = { task, checked ->
            wellnessViewModel.changeTaskChecked(task, checked)
        },
        onCloseTask = { task ->
            wellnessViewModel.remove(task)
        }
    )
}
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import me.snajdovski.snlp.common.App


fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Симулатор на Логички Порти") {
        App()
    }
}

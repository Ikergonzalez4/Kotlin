package ikergc.taskmanager

data class Todo(
    val title: String,
    var isChecked: Boolean = false
)
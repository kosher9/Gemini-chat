package com.github.kosher9.geminitextmodel.chat

import androidx.compose.runtime.Composable
import java.util.UUID

enum class Participant {
    USER, MODEL
}
data class ChatMessage(
    val id: String = UUID.randomUUID().toString(),
    var text: String = "",
    val participant: Participant = Participant.USER,
)
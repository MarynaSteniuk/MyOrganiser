package ua.steniuk.myorganiser

import ua.steniuk.myorganiser.data.about.Platform

class Greeting {
    // Тепер ми створюємо екземпляр твого нового класу Platform()
    private val platform = Platform()

    fun greet(): String {
        // Замість старого .name використовуємо твій новий .osName
        return "Hello, ${platform.osName}!"
    }
}
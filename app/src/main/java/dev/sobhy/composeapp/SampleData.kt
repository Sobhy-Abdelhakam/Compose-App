package dev.sobhy.composeapp
data class Message(val author: String, val body: String, val Image: Int)

object SampleData {
    // Sample conversation data
    val conversationSample = listOf(
        Message(
            "Sobhy",
            "this is the first message",
            R.drawable.profile_pic
        ),
        Message(
            "Mohamed",
            "this is the second message",
            R.drawable.user
        ),
        Message(
            "Ahmed",
            "this is the third message",
            R.drawable.user
        ),
        Message(
            "Ebrahim",
            "this is the fourth message",
            R.drawable.user
        ),
        Message(
            "Mostafa",
            "this is the fifth message",
            R.drawable.user
        ),
        Message(
            "Hazem",
            """Hey, take a look at Jetpack Compose, it's great!
            |It's the Android's modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""".trim(),
            R.drawable.user
        ),
        Message(
            "Alaa",
            "It's available from API 21+ :)",
            R.drawable.user
        ),
        Message(
            "Yasmin",
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?",
            R.drawable.user
        ),
        Message(
            "Nada",
            "Android Studio next version's name is Arctic Fox",
            R.drawable.user
        ),
        Message(
            "Amira",
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^",
            R.drawable.user
        ),
        Message(
            "laila",
            "I didn't know you can now run the emulator directly from Android Studio",
            R.drawable.user
        ),
        Message(
            "Yara",
            "Compose Previews are great to check quickly how a composable layout looks like",
            R.drawable.user
        ),
        Message(
            "Mariam",
            "Previews are also interactive after enabling the experimental setting",
            R.drawable.user
        ),
        Message(
            "Amal",
            "Have you tried writing build.gradle with KTS?",
            R.drawable.user
        ),
    )
}

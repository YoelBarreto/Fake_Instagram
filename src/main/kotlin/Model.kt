
data class Account(val name: String , val image: String)
data class Publication(val imagePublication: String)

val users = listOf<Account>(
    Account("perez_toledo", "img1.jpeg"),
    Account("iris_piña", "img2.jpeg"),
    Account("tumama123","img3.jpeg"),
    Account("felipe1923", "img4.jpeg"),
    Account("ortfrutas", "img5.jpeg"),
    Account("memes_daily", "img6.jpeg"),
    Account("jijopureto10", "img7.jpeg"),
)

val publications = listOf<Publication>(
    Publication("publish1.jpeg"),
    Publication("publish2.jpeg")
)


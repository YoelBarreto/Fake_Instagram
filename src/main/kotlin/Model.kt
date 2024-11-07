import androidx.compose.material.icons.Icons

data class Message(val name: String, val message: String, val image: String)

val body = "Lorem ipsum dolor sit amet consectetur adipiscing elit erat nibh, metus tempor blandit mus at platea magnis cum quis, habitant iaculis cubilia nunc eu purus eleifend taciti. Duis sapien eu natoque scelerisque congue per massa magna aliquet litora, volutpat tellus dictumst tortor egestas ad leo class pretium porttitor nec, odio rutrum elementum erat penatibus luctus sem cum vivamus. Imperdiet aenean nibh habitasse aliquam ad nisl risus suspendisse, arcu ut erat at fames nascetur hac augue, semper maecenas a vulputate est tortor elementum. Enim maecenas semper dapibus donec at taciti facilisi posuere blandit habitasse, aliquet primis pellentesque parturient hendrerit inceptos curae molestie quisque. Tortor elementum facilisis cum est montes primis phasellus maecenas, hac morbi himenaeos facilisi penatibus varius non urna arcu, pretium curae turpis aliquam in senectus hendrerit."

val message = listOf<Message>(
    Message("Antoñita Paledo", body, "img1.jpeg"),
    Message("Maria Dolores", body, "img2.jpeg"),
    Message("Alfredo Pedo", body, "img3.jpeg"),
)

val logo_title = "Instagram_title.png"

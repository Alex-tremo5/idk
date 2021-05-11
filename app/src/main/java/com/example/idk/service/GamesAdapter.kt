import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.idk.R
import com.example.idk.data.DogamiGameResult

class GamesAdapter(val context: Context?, data: List<DogamiGameResult>) :
    RecyclerView.Adapter<GamesAdapter.ViewHolder>() {

    private val itemsList: List<DogamiGameResult> = data

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.view_service, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val game = itemsList[position]

        Glide.with(holder.gameImage)
            .load(game.imageUrl)
            .centerCrop()
            .into(holder.gameImage)
        holder.gameValue.text = game.name
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var gameImage: ImageView = itemView.findViewById(R.id.imageViewService)
        var gameValue: TextView = itemView.findViewById(R.id.textViewService)
    }
}
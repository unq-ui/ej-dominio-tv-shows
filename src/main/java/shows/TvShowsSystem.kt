package shows

class TvShowsSystem {
    val tvShows = mutableListOf<TvShow>()

    fun addTvShow(tvShow: TvShow?) {
        if (tvShow == null) return
        tvShows.add(tvShow)
    }

    fun removeActorFromTvShow(actor: Actor?, tvShow: TvShow?) {
        if (actor == null || tvShow == null) return
        tvShows.firstOrNull { it.actors.contains(actor) }?.removeActor(actor)
    }

    fun removeTvShow(tvShow: TvShow?) = tvShows.remove(tvShow)

    fun searchTvShow(text: String) =
            tvShows.firstOrNull { it.name.toLowerCase().contains(text.toLowerCase()) }

    fun removeTvShowById(id: Int) = tvShows.removeIf { it.id == id }
}

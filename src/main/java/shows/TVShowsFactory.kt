package shows

/**
 * This object retrieve an instance of TvShowsSystem with some data
 */
object TvShowsFactory {
    private val system = TvShowsSystem()
    init {
        system.addTvShow(makeBreakingBad())
        system.addTvShow(makeGameOfThrones())
        system.addTvShow(makeVikings())
    }
    fun makeTvShowsSystem() = system

    private fun makeBreakingBad(): TvShow {
        val tvShow = TvShow(id = 1, name = "Breaking Bad", seasons = 5)
        tvShow.addActor(Actor("Bryan Cranston", "Walter White", tvShow))
        tvShow.addActor(Actor("Aaron Paul", "Jesse Pinkman", tvShow))
        tvShow.addActor(Actor("Bob Odenkirk", "Saul Goodman", tvShow))
        return tvShow
    }

    private fun makeGameOfThrones(): TvShow {
        val tvShow = TvShow(id = 2, name = "Game of Thrones", seasons = 7)
        tvShow.addActor(Actor("Kit Harington","Jon Snow", tvShow))
        tvShow.addActor(Actor("Emilia Clarke","Daenerys Targaryen", tvShow))
        tvShow.addActor(Actor("Lena Headey","Cersei Lannister", tvShow))
        return tvShow
    }

    private fun makeVikings(): TvShow {
        val tvShow = TvShow(id = 3, name = "Vikings", seasons = 5)
        tvShow.addActor(Actor("Travis Fimmel","Ragnar Lothbrok", tvShow))
        tvShow.addActor(Actor("Katheryn Winnick","Lagertha", tvShow))
        tvShow.addActor(Actor("Alexander Ludwig","Björn Lothbrok", tvShow))
        return tvShow
    }
}

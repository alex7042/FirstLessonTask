data class MatchPointsData(
    val firstTeamPoints: Int,
    val secondTeamPoints: Int
) {
    override fun toString() = "$firstTeamPoints : $secondTeamPoints"
}
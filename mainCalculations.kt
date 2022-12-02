import kotlin.math.abs

val allMatchesArray = arrayListOf<MatchPointsData>()
const val numberOfMatches = 10

fun main() {
    addMatchPoints()
    deleteSamePointTeams()
    maxPointDifference()
}

fun addMatchPoints() {
    var index = 0
    println("Результаты всех матчей:")
    while (index < numberOfMatches) {
        allMatchesArray.add(
            MatchPointsData(
                (0..5).random(),
                (0..5).random()
            )
        )
        println(allMatchesArray[index])
        index++
    }
}

fun deleteSamePointTeams() {
    println("Матчи без ничьих:")
    for ((firstTeamPoints, secondTeamPoints) in allMatchesArray) {
        if (firstTeamPoints == secondTeamPoints) continue
        println("$firstTeamPoints : $secondTeamPoints")
    }
}

fun maxPointDifference() {
    val allMatchesSet = allMatchesArray.toSet()
    val differencesSet = mutableSetOf<Int>()
    for ((firstTeamPoints, secondTeamPoints) in allMatchesSet) {
        val difference = abs(firstTeamPoints - secondTeamPoints)
        differencesSet.add(difference)
    }
    println("Наибольшая разнца по очкам в матчах:")
    val maxValue = differencesSet.max()
    for ((firstTeamPoints, secondTeamPoints) in allMatchesSet) {
        val difference = abs(firstTeamPoints - secondTeamPoints)
        if (difference == maxValue) {
            println("$firstTeamPoints : $secondTeamPoints")
        }
    }
}
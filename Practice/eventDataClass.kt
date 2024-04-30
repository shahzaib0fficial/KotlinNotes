data class EventInfo (
    val title: String,
    val description: String? =null,
    val dayPart: Daypart,
    val duration: Int
)

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

val EventInfo.eventDuration: String
    get() = if (this.duration < 60) {
        "Short"
    }
    else{
        "Long"
    }

fun main() {
    val Event = mutableListOf<EventInfo>()
    Event.add(EventInfo("Wake up", "Time to get up", Daypart.MORNING,0))
    Event.add(EventInfo(title = "Practice Compose", dayPart = Daypart.AFTERNOON, duration = 60))
    Event.add(EventInfo("Learn about Kotlin", dayPart =  Daypart.AFTERNOON, duration =  30))
    Event.add(EventInfo("Study Kotlin","Commit to studying Kotlin at least 15 minutes per day.",Daypart.EVENING,15))

    val groupByTime = Event.groupBy { it.dayPart }

    groupByTime.forEach { (dayPart,event) ->
        println("${dayPart}: ${event.size} events")
    }

    if(Event.isNotEmpty()) {
        println(Event.last().title)
    }

    Event.forEach {
        println("${it.title} is ${it.eventDuration} Event")
    }
}
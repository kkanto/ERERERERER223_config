 
listView('ERERERERER223 Jobs') {
    description('ERERERERER223 Jobs')
    jobs {
        regex('ERERERERER223_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
